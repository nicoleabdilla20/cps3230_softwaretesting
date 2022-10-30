package com.softwaretesting;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Ebay {
    private Elements elements;
    private Document document;
    public final String currentURL = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=ipad&_sacat=0";
    private static final int alertType = 6;
    private static String heading;
    private static String url = "";
    private static String imageURL = "";
    private static String description = "";
    private static int priceInCents;
    private static final String postedBy = "5e383da7-d1b0-4b72-b9d3-31c15a9b9e44";

    // The main method of our class, which will also house the scraping functionality.
    public void ScreenScrapper(int num) {
        try {
            // Here we create a document object, Then we use JSoup to fetch the website.
            document = Jsoup.connect(currentURL).get();
            // With the document fetched, we use JSoup???s title() method to fetch the title
            System.out.printf("\nWebsite Title: %s\n\n", document.title());
            //method of Retrieving and Printing Data
            printScreenScrappingData(num);
            //  In case of any IO errors, we want the messages written to the console
        } catch (IOException e) {
            System.out.println("Problem with the connection...");
        }
    }
    // Method from Postman
    public void sendPOST(int a, String h, String d, String u, String i, int p) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post("https://api.marketalertum.com/Alert").header("Content-Type", "application/json").body("{\r\n    \"alertType\": " + a + ",\r\n    \"heading\": \"" + h + "\",\r\n    \"description\": \"" + d + "\",\r\n    \"url\": \"" + u + "\",\r\n    \"imageUrl\": \"" + i + "\",\r\n    \"postedBy\": \"" + postedBy + "\",\r\n    \"priceInCents\":" + p + "\r\n}").asString();
    }
    // Method from Postman
    public void deleteAlerts() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.delete("https://api.marketalertum.com/Alert?userId=5e383da7-d1b0-4b72-b9d3-31c15a9b9e44")
                .asString();
    }
    // Method converting String to Integer
    public int stringToint(String x) {
        if (x != null && x.length() > 0) {
            try {
                int z = Integer.parseInt(x);
                return z;
            } catch (Exception e) {
                System.out.println("Error");
                return -1;
            }
        } else {
            return 0;
        }
    }
    // Method to pass non-null values to post alerts to website
    public void SendRequest(int a, String h, String d, String u, String i, int p) {
        try {
            sendPOST(a, h, d, u, i, p);
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }
    // Method to check if there are null Items
    public void CheckForNulls(int a, String h, String d, String u, String i, int p) {
        if (h != null && h.length() > 0) {
            try {
                SendRequest(a, h, d, u, i, p);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } else {
            System.out.println("Null");
        }
    }
    // Method of Screen Scrapping Website
    public void printScreenScrappingData(int num) {
        // Looping through first page on ebay for items under Auction.
        for (int j = 1; j <= 1; j++) {
            // Get the list of repositories
            elements = document.getElementsByClass("s-item__wrapper clearfix");
            System.out.println("\n*********** Page number :  " + j + " ****************");
            int n = 0;
            //For each repository, extract the  information
            for (Element element : elements) {
                // Extract the heading
                heading = element.getElementsByClass("s-item__title").text();
                // Extract the description
                description = element.getElementsByClass("s-item__subtitle").text();
                // Extract the url
                url = element.getElementsByClass("s-item__link").attr("href");
                // Extract the image url
                imageURL = element.getElementsByClass("s-item__image-img").attr("src");
                // Get the FINAL price
                String c = element.getElementsByClass("s-item__price").text();
                String[] arr = c.split("\\s");
                String word = arr[0];
                String x = word.replace("€", "").replace("$", "").replace(".", "").replaceAll("\\s+", "");
                //Convert String to Int
                priceInCents = stringToint(x);
                // Format and print the information to the console
                System.out.println(n + "." + "Heading:" + heading);
                System.out.println("URL:" + url);
                System.out.println("image:" + imageURL);
                System.out.println("\t" + description);
                System.out.println("\t" + priceInCents);
                System.out.println("\n");
                //method to pass the number of wanted alerts
                if(num==0){
                    // do nothing
                    System.out.println("No alerts posted");
                }
                else if(num == 1) {
                    switchStatementOneAlert(n);
                }
                else if(num == 2) {
                    switchStatementTwoAlerts(n);
                }
                else if(num == 3) {
                   switchStatementThreeAlerts(n);
                }
                else if(num == 4) {
                    switchStatementFourAlerts(n);
                }
                else if(num == 5) {
                    switchStatementFiveAlerts(n);
                }
                else{
                    switchStatementMoreThanFiveAlerts(n);
                }
                //incrementing counter
                n = n + 1;
            }
        }
    }

    //method to send one alert
    public void switchStatementOneAlert(int n){
        switch (n){
            case 51:
                System.out.println("Alert 1");
                CheckForNulls(6, heading, description, url, imageURL, priceInCents);
                break;
            default:
                break;
        }
    }
    //method to send 2 alerts
    public void switchStatementTwoAlerts(int n){
        switch (n) {
            case 21:
                System.out.println("Alert 1");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 22:
                System.out.println("Alert 2");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
        }
    }
    //method to send 3 alerts
    public void switchStatementThreeAlerts(int n){
        switch (n) {
            case 18:
                System.out.println("Alert 1");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 19:
                System.out.println("Alert 2");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 20:
                System.out.println("Alert 3");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
        }
    }
    //method to send 4 alerts
    public void switchStatementFourAlerts(int n){
        switch (n) {
            case 31:
                System.out.println("Alert 1");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 32:
                System.out.println("Alert 2");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 33:
                System.out.println("Alert 3");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 34:
                System.out.println("Alert 4");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            default:
                break;
        }
    }
    //method to send 5 alerts
    public void switchStatementFiveAlerts(int n){
        switch (n) {
            case 35:
                System.out.println("Alert 1");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 36:
                System.out.println("Alert 2");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 37:
                System.out.println("Alert 3");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 38:
                System.out.println("Alert 4");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 39:
                System.out.println("Alert 5");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            default:
                break;
        }

    }
    //method to send >5 alert
    public void switchStatementMoreThanFiveAlerts(int n){
        switch (n) {
            case 50:
                System.out.println("Alert 1");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 51:
                System.out.println("Alert 2");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 52:
                System.out.println("Alert 3");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 53:
                System.out.println("Alert 4");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            case 54:
                System.out.println("Alert 5");
                CheckForNulls(alertType, heading, description, url, imageURL, priceInCents);
                break;
            default:
                break;
        }

    }
}
