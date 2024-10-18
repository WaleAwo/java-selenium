package com.opensource.test.login;

import com.opensource.base.BaseTest;
import org.testng.annotations.Test;

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
