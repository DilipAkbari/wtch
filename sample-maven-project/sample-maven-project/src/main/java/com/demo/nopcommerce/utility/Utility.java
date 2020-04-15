package com.demo.nopcommerce.utility;

import com.demo.nopcommerce.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utility extends BasePage {

    private JavascriptExecutor jse;


    // Method for click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnButton(By by) {
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
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
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

    /**
     * This method will take screen shot
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerce/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    // public static String takeScreenShot(String fileName) {
    //     String filePath = System.getProperty("user.dir") + "/target/surefire-reports/html/";
    //    TakesScreenshot screenshot = (TakesScreenshot) driver;
    //     File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
    //    String imageName = fileName + currentTimeStamp() + ".jpg";
    //     String destination = filePath + imageName;
    //    try {
    //      FileUtils.copyFile(scr1, new File(destination));
    //    } catch (IOException e) {
    //      e.printStackTrace();
    //      }
    //   return destination;


    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "\\src\\main\\java\\com\\nopcommerce\\demo\\screenshot\\" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }


}







