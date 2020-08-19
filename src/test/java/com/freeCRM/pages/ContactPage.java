package com.freeCRM.pages;

import com.freeCRM.utilities.MyDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    public WebElement contact;

    @FindBy(xpath = "//button[contains(text(),'New')]")
    public WebElement newButton;

    @FindBy(name = "first_name")
    public WebElement firstNameInput;

    @FindBy(name = "last_name")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='position']")
    public WebElement positionInput;

    @FindBy(className = "save icon")
    public WebElement saveIcon;

    public void clickToContact(){
        contact.click();
    }

    public void clickNewIcon(){
        newButton.click();
    }

    public void setFirstAndLastNameAndPosition(String firstname, String lastname, String position){
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        positionInput.sendKeys(position);
    }

    public void clickOnSaveIcon(){
        saveIcon.click();
    }

















    public ContactPage(){
        PageFactory.initElements(MyDriver.getDriver(), this);
    }
}
