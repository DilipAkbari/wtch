package com.bank.testsuite;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.HomePage;
import com.bank.testbase.TestBase;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    @Test
    public void vafityCustomerAddedSuccessfully() {
        homePage.clickOnbankManagerLogin();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Dilip");
        addCustomerPage.enterLastName("Akb");
        addCustomerPage.postCode("HHH BBB");
        addCustomerPage.addToCustomer();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnAddCustomerTab();
        homePage.clickOnbankManagerLogin();
    }
}