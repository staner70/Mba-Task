package com.masterbranchacademy.pages;

import com.masterbranchacademy.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginMenu;

    @FindBy(id = "input-email")
    public WebElement inputEmail;

    @FindBy(id = "input-password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginBtn;

    //******************* Metodlar ****************//

    public void login(){
        myAccountBtn.click();
        loginMenu.click();
        inputEmail.sendKeys(ConfigReader.getProperties("usermail"));
        inputPassword.sendKeys(ConfigReader.getProperties("password"));
        loginBtn.click();
    }


}