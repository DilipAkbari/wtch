import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void openBrowser() {
        String baps = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baps);
    }

    @Test
    public void varifyErrorMessageWhenWrongUserNameIsEntered(){
WebElement loginlink = driver.findElement()
    }
            WebElement loginLink = driver.findElement((By.linkText("Log in"));

    @After
    public void closeBrowser() {

    }
}

