package com.test.site;


import com.annotation.values.Author;
import com.annotation.values.Description;
import com.appium.manager.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;


@Description("This Test validates swipe scenarios")
public class HomePageTest2 {
    public MyClass myClass;

    public AppiumDriver<MobileElement> driver;


    @Test(groups = "smoke", description = "Testing Skips")
    @Author(name = "AnsonLiao")
    public void testMethodOne1() throws Exception {
        Thread.sleep(5000);
        AppiumDriverManager.getDriver().findElementByAccessibilityId("login").click();
        AppiumDriverManager.getDriver().findElementByAccessibilityId("doubleTap").click();
        Thread.sleep(2000);
        AppiumDriverManager.getDriver().quit();
    }



    public AppiumDriver<MobileElement> getDriver() {
        driver = AppiumDriverManager.getDriver();
        return driver;
    }

    @Test(groups = "smoke1234", description = "Testing Skips")
    @Author(name = "AnsonLiao")
    public void testMethodOne2() throws Exception {
        myClass = new MyClass();
        getDriver().get("https://c04-m-virgintrains.ttlnonprod.com/journeySummaryPage");
        Assert.assertTrue(driver.getCurrentUrl().contains("virgin"));
    }


}
