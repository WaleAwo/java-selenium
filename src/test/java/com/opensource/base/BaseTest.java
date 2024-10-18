package com.opensource.base;

import com.base.BasePage;
import com.opensource.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static utilities.ScreenshotUtility.takeFailedResultScreenshot;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void captureScreenshotOnFailure(ITestResult result) {
        takeFailedResultScreenshot(driver, result);
    }
}
