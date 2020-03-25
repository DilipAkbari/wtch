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
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BooksClass {
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
    public void UserShouldNavigateToBookpage() {
        driver.findElement(By.linkText("Books")).click();
        WebElement assertTxt = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]"));
        String expectedTxt = "Books";
        String actualTxt = assertTxt.getText();
        Assert.assertEquals(actualTxt, expectedTxt);
    }

    @Test
    public void sortAToZ() {
        driver.findElement(By.linkText("Books")).click();
        WebElement assertTxt = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]"));

    }

    @Test

    public void books() throws InterruptedException {
        WebElement books = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]"));
        books.click();

        WebElement selectPosition = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(selectPosition);
        Thread.sleep(2000);
        select.selectByIndex(1);

        js.executeScript("window.scrollBy(0,1500);");
        Thread.sleep(2000);
        WebElement wishlistButton = driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[3]"));
        wishlistButton.click();
        WebElement iteamAddToWhilist = driver.findElement(By.xpath("//p[@class='content']"));
        String excepetedTxt = "The product has been added to your wishlist";
        String acctualTxt = iteamAddToWhilist.getText();
        Assert.assertEquals(excepetedTxt, acctualTxt);

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

