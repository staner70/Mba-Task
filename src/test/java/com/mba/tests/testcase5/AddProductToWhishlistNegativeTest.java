package com.mba.tests.testcase5;

import com.mba.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToWhishlistNegativeTest extends BaseTest {
    @Test
    public void addProductToWhishlistNegativeTest() throws InterruptedException {
        String actualTitleHome = driver.getTitle();
        String expectedTitleHome = "Your Store";
        Assert.assertEquals(actualTitleHome, expectedTitleHome, "Home Page not load");
        Thread.sleep(3000);

       WebElement firstProductWishlistIcon = driver.findElement(By.xpath("(//i[@class='fa fa-heart'] )[2]"));
        firstProductWishlistIcon.click();

        Thread.sleep(3000);

        WebElement addProductToWishlistMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        System.out.println("addProductToWishlistMessage.getText() = " + addProductToWishlistMessage.getText());
        String actualMessage = addProductToWishlistMessage.getText();

        //Assert.assertFalse(actualMessage.contains("Success"), "Product not added to Wishlist");
        Assert.assertTrue(actualMessage.contains("You must login"), "Product added to Wishlist");

    }
}
