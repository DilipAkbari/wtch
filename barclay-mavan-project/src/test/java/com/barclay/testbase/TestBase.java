package com.barclay.testbase;

import com.barclay.basepage.BasePage;
import com.barclay.browserselector.BrowserSelector;
import com.barclay.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String baseurl = loadProperty.getProperty("baseurl");
    String browser = loadProperty.getProperty("browser");


    @BeforeMethod(groups = {"Sanity", "Regression"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseurl);
    }

    @AfterMethod(groups = {"Sanity", "Regression"})
    public void tearDown() {
        driver.quit();


    }

}