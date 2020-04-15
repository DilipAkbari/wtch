package com.barclay.pages;

import com.barclay.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankDropdownLink = By.linkText("Bank");
    By borrowDropdownLink = By.linkText("Borrow");

    public void mouseHowerbankDropdownLink() {
        mouseHoverToElement(bankDropdownLink);
    }

    public void mouseHowerborrowDropdownLink() {
        mouseHoverToElement(borrowDropdownLink);

    }
}
