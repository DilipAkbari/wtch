package homeworkmarch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
    private WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void varifyUserRegister() throws InterruptedException {
        WebElement register;
        register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        WebElement welcome = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        String expectedText = "Your Personal Details";
        String actualText = welcome.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void varifyUserShouldRegisterSuccesfully() throws InterruptedException {
        WebElement register;
        register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        Thread.sleep(3000);

        WebElement gender;
        gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Dilip");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Akbari");

        WebElement daySelect = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        daySelect.sendKeys("1");

        WebElement monthSelect = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        monthSelect.sendKeys("January");

        WebElement yearSelect = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        yearSelect.sendKeys("1910");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmail.sendKeys("akb@123.gmail.com");


        WebElement companyName = driver.findElement((By.xpath("//input[@id='Company']")));
        companyName.sendKeys("ABC & Co.");

        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        newsLetter.click();
        Thread.sleep(4000);

        WebElement enterPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        enterPassword.sendKeys("akb123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("akb123");

        WebElement confirmRegister = driver.findElement(By.xpath("//input[@id='register-button']"));
        confirmRegister.click();

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
      //  driver.quit();
    }

}


