package com.harrow.pages;

import com.harrow.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By harrowCouncilDropdownLink = By.xpath("//span[@class='icon icon-logo identity__logo-desktop']");
    By serviceDropdownLink = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    public void mouseHowerharrowCouncilDropdownLink() {
        mouseHoverToElement(harrowCouncilDropdownLink);
    }

    public void mouseHowerserviceDropdownLink() {
        mouseHoverToElement(serviceDropdownLink);
    }
}
