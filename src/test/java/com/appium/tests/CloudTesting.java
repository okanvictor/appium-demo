//package com.appium.tests;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.net.URL;
//import java.time.Duration;
//
//public class CloudTesting {
//    public static String userName = "vasyl75";
//    public static String accessKey = "KG3cs7UeTL6sxVVbcVq3";
//    //instead of connecting to the localhost, we gonna connect to the browserstack server
//    //that server, has access to lots of real phones
//    //By doing this, we don't need appium server or emulator in our computer
//    //appium server and device is on cloud, we don't need local one.
//    public static String URL = "https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
//    private AppiumDriver driver;
//    //my etsy account
//    private String email = "areatha@uspeakw.com";
//    private String password = "Cybertek2020";
//
//    @Test
//    public void test1() throws Exception{
//        //these capabilities are specific to browserstack
//        //you will not use them when you would try to connect to the appium server directly
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("device", "Google Pixel 3 XL");
//        desiredCapabilities.setCapability("os_version", "9.0");
//        desiredCapabilities.setCapability("project", "Calculator");
//        desiredCapabilities.setCapability("build", "My First Build");
//        desiredCapabilities.setCapability("name", "Calculator Test");
//        //app is a parameter that is used to specify application for testing
//        //when you are connecting to appium server, it's just enough to specify path to the app
//        //with browserstack - it doesn't work like this
//        //to make it work, we need to upload app on our account first, then we will be able to test it
//        //break 10 minutes
//        desiredCapabilities.setCapability("app", "bs://4f2361071a8857b7ecf08eb9ccae8325c879b2b9");
//        driver = new AndroidDriver(new URL(URL), desiredCapabilities);
//        //the biggest problem of selenium is synchronization.
//        //basically, it doesn't wait
//        //if element will delay to appear, you will get NoSuchElementException
//        //to prevent this issue, we can use explicit wait
//        //don't use explicit and implicit waits together!
//        //how to use explicit wait in appium?
//        //in the same way like in selenium
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        //wait for get started button
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.etsy.android:id/btn_link")));
//        WebElement getStarted = driver.findElement(By.id("com.etsy.android:id/btn_link"));
//        getStarted.click();
//        //username input box
//        WebElement usernameElement = driver.findElement(AppiumBy.accessibilityId("com.etsy.android:id/edit_username"));
//        //password input box
//        WebElement passwordElement = driver.findElement(AppiumBy.accessibilityId("com.etsy.android:id/edit_password"));
//        //sign in button
//        WebElement signingElement = driver.findElement(AppiumBy.accessibilityId("com.etsy.android:id/button_signin"));
//
//        usernameElement.sendKeys(email);
//        passwordElement.sendKeys(password);
//        signingElement.click();
//
//
//
//        Thread.sleep(5000);
//        driver.close();
//        driver.quit();
//
//    }
//}
