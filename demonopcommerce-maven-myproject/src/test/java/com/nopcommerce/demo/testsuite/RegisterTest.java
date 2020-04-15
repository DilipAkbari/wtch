package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    String email = null;
    String password = "Abc@123";

    HomePage homePage = new HomePage();
    RegisterPage registerpage = new RegisterPage();


    @BeforeTest
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";


    }

    @Test
    // useing object of Homepage and  action on it
    public void varifyUserShouldRegisterSuccessfully() throws InterruptedException {
        // click on register link on Homepage
        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        //seleck Male gender radio button
        registerpage.clickOngenderRedioButton();
        //send text to first Name field
        registerpage.enterFirstName("DB");
        //send text to Namefield
        registerpage.enterLastName("AKB");
        //send text to DOB field
        registerpage.enterDateField("2");
        //send text from drop down Menu
        registerpage.enterMonthField("January");
        //send text to Yearfield
        registerpage.enterYearField("2001");
        //send text to email field
        registerpage.enterEmailId(email);
        //send text to CompanyName
        registerpage.enterCompanyName("ABC");
        //send text to Password
        registerpage.enterPassword(password);
        //send text to Enterpassword
        registerpage.enterConformPassword(password);
        //send text to EnterconformPassword
        registerpage.clickOnRegisterButton();
        //click on Register Button
        registerpage.assertRegisterCompletedText();

    }

}



