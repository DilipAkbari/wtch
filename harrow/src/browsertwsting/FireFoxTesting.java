package browsertwsting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baps = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver", "");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baps);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
