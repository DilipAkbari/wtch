import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFindFirstElemts {

    public static void main(String[] args) throws InterruptedException {
        String baps = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baps);
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        Thread.sleep(2000);

        WebElement userNameField = driver.findElement(By.id("Email"));
        userNameField.sendKeys("sfsfsd@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Password");

        WebElement Loginbtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        Loginbtn.click();


    }
}



