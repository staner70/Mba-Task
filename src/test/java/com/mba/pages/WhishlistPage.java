package com.mba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhishlistPage extends PageObject{

    @FindBy(id = "wishlist-total")
    public WebElement menuWhishlit;

    @FindBy(linkText = "MacBook")
    public WebElement linkProduct;



    //*************** Metodlar *******************//
    public void goToWhishlist(){
        menuWhishlit.click();
    }
}
