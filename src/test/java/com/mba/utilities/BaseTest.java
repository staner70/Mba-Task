package com.mba.utilities;

import com.mba.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;


   @BeforeTest
    public void login(){

    }

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser){

        driver = Driver.getDriver(browser);
        driver.get(ConfigReader.getProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));


    }

    @AfterMethod
    public void closeBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }


}
