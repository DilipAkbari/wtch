package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utility {
    public WebDriver driver;
    private JavascriptExecutor jse;


    // Method for click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // Method for send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Method for get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Method for mouse hover(Move to element)
    public void moveToElement(By by) {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(by)).perform();
    }

    //Method for select by visible text
    public void selectByvisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Method for select by value
    public void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //Method for select by index
    public void selectByIndex(By by, int x) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(x);
    }

    //Method for implicit wait in seconds
    public void implicitWaitSeconds(int y) {
        driver.manage().timeouts().implicitlyWait(y, TimeUnit.SECONDS);
    }

    //Method for sleep
    public void sleepMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void quitMethod() {
        driver.quit();
    }

    public void closeMethod() {
        driver.close();
    }

    public void chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void openUrl(String a) {
        driver.get(a);
    }

    public void javaScriptExecuter(int x, int y) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500);");
    }

    public void selectDropDown(By by, String text) {
        WebElement productDropDown = driver.findElement(by);
    }

    public void generateRandomEmail(By by) {

        Random random = new Random();
        char c = (char) (random.nextInt(26) + 'a');
        String strEmail = c + "dilip123@gmail.com";

        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(strEmail);
    }

    // radio button selection methods
    public void radioButtonIsEnabled(By by) {
        driver.findElement(by).isEnabled();
    }

    public void radioButtonIsDisplayed(By by) {
        driver.findElement(by).isDisplayed();
    }

    public void radioButtonIsSelected(By by) {
        driver.findElement(by).isSelected();
    }

    public void radioButtonClick(By by) {
        driver.findElement(by).click();
    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    //This method will mouseHoverToElementAndClick
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }


}
