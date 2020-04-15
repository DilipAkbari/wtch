package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By OpenAccount = By.xpath("//button[@class='btn btn-lg tab btn-primary']");
//   By selectCurrancy = By.xpath("");
 //   By serchCustomer = By.xpath(""):
 //   By process = By.xpath("//button[contains(text(),'Process')]");

    public void bankManagerLogin() {
        clickOnElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"));
    }

    public void openAccount() {
        clickOnElement(By.xpath("//button[@class='btn btn-lg tab btn-primary']"));
    }
}
