package part2.com.saucedemo.tests.login;

import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("Incorrect_password");
        loginPage.clickLoginButton();
        
        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface"));
    }
}
