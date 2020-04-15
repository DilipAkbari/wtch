package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");

    public void clickOnAddCustomerTab() {
        waitUntilPresenceOfElementLocated(By.xpath("//button[contains(text(),'Add Customer')]"), 10);
        clickOnElement(addCustomerTab);
    }

    public void clickOnbankManagerLogin() {
        waitUntilElementToBeClickable(By.xpath("//button[contains(text(),'Bank Manager Login')]"), 10);
        clickOnElement(bankManagerLogin);
    }


}