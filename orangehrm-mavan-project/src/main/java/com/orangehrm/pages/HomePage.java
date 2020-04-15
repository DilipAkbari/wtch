package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By contactSalesClickon = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By freeThirtyDayTrialClickon = By.xpath("//a[contains(@class,'btn-orange trial-btn pulse')]");

    public void setContactSalesClickon() {
        clickOnElement(contactSalesClickon);
    }

    public void setFreeThirtyDayTrialClickon() {
        clickOnElement(freeThirtyDayTrialClickon);
    }
}
