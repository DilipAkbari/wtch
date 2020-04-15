package com.letskodeit.testsuite;

import com.letskodeit.pages.HomePage;
import com.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

public class ClickOnTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void varifyUserClickToPractice() {
        homePage.setLoginClickOnLink();
        homePage.setPracticeClickOnLink();
    }
}
