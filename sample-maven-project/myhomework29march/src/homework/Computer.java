package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class Computer extends Utility {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBroweser() {
        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }
    @Test
    public void UserShouldNavigateToComputerPage() {
        clickOnElement(By.linkText("Computers"));
        String expectedTxt = "Computers";
        String actualTxt = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals(actualTxt, expectedTxt);
    }

    @Test
    public void addProductToShoppingCart() throws InterruptedException {
        clickOnElement(By.linkText("Computers"));
        clickOnElement(By.linkText("Desktops"));//click on desktop function
        sleepMethod();

        clickOnElement(By.linkText("Build your own computer"));

        radioButtonClick(By.id("product_attribute_3_7"));
        sleepMethod();

        clickOnElement(By.id("add-to-cart-button-1"));
        clickOnElement(By.xpath("//p[@class='content']"));
        String expectedTxt = "The product has been added to your shopping cart";
        String actualTxt = getTextFromElement(By.xpath("//p[@class='content']"));
        Assert.assertEquals(actualTxt, expectedTxt);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }
}
