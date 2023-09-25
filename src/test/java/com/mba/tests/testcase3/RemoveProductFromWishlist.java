package com.mba.tests.testcase3;

import com.mba.pages.WhishlistPage;
import com.mba.utilities.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductFromWishlist extends BaseTest {

        @Test
        public void removeProductFromWishlist() throws InterruptedException {
                WhishlistPage whishlistPage = new WhishlistPage();
                whishlistPage.goToWhishlist();
                Thread.sleep(3000);
                String firstWhislistElementName = whishlistPage.firstProductName.getText();

                System.out.println("firstWhislistElementName = " + firstWhislistElementName);
                Assert.assertTrue(whishlistPage.isProductDisplayed(whishlistPage.firstProductName), "Product not exist");

                whishlistPage.firstProductRemoveBtn.click();
                System.out.println("firstWhislistElement = " + firstWhislistElementName);

                String expectedProductName = firstWhislistElementName;
                String actualProductName = whishlistPage.firstProductName.getText();
                Assert.assertNotEquals(actualProductName, expectedProductName, "Product still exists");

        }
}
