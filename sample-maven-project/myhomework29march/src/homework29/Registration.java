package homework29;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

import java.util.concurrent.TimeUnit;

public class Registration extends Utility {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowser() {
        chromeDriver();
        maximizeWindow();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }

    @Test
    public void UserShouldLoginSucessfullyRegister() {
        clickOnElement(By.xpath("//a[@class='ico-register']"));
        String expectedtest = "Your Personal Details";
        String actualText = getTextFromElement(By.xpath("//div[@class='title']//strong[contains(text(),'Your Personal Details')]"));
        Assert.assertEquals(expectedtest, actualText);
    }

    @Test
    public void VerfityUserSholdRegisterSucessfully() throws InterruptedException {
        sleepMethod();
        clickOnElement(By.xpath("//a[@class='ico-register']"));
        clickOnElement(By.xpath("//input[@id='gender-male']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "DD");
        sendTextToElement(By.xpath("//input[@id='LastName']"), "AKB");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"), "1");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"), "may");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"), "1910");
        generateRandomEmail(By.id("Email"));
        sendTextToElement(By.xpath("//input[@id='Company']"), "ABC & co.");
        radioButtonClick(By.xpath("//input[@id='Newsletter']"));
        sendTextToElement(By.xpath("//input[@id='Password']"), "Abc123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "Abc123");
        clickOnElement(By.xpath("//input[@name='register-button']"));
        String expectedRegText = "Your registration completed";
        //String actualRegpPage = getTextFromElement(By.xpath("//div[@class='page-body']//div[text()='Your registration completed']"));
        String actualRegpPage = (getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")));
        Assert.assertEquals(actualRegpPage, expectedRegText);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        sleepMethod();
        driver.quit();
    }
}




