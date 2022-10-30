package com.softwaretesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MarketAlertUM {
    WebDriver browser = null;
    public String icon = "";
    public String icon2 = "";
    public String icon3 = "";
    public String icon4 = "";
    public String icon5 = "";
    public String heading = "";
    public String heading2 = "";
    public String heading3 = "";
    public String heading4 = "";
    public String heading5 = "";
    public String d = "";
    public String d2 = "";
    public String d3 = "";
    public String d4 = "";
    public String d5 = "";
    public String img = "";
    public String img2 = "";
    public String img3 = "";
    public String img4 = "";
    public String img5 = "";
    public String p = "";
    public String p2 = "";
    public String p3 = "";
    public String p4 = "";
    public String p5 = "";
    public String l = "";
    public String l2 = "";
    public String l3 = "";
    public String l4 = "";
    public String l5 = "";
    public String t = "";
    public String t2 = "";
    public String t3 = "";
    public String t4 = "";
    public String t5 = "";

    // METHOD USED ONLY FOR TESTING
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println("Sleep Method Exception Error");
        }
    }

    public MarketAlertUM(WebDriver browser) {
        this.browser = browser;
    }

    // ---------- WEBPAGE ---------------------------
    public void getWebPage() {
        browser.get("https://www.marketalertum.com/Alerts/Login");
    }

    // ------------------ LOGIN --------------------
    public void login(String userID) {
        WebElement inputBar = browser.findElement(By.id("UserId"));
        inputBar.sendKeys(userID);
        sleep(5);
        WebElement btn = browser.findElement(By.name("__RequestVerificationToken"));
        btn.submit();
        sleep(5);
    }

    // -------------------- LOGIN SUCCESS ---------------
    public void testLoginSuccess() {
        String i = browser.findElement(By.tagName("h1")).getText();
        if (i.contains("Latest alerts for Nicole Abdilla")) {
            System.out.println(i);
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        sleep(1);
    }

    // ---------------- LOGIN FAIL ------------
    public void testLoginFailure() {
        String URL = browser.getCurrentUrl();
        if (URL.contains("https://www.marketalertum.com/Alerts/Login")) {
            System.out.println("Landed in correct URL" + "" + URL);
        } else {
            System.out.println("Landed in wrong URL");
        }
        sleep(1);
    }

    // -------------------- ICON --------------------
    public void testFindIcon() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                icon = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                if (icon != null) {
                    System.out.println("Icon 1 URL:\t" + icon);
                } else {
                    System.out.println("Not Found - Icon 1");
                }
                break;
            case 2:
                icon = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                if (icon != null) {
                    System.out.println("Icon 1 URL:\t" + icon);
                } else {
                    System.out.println("Not Found - Icon 1");
                }

                if (icon2 != null) {
                    System.out.println("Icon 2 URL:\t" + icon2);

                } else {
                    System.out.println("Not Found - Icon 2");
                }
                break;
            case 3:
                icon = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                if (icon != null) {
                    System.out.println("Icon 1 URL:\t" + icon);
                } else {
                    System.out.println("Not Found - Icon 1");
                }

                if (icon2 != null) {
                    System.out.println("Icon 2 URL:\t" + icon2);

                } else {
                    System.out.println("Not Found - Icon 2");
                }
                if (icon3 != null) {
                    System.out.println("Icon 3 URL:\t" + icon3);

                } else {
                    System.out.println("Not Found - Icon 3");
                }
                break;
            case 4:
                icon = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon4 = browser.findElement(By.xpath("//table[4]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                if (icon != null) {
                    System.out.println("Icon 1 URL:\t" + icon);
                } else {
                    System.out.println("Not Found - Icon 1");
                }

                if (icon2 != null) {
                    System.out.println("Icon 2 URL:\t" + icon2);

                } else {
                    System.out.println("Not Found - Icon 2");
                }
                if (icon3 != null) {
                    System.out.println("Icon 3 URL:\t" + icon3);

                } else {
                    System.out.println("Not Found - Icon 3");
                }
                if (icon4 != null) {
                    System.out.println("Icon 4 URL:\t" + icon4);

                } else {
                    System.out.println("Not Found - Icon 4");
                }
                break;
            case 5:
                icon = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon4 = browser.findElement(By.xpath("//table[4]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");
                icon5 = browser.findElement(By.xpath("//table[5]/tbody/tr[1]/td[1]/h4/img")).getAttribute("src");

                if (icon != null) {
                    System.out.println("Icon 1 URL:\t" + icon);
                } else {
                    System.out.println("Not Found - Icon 1");
                }
                if (icon2 != null) {
                    System.out.println("Icon 2 URL:\t" + icon2);

                } else {
                    System.out.println("Not Found - Icon 2");
                }
                if (icon3 != null) {
                    System.out.println("Icon 3 URL:\t" + icon3);

                } else {
                    System.out.println("Not Found - Icon 3");
                }
                if (icon4 != null) {
                    System.out.println("Icon 4 URL:\t" + icon4);

                } else {
                    System.out.println("Not Found - Icon 4");
                }
                if (icon5 != null) {
                    System.out.println("Icon 5 URL:\t" + icon5);
                } else {
                    System.out.println("Not Found - Icon 5");
                }
                break;
        }
    }


    // --------------------------- HEADING ----------------------------
    public void testFindHeading() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                heading = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4")).getText();
                if (heading != null) {
                    System.out.println("Heading:\t" + heading);
                } else {
                    System.out.println("Not Found - Heading 1");
                }
                break;
            case 2:
                heading = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4")).getText();
                heading2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4")).getText();
                if (heading != null) {
                    System.out.println("Heading:\t" + heading);
                } else {
                    System.out.println("Not Found - Heading 1");
                }

                if (heading2 != null) {
                    System.out.println("Heading:\t" + heading2);

                } else {
                    System.out.println("Not Found - Heading 2");
                }
                break;
            case 3:
                heading = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4")).getText();
                heading2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4")).getText();
                heading3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4")).getText();
                if (heading != null) {
                    System.out.println("Heading:\t" + heading);
                } else {
                    System.out.println("Not Found - Heading 1");
                }

                if (heading2 != null) {
                    System.out.println("Heading:\t" + heading2);

                } else {
                    System.out.println("Not Found - Heading 2");
                }
                if (heading3 != null) {
                    System.out.println("Heading:\t" + heading3);

                } else {
                    System.out.println("Not Found - Heading 3");
                }
                break;
            case 4:
                heading = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4")).getText();
                heading2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4")).getText();
                heading3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4")).getText();
                heading4 = browser.findElement(By.xpath("//table[4]/tbody/tr[1]/td[1]/h4")).getText();
                if (heading != null) {
                    System.out.println("Heading:\t" + heading);
                } else {
                    System.out.println("Not Found - Heading 1");
                }

                if (heading2 != null) {
                    System.out.println("Heading:\t" + heading2);

                } else {
                    System.out.println("Not Found - Heading 2");
                }
                if (heading3 != null) {
                    System.out.println("Heading:\t" + heading3);

                } else {
                    System.out.println("Not Found - Heading 3");
                }
                if (heading4 != null) {
                    System.out.println("Heading:\t" + heading4);

                } else {
                    System.out.println("Not Found - Heading 4");
                }
                break;
            case 5:
                heading = browser.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/h4")).getText();
                heading2 = browser.findElement(By.xpath("//table[2]/tbody/tr[1]/td[1]/h4")).getText();
                heading3 = browser.findElement(By.xpath("//table[3]/tbody/tr[1]/td[1]/h4")).getText();
                heading4 = browser.findElement(By.xpath("//table[4]/tbody/tr[1]/td[1]/h4")).getText();
                heading5 = browser.findElement(By.xpath("//table[5]/tbody/tr[1]/td[1]/h4")).getText();

                if (heading != null) {
                    System.out.println("Heading:\t" + heading);
                } else {
                    System.out.println("Not Found - Heading 1");
                }
                if (heading2 != null) {
                    System.out.println("Heading:\t" + heading2);

                } else {
                    System.out.println("Not Found - Heading 2");
                }
                if (heading3 != null) {
                    System.out.println("Heading:\t" + heading3);

                } else {
                    System.out.println("Not Found - Heading 3");
                }
                if (heading4 != null) {
                    System.out.println("Heading:\t" + heading4);

                } else {
                    System.out.println("Not Found - Heading 4");
                }
                if (heading5 != null) {
                    System.out.println("Heading:\t" + heading5);
                } else {
                    System.out.println("Not Found - Heading 5");
                }
                break;
        }
    }

    // ----------------------- DESCRIPTION --------------------
    public void testFindDescription() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                d = browser.findElement(By.xpath("//table[1]/tbody/tr[3]/td[1]")).getText();
                if (d != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 1");
                }
                break;
            case 2:
                d = browser.findElement(By.xpath("//table[1]/tbody/tr[3]/td[1]")).getText();
                d2 = browser.findElement(By.xpath("//table[2]/tbody/tr[3]/td[1]")).getText();
                if (d != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 1");
                }
                if (d2 != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 2");
                }

                break;
            case 3:
                d = browser.findElement(By.xpath("//table[1]/tbody/tr[3]/td[1]")).getText();
                d2 = browser.findElement(By.xpath("//table[2]/tbody/tr[3]/td[1]")).getText();
                d3 = browser.findElement(By.xpath("//table[3]/tbody/tr[3]/td[1]")).getText();
                if (d != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 1");
                }
                if (d2 != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 2");
                }
                if (d3 != null) {
                    System.out.println("Description:\t" + d3);
                } else {
                    System.out.println("Not Found - Description 3");
                }
                break;
            case 4:
                d = browser.findElement(By.xpath("//table[1]/tbody/tr[3]/td[1]")).getText();
                d2 = browser.findElement(By.xpath("//table[2]/tbody/tr[3]/td[1]")).getText();
                d3 = browser.findElement(By.xpath("//table[3]/tbody/tr[3]/td[1]")).getText();
                d4 = browser.findElement(By.xpath("//table[4]/tbody/tr[3]/td[1]")).getText();

                if (d != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 1");
                }
                if (d2 != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 2");
                }
                if (d3 != null) {
                    System.out.println("Description:\t" + d3);
                } else {
                    System.out.println("Not Found - Description 3");
                }
                if (d4 != null) {
                    System.out.println("Description:\t" + d4);
                } else {
                    System.out.println("Not Found - Description 4");
                }
                break;
            case 5:
                d = browser.findElement(By.xpath("//table[1]/tbody/tr[3]/td[1]")).getText();
                d2 = browser.findElement(By.xpath("//table[2]/tbody/tr[3]/td[1]")).getText();
                d3 = browser.findElement(By.xpath("//table[3]/tbody/tr[3]/td[1]")).getText();
                d4 = browser.findElement(By.xpath("//table[4]/tbody/tr[3]/td[1]")).getText();
                d5 = browser.findElement(By.xpath("//table[5]/tbody/tr[3]/td[1]")).getText();

                if (d != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 1");
                }
                if (d2 != null) {
                    System.out.println("Description:\t" + d);
                } else {
                    System.out.println("Not Found - Description 2");
                }
                if (d3 != null) {
                    System.out.println("Description:\t" + d3);
                } else {
                    System.out.println("Not Found - Description 3");
                }
                if (d4 != null) {
                    System.out.println("Description:\t" + d4);
                } else {
                    System.out.println("Not Found - Description 4");
                }
                if (d5 != null) {
                    System.out.println("Description:\t" + d5);
                } else {
                    System.out.println("Not Found - Description 5");
                }
                break;
        }
    }

    // ------------------- IMAGE --------------------------
    public void testFindImage() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                img = browser.findElement(By.xpath("//table[1]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                if (img != null) {
                    System.out.println("Image:\t" + img);
                } else {
                    System.out.println("Not Found - Image 1");
                }
                break;
            case 2:
                img = browser.findElement(By.xpath("//table[1]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img2 = browser.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                if (img != null) {
                    System.out.println("Image:\t" + img);
                } else {
                    System.out.println("Not Found - Image 1");
                }
                if (img2 != null) {
                    System.out.println("Image:\t" + img2);
                } else {
                    System.out.println("Not Found - Image 2");
                }
                break;
            case 3:
                img = browser.findElement(By.xpath("//table[1]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img2 = browser.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img3 = browser.findElement(By.xpath("//table[3]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                if (img != null) {
                    System.out.println("Image:\t" + img);
                } else {
                    System.out.println("Not Found - Image 1");
                }
                if (img2 != null) {
                    System.out.println("Image:\t" + img2);
                } else {
                    System.out.println("Not Found - Image 2");
                }
                if (img3 != null) {
                    System.out.println("Image:\t" + img3);
                } else {
                    System.out.println("Not Found - Image 3");
                }
                break;
            case 4:
                img = browser.findElement(By.xpath("//table[1]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img2 = browser.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img3 = browser.findElement(By.xpath("//table[3]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img4 = browser.findElement(By.xpath("//table[4]/tbody/tr[2]/td[1]/img")).getAttribute("src");

                if (img != null) {
                    System.out.println("Image:\t" + img);
                } else {
                    System.out.println("Not Found - Image 1");
                }
                if (img2 != null) {
                    System.out.println("Image:\t" + img2);
                } else {
                    System.out.println("Not Found - Image 2");
                }
                if (img3 != null) {
                    System.out.println("Image:\t" + img3);
                } else {
                    System.out.println("Not Found - Image 3");
                }
                if (img4 != null) {
                    System.out.println("Image:\t" + img4);
                } else {
                    System.out.println("Not Found - Image 4");
                }
                break;
            case 5:
                img = browser.findElement(By.xpath("//table[1]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img2 = browser.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img3 = browser.findElement(By.xpath("//table[3]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img4 = browser.findElement(By.xpath("//table[4]/tbody/tr[2]/td[1]/img")).getAttribute("src");
                img5 = browser.findElement(By.xpath("//table[5]/tbody/tr[2]/td[1]/img")).getAttribute("src");

                if (img != null) {
                    System.out.println("Image:\t" + img);
                } else {
                    System.out.println("Not Found - Image 1");
                }
                if (img2 != null) {
                    System.out.println("Image:\t" + img2);
                } else {
                    System.out.println("Not Found - Image 2");
                }
                if (img3 != null) {
                    System.out.println("Image:\t" + img3);
                } else {
                    System.out.println("Not Found - Image 3");
                }
                if (img4 != null) {
                    System.out.println("Image:\t" + img4);
                } else {
                    System.out.println("Not Found - Image 4");
                }
                if (img5 != null) {
                    System.out.println("Image:\t" + img5);
                } else {
                    System.out.println("Not Found - Image 5");
                }
                break;
        }
    }

    // -------------------------- PRICE -----------------------
    public void testFindPrice() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                p = browser.findElement(By.xpath("//table[1]/tbody/tr[4]/td[1]")).getText();
                if (p != null) {
                    System.out.println("\t" + p);
                } else {
                    System.out.println("Not Found - Price 1");
                }
                break;
            case 2:
                p = browser.findElement(By.xpath("//table[1]/tbody/tr[4]/td[1]")).getText();
                p2 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                if (p != null) {
                    System.out.println("\t" + p);
                } else {
                    System.out.println("Not Found - Price 1");
                }
                if (p2 != null) {
                    System.out.println("\t" + p2);
                } else {
                    System.out.println("Not Found - Price 2");
                }
                break;
            case 3:
                p = browser.findElement(By.xpath("//table[1]/tbody/tr[4]/td[1]")).getText();
                p2 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p3 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                if (p != null) {
                    System.out.println("\t" + p);
                } else {
                    System.out.println("Not Found - Price 1");
                }
                if (p2 != null) {
                    System.out.println("\t" + p2);
                } else {
                    System.out.println("Not Found - Price 2");
                }
                if (p3 != null) {
                    System.out.println("\t" + p3);
                } else {
                    System.out.println("Not Found - Price 3");
                }
                break;
            case 4:
                p = browser.findElement(By.xpath("//table[1]/tbody/tr[4]/td[1]")).getText();
                p2 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p3 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p4 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                if (p != null) {
                    System.out.println("\t" + p);
                } else {
                    System.out.println("Not Found - Price 1");
                }
                if (p2 != null) {
                    System.out.println("\t" + p2);
                } else {
                    System.out.println("Not Found - Price 2");
                }
                if (p3 != null) {
                    System.out.println("\t" + p3);
                } else {
                    System.out.println("Not Found - Price 3");
                }
                if (p4 != null) {
                    System.out.println("\t" + p4);
                } else {
                    System.out.println("Not Found - Price 4");
                }
                break;
            case 5:
                p = browser.findElement(By.xpath("//table[1]/tbody/tr[4]/td[1]")).getText();
                p2 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p3 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p4 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();
                p5 = browser.findElement(By.xpath("//table[2]/tbody/tr[4]/td[1]")).getText();

                if (p != null) {
                    System.out.println("\t" + p);
                } else {
                    System.out.println("Not Found - Price 1");
                }
                if (p2 != null) {
                    System.out.println("\t" + p2);
                } else {
                    System.out.println("Not Found - Price 2");
                }
                if (p3 != null) {
                    System.out.println("\t" + p3);
                } else {
                    System.out.println("Not Found - Price 3");
                }
                if (p4 != null) {
                    System.out.println("\t" + p4);
                } else {
                    System.out.println("Not Found - Price 4");
                }
                if (p5 != null) {
                    System.out.println("\t" + p5);
                } else {
                    System.out.println("Not Found - Price 5");
                }
                break;
        }
    }

    // ---------------------------- LINK ------------------------
    public void testFindLink() {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is:\t" + header.size());
        int size = header.size();
        switch (size) {
            case 1:
                l = browser.findElement(By.xpath("//table[1]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                if (l != null) {
                    System.out.println("Link:\t" + l);
                } else {
                    System.out.println("Not Found - Link 1");
                }
                break;
            case 2:
                l = browser.findElement(By.xpath("//table[1]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l2 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                if (l != null) {
                    System.out.println("Link:\t" + l);
                } else {
                    System.out.println("Not Found - Link 1");
                }
                if (l2 != null) {
                    System.out.println("Link:\t" + l2);
                } else {
                    System.out.println("Not Found - Link 2");
                }
                break;
            case 3:
                l = browser.findElement(By.xpath("//table[1]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l2 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l3 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                if (l != null) {
                    System.out.println("Link:\t" + l);
                } else {
                    System.out.println("Not Found - Link 1");
                }
                if (l2 != null) {
                    System.out.println("Link:\t" + l2);
                } else {
                    System.out.println("Not Found - Link 2");
                }
                if (l3 != null) {
                    System.out.println("Link:\t" + l3);
                } else {
                    System.out.println("Not Found - Link 3");
                }
                break;
            case 4:
                l = browser.findElement(By.xpath("//table[1]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l2 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l3 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l4 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                if (l != null) {
                    System.out.println("Link:\t" + l);
                } else {
                    System.out.println("Not Found - Link 1");
                }
                if (l2 != null) {
                    System.out.println("Link:\t" + l2);
                } else {
                    System.out.println("Not Found - Link 2");
                }
                if (l3 != null) {
                    System.out.println("Link:\t" + l3);
                } else {
                    System.out.println("Not Found - Link 3");
                }
                if (l4 != null) {
                    System.out.println("Link:\t" + l4);
                } else {
                    System.out.println("Not Found - Link 4");
                }
                break;
            case 5:
                l = browser.findElement(By.xpath("//table[1]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l2 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l3 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l4 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");
                l5 = browser.findElement(By.xpath("//table[2]/tbody/tr[5]/td[1]/a")).getAttribute("href");

                if (l != null) {
                    System.out.println("Link:\t" + l);
                } else {
                    System.out.println("Not Found - Link 1");
                }
                if (l2 != null) {
                    System.out.println("Link:\t" + l2);
                } else {
                    System.out.println("Not Found - Link 2");
                }
                if (l3 != null) {
                    System.out.println("Link:\t" + l3);
                } else {
                    System.out.println("Not Found - Link 3");
                }
                if (l4 != null) {
                    System.out.println("Link:\t" + l4);
                } else {
                    System.out.println("Not Found - Link 4");
                }
                if (l5 != null) {
                    System.out.println("Link:\t" + l5);
                } else {
                    System.out.println("Not Found - Link 5");
                }
                break;
        }
    }

    // ---------------- TABLE ------------------------
    public void testGetNumber(int int1) {
        List<WebElement> header = browser.findElements(By.xpath("//table"));
        System.out.println("The number of table is" + header.size());
        int size = header.size();
        if (size == int1) {
            switch (size) {
                case 1:
                    t = browser.findElement(By.xpath("//table[1]")).getText();
                    if (t != null) {
                        System.out.println("Table 1 URL:\t" + t);
                    } else {
                        System.out.println("Not Found - Table 1");
                    }
                    break;
                case 2:
                    t = browser.findElement(By.xpath("//table[1]")).getText();
                    t2 = browser.findElement(By.xpath("//table[2]")).getText();
                    if (t != null) {
                        System.out.println("Table 1 URL:\t" + t);
                    } else {
                        System.out.println("Not Found - Table 1");
                    }

                    if (t2 != null) {
                        System.out.println("Table 2 URL:\t" + t2);

                    } else {
                        System.out.println("Not Found - Table 2");
                    }
                    break;
                case 3:
                    t = browser.findElement(By.xpath("//table[1]")).getText();
                    t2 = browser.findElement(By.xpath("//table[2]")).getText();
                    t3 = browser.findElement(By.xpath("//table[3]")).getText();
                    if (t != null) {
                        System.out.println("Table 1 URL:\t" + t);
                    } else {
                        System.out.println("Not Found - Table 1");
                    }
                    if (t2 != null) {
                        System.out.println("Table 2 URL:\t" + t2);

                    } else {
                        System.out.println("Not Found - Table 2");
                    }
                    if (t3 != null) {
                        System.out.println("Table 3 URL:\t" + t3);

                    } else {
                        System.out.println("Not Found - Table 3");
                    }
                    break;
                case 4:
                    t = browser.findElement(By.xpath("//table[1]")).getText();
                    t2 = browser.findElement(By.xpath("//table[2]")).getText();
                    t3 = browser.findElement(By.xpath("//table[3]")).getText();
                    t4 = browser.findElement(By.xpath("//table[4]")).getText();

                    if (t != null) {
                        System.out.println("Table 1 URL:\t" + t);
                    } else {
                        System.out.println("Not Found - Table 1");
                    }

                    if (t2 != null) {
                        System.out.println("Table 2 URL:\t" + t2);

                    } else {
                        System.out.println("Not Found - Table 2");
                    }
                    if (t3 != null) {
                        System.out.println("Table 3 URL:\t" + t3);

                    } else {
                        System.out.println("Not Found - Table 3");
                    }
                    if (t4 != null) {
                        System.out.println("Table 4 URL:\t" + t4);

                    } else {
                        System.out.println("Not Found - Table 4");
                    }
                    break;
                case 5:
                    t = browser.findElement(By.xpath("//table[1]")).getText();
                    t2 = browser.findElement(By.xpath("//table[2]")).getText();
                    t3 = browser.findElement(By.xpath("//table[3]")).getText();
                    t4 = browser.findElement(By.xpath("//table[4]")).getText();
                    t5 = browser.findElement(By.xpath("//table[5]")).getText();
                    if (t != null) {
                        System.out.println("Table 1 URL:\t" + t);
                    } else {
                        System.out.println("Not Found - Table 1");
                    }
                    if (t2 != null) {
                        System.out.println("Table 2 URL:\t" + t2);

                    } else {
                        System.out.println("Not Found - Table 2");
                    }
                    if (t3 != null) {
                        System.out.println("Table 3 URL:\t" + t3);

                    } else {
                        System.out.println("Not Found - Table 3");
                    }
                    if (t4 != null) {
                        System.out.println("Table 4 URL:\t" + t4);

                    } else {
                        System.out.println("Not Found - Table 4");
                    }
                    if (t5 != null) {
                        System.out.println("Table 5 URL:\t" + t5);
                    } else {
                        System.out.println("Not Found - Table 5");
                    }
                    break;
            }
        } else {
            System.out.println("Error - There is more or less than alert required");
        }
    }
}
