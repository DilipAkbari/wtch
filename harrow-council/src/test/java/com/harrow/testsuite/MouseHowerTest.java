package com.harrow.testsuite;

import com.harrow.pages.HomePage;
import com.harrow.testbase.TestBase;
import org.testng.annotations.Test;

public class MouseHowerTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void varifyUserShouldClickToHarrowCouncil(){
        homePage.mouseHowerharrowCouncilDropdownLink();
        homePage.mouseHowerserviceDropdownLink();

    }

}
