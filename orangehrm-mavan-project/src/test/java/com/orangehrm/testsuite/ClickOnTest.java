package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ClickOnTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void varifyShouldClickOnContact() {
        homePage.setContactSalesClickon();
        homePage.setFreeThirtyDayTrialClickon();

    }

}
