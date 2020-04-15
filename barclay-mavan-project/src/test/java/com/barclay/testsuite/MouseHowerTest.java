package com.barclay.testsuite;

import com.barclay.pages.HomePage;
import com.barclay.testbase.TestBase;
import org.testng.annotations.Test;

public class MouseHowerTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test (priority = 0,groups = {"Sanity","Regression"})
    public void varifyUserShouldNotClickToBorrow(){
        homePage.mouseHowerbankDropdownLink();
        homePage.mouseHowerborrowDropdownLink();


    }

}
