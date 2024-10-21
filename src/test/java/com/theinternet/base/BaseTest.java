package com.theinternet.base;

import com.base.BasePage;
import com.theinternet.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.ScreenshotUtility.takeFailedResultScreenshot;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get("https://the-internet.herokuapp.com/");
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new com.theinternet.pages.HomePage();
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void captureScreenshotOnFailure(ITestResult result) {
        takeFailedResultScreenshot(driver, result);
    }
}
