package com.mba.tests.testcase4;

import com.mba.pages.WhishlistPage;
import com.mba.utilities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartFromWishlist extends BaseTest {

    @Test
    public void addToCartFromWishlist() throws InterruptedException {
        WhishlistPage whishlistPage = new WhishlistPage();
        whishlistPage.goToWhishlist();
        Thread.sleep(3000);

        whishlistPage.scrollAndclick(whishlistPage.firstProductAddToCartBtn);
        Thread.sleep(3000);
        Assert.assertTrue(whishlistPage.successMessage.isDisplayed(), "Product to Cart not added");
    }
}
