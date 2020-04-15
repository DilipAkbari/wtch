package com.letskodeit.pages;

import com.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By practiceClickOnLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By loginClickOnLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");

    public void setPracticeClickOnLink() {
        clickOnElement(practiceClickOnLink);
    }

    public void setLoginClickOnLink() {

        clickOnElement(loginClickOnLink);
    }


}
