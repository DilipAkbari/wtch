import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class Computers{
    private WebDriver driver;
    private String baseUrl = "https://demo.nopcommerce.com/";
    private JavascriptExecutor js;

    @Before
    public void openBroeser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void UserShouldNavigateToComputerPage() {
        driver.findElement(By.linkText("Computers")).click();
        WebElement assertTxt = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String expectedTxt = "Computers";
        String actualTxt = assertTxt.getText();
        Assert.assertEquals(actualTxt, expectedTxt);
    }

    @Test
    public void addProductToShoppingCart() throws InterruptedException {
        WebElement computer = driver.findElement(By.linkText("Computers"));
        computer.click();

        WebElement desktop = driver.findElement(By.linkText("Desktops"));
        desktop.click();
        js.executeScript("window.scrollBy(0,-1800);");
        Thread.sleep(3000);

        WebElement buildYourOwnComputer = driver.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]"));
        // js.executeScript("window.scrollBy(0,-1800);");
        buildYourOwnComputer.click();
        Thread.sleep(2000);

        WebElement radioButton = driver.findElement(By.id("product_attribute_3_7"));
        radioButton.click();
        Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,-1000");

        WebElement addTocart = driver.findElement(By.id("add-to-cart-button-1"));
        addTocart.click();

        WebElement assertTxt = driver.findElement(By.xpath("//p[@class='content']"));

        String expectedTxt = "The product has been added to your shopping cart";
        String actualTxt = assertTxt.getText();
        Assert.assertEquals(actualTxt, expectedTxt);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}



