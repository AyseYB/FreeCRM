package com.freeCRM.stepDefinitions;

import com.freeCRM.pages.ContactPage;
import com.freeCRM.pages.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ContactPageStepDefinition {
LoginPages loginPages = new LoginPages();
ContactPage contactPage = new ContactPage();

    WebDriver driver;

    @Given("user is already on Login Page")
    public void user_is_already_on_Login_Page() {
        loginPages.verifyLoginTitle();
    }

    @When("user clicks on Login icon")
    public void user_clicks_on_Login_icon() {
        loginPages.clickLoginIcon();
    }

    @Then("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        loginPages.enterEmailAndPassword(email, password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPages.clickLoginIcon();
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page Title :: " + title);
        Assert.assertEquals("COGMENTO", title);
    }

    @Then("user clicks on contacts tab")
    public void user_clicks_on_contacts_tab() {
        contactPage.clickToContact();
    }

    @Then("user clicks on new icon to create contact")
    public void user_clicks_on_new_icon_to_create_contact() {
        contactPage.clickNewIcon();
    }

    @Then("user enters contact details {string} and {string} and {string}")
    public void user_enters_contact_details_and_and(String firstname, String lastname, String position) {
        contactPage.setFirstAndLastNameAndPosition(firstname, lastname, position);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        contactPage.clickOnSaveIcon();
    }


}
