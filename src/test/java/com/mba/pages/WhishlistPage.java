package com.mba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhishlistPage extends PageObject{

    @FindBy(id = "wishlist-total")
    public WebElement menuWhishlit;

    @FindBy(linkText = "MacBook")
    public WebElement linkProduct;

    @FindBy(xpath = "(//tbody)[3]//tr[1]/td[2]/a")
    public WebElement firstProductName;

    @FindBy(xpath = "(//tbody)[3]//tr[1]/td[6]/a[1]/i[1]")
    public WebElement firstProductRemoveBtn;

    @FindBy(xpath = "(//tbody)[3]//tr[1]/td[6]//button/i[1]")
    public WebElement firstProductAddToCartBtn;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;



    //*************** Metodlar *******************//
    public void goToWhishlist(){
        menuWhishlit.click();
    }

    public boolean isProductDisplayed(WebElement element){
        scrollInto(element);
        return element.isDisplayed();
    }
}
