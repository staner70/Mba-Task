package com.mba.tests.testcase2;

import com.mba.pages.LoginPage;
import com.mba.pages.WhishlistPage;
import com.mba.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToViewProductInWishlist extends BaseTest {
    @Test
    public void toViewProductInWishlist() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login();

        WhishlistPage whishlist = new WhishlistPage();

        WebElement wishlistIconMacBook = driver.findElement(By.xpath("(//i[@class='fa fa-heart'] )[2]"));

        whishlist.scrollAndclick(wishlistIconMacBook);
        Thread.sleep(3000);
        whishlist.goToWhishlist();


        // Favori sayfasinda oldugumuzu dogrulama
        String actualWishlistPageTitle = driver.getTitle();
        String expectedWhishlistPageTitle = "My Wish List";
        Assert.assertEquals(actualWishlistPageTitle, expectedWhishlistPageTitle, "Page Whishlist not loaded");

        // Favoriye eklenen urunun listede oldugunu dogrulama
        boolean isProductExistInWishList = whishlist.linkProduct.isDisplayed();
        System.out.println("whishlist = " + whishlist.linkProduct.getText());
        Assert.assertTrue(isProductExistInWishList, "Product not added in Wishlist");

    }
}
