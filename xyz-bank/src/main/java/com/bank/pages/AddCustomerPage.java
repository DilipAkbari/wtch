package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    By addToCustomer = By.xpath("//button[@class='btn btn-default']");

    public void clickOnAddCustomerTab() {
        waitUntilPresenceOfElementLocated(By.xpath("//button[contains(text(),'Add Customer')]"), 10);
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String firstName) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@placeholder='First Name']"), 20);
        sendTextToElement(enterFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@placeholder='Last Name']"), 10);
        sendTextToElement(enterLastName, lastName);
    }

    public void postCode(String postCode) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@placeholder='Post Code']"), 10);
        sendTextToElement(enterPostCode, postCode);
    }

    public void addToCustomer() {
        clickOnElement(addToCustomer);
    }

}
