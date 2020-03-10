import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest {

    public static void main(String[] args) {
        String baseUrl = ""
        System.setProperty("webdriver.gecko.driver", "drivers/geckodrover.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.close();
        driver.quit();
    }

}
