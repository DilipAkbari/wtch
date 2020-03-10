package browsertwsting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IDETesting {
    public static void main(String[] args) {
        String baps = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baps);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}

