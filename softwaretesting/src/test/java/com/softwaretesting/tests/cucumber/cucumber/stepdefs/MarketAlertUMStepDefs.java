package com.softwaretesting.tests.cucumber.cucumber.stepdefs;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.softwaretesting.Ebay;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.java.Before;
import cucumber.api.java.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.softwaretesting.MarketAlertUM;

public class MarketAlertUMStepDefs {

    WebDriver browser = null;
    Ebay ebay;
    public MarketAlertUM marketAlertUMPageObject;

    public final String userId = "5e383da7-d1b0-4b72-b9d3-31c15a9b9e44";
    public final String invaliduserId = "5e383da7-d1b0-4b72-b9d3-31c15a9b9e44TEST";


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/abdil/webtesting/chromedriver.exe");
        browser = new ChromeDriver();
        ebay = new Ebay();
        marketAlertUMPageObject = new MarketAlertUM(browser);
        browser.manage().window().maximize();
    }

    @After
    public void teardown() {
        browser.quit();
        browser = null;
        marketAlertUMPageObject = null;
        ebay = null;
    }

    //---------------- Scenario 1 ---------------------------
    @Given("I am a user of marketalertum")
    public void i_am_a_user_on_the_marketalertum_website() {
        marketAlertUMPageObject.getWebPage();
    }

    @When("I login using valid credentials")
    public void i_log_in_using_valid_credentials_using_userID() {
        marketAlertUMPageObject.login(userId);
    }

    @Then("I should see my alerts")
    public void i_should_be_logged_in() {
       marketAlertUMPageObject.testLoginSuccess();
    }

    //-------------------------- Scenario 2 -----------------------
    @When("I login using invalid credentials")
    public void i_log_in_using_invalid_credentials_using_userID(){
        marketAlertUMPageObject.login(invaliduserId);
    }
    @Then("I should see the login screen again")
    public void i_should_not_be_logged_in() {
        marketAlertUMPageObject.testLoginFailure();
    }

    // -------------------------- Scenario 3 ---------------------------
    @Given("I am an administrator of the website and I upload {int} alerts")
    public void i_am_an_administrator_of_the_website_and_I_upload_alerts(int int1) throws UnirestException {
        ebay.ScreenScrapper(int1);
    }

    @When("I view a list of alerts")
    public void i_view_a_list_of_alerts() {
        marketAlertUMPageObject.login(userId);
        marketAlertUMPageObject.testLoginSuccess();
    }

    @Then("each alert should contain an icon")
    public void each_alert_should_contain_an_icon() {
       marketAlertUMPageObject.testFindIcon();
    }

    @Then("each alert should contain a heading")
    public void each_alert_should_contain_a_heading() {
        marketAlertUMPageObject.testFindHeading();
    }

    @Then("each alert should contain a description")
    public void each_alert_should_contain_a_description() {
        marketAlertUMPageObject.testFindDescription();
    }

    @Then("each alert should contain an image")
    public void each_alert_should_contain_an_image() {
        marketAlertUMPageObject.testFindImage();
    }

    @Then("each alert should contain a price")
    public void each_alert_should_contain_a_price() {
       marketAlertUMPageObject.testFindPrice();
    }

    @Then("each alert should contain a link to the original product website")
    public void each_alert_should_contain_a_link_to_the_original_product_website() {
       marketAlertUMPageObject.testFindLink();
    }

    // ------------- Scenario 4 ----------------
    @Given("I am an administrator of the website and I upload more than {int} alerts")
    public void i_am_an_administrator_of_the_website_and_I_upload_more_than_alerts(Integer int1)  {
        int1 = int1+1;
        ebay.ScreenScrapper(int1);
    }

    @Then("I should see {int} alerts")
    public void i_should_see_alerts(Integer int1) {
        marketAlertUMPageObject.testGetNumber(int1);
    }

    // ------------- Scenario 5 ----------------
    @Given ("I am an administrator of the website and I upload an alert of type {int}")
    public void given_i_am_an_administrator_of_the_website_and_I_upload_an_alert_of_type(int int1) throws UnirestException {
        ebay.deleteAlerts();
            ebay.SendRequest(int1, "Apple iPad Air 16GB Wi-Fi 9.7 in Space Gray MD785LL/A Very Good 1 year warranty", "Very Good - Refurbished · 16 GB · 9.7 in · Wi-Fi", "https://www.ebay.com/itm/223997164756?epid=0&hash=item3427457cd4:g:A0QAAOSwKIdaZFiL&amdata=enc%3AAQAHAAAA0BaBGGbelcpgdnLtBM5HXMBrjtZUYOx22v8%2Fy%2BHkbE7JI83vxFIPgP9p2oKq4Chd8LEatzFERxysTupVHcjT%2B2f0Vl6zcuoMOMn0L%2BPSdU0dC3EQS2NpOxPoa%2BQUQsL%2FgPXCJEgQOaPtSZeDi63vO%2BE0Z%2F2EvZx0D0FvnmcwQTp9gRKvSmj7bs4JOuPUybL6d3KC67tp%2BEPtPPZXlKkQTynfA1SdpDxt0Afkb7OxJq%2Furj0KCcaNDSerEvjgYOZacJHpBxTxiysx%2BvJtho%2BHJ88%3D%7Ctkp%3ABFBM7NuNs4Rh", "https://i.ebayimg.com/thumbs/images/g/A0QAAOSwKIdaZFiL/s-l225.webp", 10020);
    }

    @Then("the icon displayed should be {}")
    public void the_icon_displayed_should_be(String icon){
        System.out.println(icon);
        marketAlertUMPageObject.testFindIcon();
    }

}
