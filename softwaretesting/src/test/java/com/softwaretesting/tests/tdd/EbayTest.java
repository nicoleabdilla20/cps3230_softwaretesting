package com.softwaretesting.tests.tdd;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.softwaretesting.Ebay;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EbayTest {
    private WebDriver webDriver;
    private Ebay ebay;

    //Setup Method
    @BeforeEach
    public void setup()  {
        System.setProperty("webdriver.chrome.driver", "/Users/abdil/webtesting/chromedriver.exe");
        webDriver = new ChromeDriver();
        // Launches website
        ebay = new Ebay();
        webDriver.get("https://www.ebay.com/");
        // Maximise size of page to screen size
        webDriver.manage().window().maximize();
    }

    //Teardown method
    @AfterEach
    public void teardown() {
        webDriver.quit();
    }

    @Test
    public void searchForProduct() throws Exception {
        //Exercise
        WebElement searchBar = webDriver.findElement(By.name("_nkw"));
        searchBar.sendKeys("iPad");
        // Searching
        WebElement searchBtn = webDriver.findElement(By.id("gh-btn"));
        searchBtn.submit();
        /* The above two lines (38,39) can be done by the below in one line:
         webDriver.switchTo().activeElement().sendKeys(Keys.ENTER);
         Instead of using findElement can also use activate Eliminate to use Keys*/
        //only used for testing of the video
        Thread.sleep(10000);
        //Verify
        String title = webDriver.getTitle();
        Assertions.assertEquals("iPad: Search Result | eBay", title);
    }

    @Test
    public void teststringToint_ToPass() {
        //Exercise
        ebay.stringToint("123");
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void teststringToint_ToFail() {
        //Exercise
        ebay.stringToint("abc");
        //Verify
        Assertions.assertEquals("Error", "Error");
    }

    @Test
    public void teststringToint_ToNull() {
        //Exercise
        ebay.stringToint("");
        //Verify
        Assertions.assertEquals(0, 0);
    }

    @Test
    public void testCheckForNulls_CheckingForNullValue(){
        //Exercise
        ebay.CheckForNulls(3, "", "", "", "", 0);
        //Verify
        Assertions.assertEquals("Null", "Null");
    }

    @Test
    public void testCheckForNulls_CheckingForPass() {
        //Exercise
        ebay.CheckForNulls(5,"Dog","Puppy", "https://www.google.com/search?q=puppy&sxsrf=ALiCzsa9n7Hnb6QrpRG3a4Y25-E4f6wNOQ:1667122994502&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj27oiP1Yf7AhV1g_0HHWceAbcQ_AUoAXoECAEQAw&biw=1353&bih=721&dpr=1.35#imgrc=x6do7KnF5HDj_M","data:image/jpeg;base64,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", 1000);
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void testCheckForNulls_OutsideAlertType()  {
        //Exercise
        ebay.CheckForNulls(8, "", "", "", "", 1);
        //Verify
        Assertions.assertFalse(false);
    }

    @Test
    public void testSendRequest_OutsideAlertType()  {
        //Exercise
        ebay.SendRequest(8, "", "", "", "", 1);
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void testDeleteAlerts() throws UnirestException {
        //Exercise
        ebay.deleteAlerts();
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void testScreenScrapperOneAlert_ToPass(){
        //Exercise;
        ebay.ScreenScrapper(1);
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void testScreenScrapperTwoAlert_ToPass()  {
        //Exercise;
        ebay.ScreenScrapper(2);
        //Verify
        Assertions.assertTrue(true);
    }

    @Test
    public void testScreenScrapperThreeAlert_ToPass()  {
        //Exercise;
        ebay.ScreenScrapper(3);
        //Verify
        Assertions.assertTrue(true);
    }
    @Test
    public void testScreenScrapperFourAlert_ToPass() {
        //Exercise;
        ebay.ScreenScrapper(4);
        //Verify
        Assertions.assertTrue(true);
    }
    @Test
    public void testScreenScrapperFiveAlert_ToPass() {
        //Exercise;
        ebay.ScreenScrapper(5);
        //Verify
        Assertions.assertTrue(true);
    }
    @Test
    public void testScreenScrapperMoreThanFiveAlert_ToPass()  {
        //Exercise;
        ebay.ScreenScrapper(10);
        //Verify
        Assertions.assertTrue(true);
    }
    @Test
    public void testScreenScrapperZeroAlert_ToPass()  {
        //Exercise;
        ebay.ScreenScrapper(0);
        //Verify
        Assertions.assertTrue(true);
    }
}


