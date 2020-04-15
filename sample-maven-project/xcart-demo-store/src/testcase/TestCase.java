package testcase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class TestCase extends Utility {
    String baseUrl = "https://demostore.x-cart.com/";

    @Before
    public void openBrowser() {
        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }

    @Test
    public void userShouldCreateNewAccount() throws InterruptedException {
        //Click on "Sign in/ sign up"
        clickOnElement(By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in')]"));
        //Click on "Create new account" Link
        clickOnElement(By.xpath("//a[contains(@class,'popup-button default-popup-button create-account-link')]"));
        // Enter Email
        generateRandomEmail(By.id("login"));
        // Enter password
        sendTextToElement(By.id("password"), "abc123");
        // Enter Confirm password
        sendTextToElement(By.id("password-conf"), "abc123");
        sleepMethod();
        // Click on create button
        clickOnElement(By.xpath("//span[contains(text(),'Create')]"));
        // Varify Text My account
        String expected1Text = "My account";
        String actual1Text = getTextFromElement(By.xpath("//div[@class='dropdown header_bar-my_account']"));
        Assert.assertEquals(actual1Text, expected1Text);
        //  Click on "My account" Link on right-hand side corner
        clickOnElement(By.xpath("//a[contains(text(),'My account')]"));
        //  Click on "Log out" tab
        clickOnElement(By.xpath("//ul[@class='account-links dropdown-menu']//li[@class='account-link-logoff']"));
        //  Verify "Sign in/ sign up" tab
        String actualText01 = getTextFromElement(By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in')]"));
        String expectedText01 = "Sign in / sign up";
        Assert.assertEquals(actualText01, expectedText01);
    }

    @Test
    public void userShouldLoginSuccessfully() throws InterruptedException {
        // Click on "Sign in/ sign up"
        clickOnElement(By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in')]"));
        // Enter Email (Same email address that created in first test)
        sendTextToElement(By.id("login-email"), "abc@gmail.com");
        // Enter password ( Same password as created in first test)
        sendTextToElement(By.id("login-password"), "Abc123");
        // Click on Sign in button
        clickOnElement(By.xpath("//button[contains(@class,'submit')]//span[contains(text(),'Sign in')]"));
        // Verify text "My account"
        String actualText = getTextFromElement(By.xpath("//div[@class='dropdown header_bar-my_account']"));
        String expecatedText = "My account";
        Assert.assertEquals(actualText, expecatedText);

        // Click on "My account" Link on right-hand side corner
        clickOnElement(By.xpath("//a[contains(text(),'My account')]"));
        //  Click on "Log out" tab
        clickOnElement(By.xpath("//ul[@class='account-links dropdown-menu']//li[@class='account-link-logoff']"));
        //   Verify "Sign in/ sign up" tab
        String actualText01 = getTextFromElement(By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in')]"));
        String expectedText01 = "Sign in / sign up";
        Assert.assertEquals(actualText01, expectedText01);
    }
    @After
    public void closeBrowser() {
        quitMethod();
    }
}
