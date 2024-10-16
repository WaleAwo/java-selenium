package part3_4.com.demoqa.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homepage;

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get("https://demoqa.com/");
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homepage = new HomePage();
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/" +
                    java.time.LocalDate.now() + " " +
                    testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Screenshot located at " + destination);
        }
    }
}
