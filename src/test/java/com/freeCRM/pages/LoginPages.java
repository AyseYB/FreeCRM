package com.freeCRM.pages;

import com.freeCRM.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    public WebElement loginIcon;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='header item']")
    public WebElement title;

    public void verifyLoginTitle(){
        Assert.assertEquals("Free CRM software can boost your sales by 30%", MyDriver.getDriver().getTitle());
    }

    public void clickLoginIcon(){
        loginIcon.click();
    }

    public void enterEmailAndPassword(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);

    }

//    public void enterEmail(String email){
//        emailInput.sendKeys(email);
//    }
//
//    public void enterPassword(String password){
//        passwordInput.sendKeys(password);
//    }

    public void loginPage(){
        login.click();
    }

    public void verifyPageTitle(){
        title.getText();
    }
















    public LoginPages(){
        PageFactory.initElements(MyDriver.getDriver(), this);
    }
}
