package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Electronics {

    private WebDriver driver;
    private String baseUrl = "https://demo.nopcommerce.com/";
    private JavascriptExecutor js;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void electronics() throws InterruptedException {
        WebElement electonics = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electonics).perform();
        //electonics.click();
        Thread.sleep(3000);
        WebElement cameraPhoto = driver.findElement(By.linkText("Camera & photo"));
        actions.moveToElement(cameraPhoto).perform();
        cameraPhoto.click();
        WebElement assertTxt = driver.findElement(By.linkText("Camera & photo"));
        String expectedTxt = "Camera & photo";
        String accutalTxt = assertTxt.getText();
        Assert.assertEquals(accutalTxt, expectedTxt);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}