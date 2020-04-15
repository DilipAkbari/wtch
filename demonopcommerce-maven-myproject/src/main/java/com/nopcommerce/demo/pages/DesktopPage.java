package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By buidYrOwnComouterLink = By.linkText("Build your own computer");
    By harddrive400GB = By.id("product_attribute_3_7");
    By addToCartBtn = By.id("add-to-cart-button-1");
    By productAddSucessfullyTex = By.xpath("//p[@class='content']");


    public void clickOnbuildYourOwnComputerLink() {
        clickOnElement(buidYrOwnComouterLink);
    }

    public void clickOn400GBHD() {
        clickOnElement(harddrive400GB);
    }

    public void clickAddToCart() {
        clickOnElement(addToCartBtn);
    }

    public String getProductAddSuccessfullyText() {
        return getTextFromElement(productAddSucessfullyTex);
    }
}
