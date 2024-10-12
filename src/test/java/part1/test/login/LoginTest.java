package part1.test.login;

import org.testng.annotations.Test;
import part1.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        loginPage.setUsernameField("Admin");
        loginPage.setPasswordField("admin123");
        loginPage.clickLoginButton();

        String actualText = loginPage.getDashboardHeader();
        String expectedText = "Dashboard";
        
        assertEquals(actualText, expectedText, "\n Actual and expected text do not match \n");
    }
}
