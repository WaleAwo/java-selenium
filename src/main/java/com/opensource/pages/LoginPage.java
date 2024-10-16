package com.opensource.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class LoginPage extends BasePage {
    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.tagName("button");
    private final By dashboardHeader = By.tagName("h6");

    public void setUsernameField(String username) {
        fluentWaitUntilVisible(2, usernameField);
        setText(usernameField, username);
    }

    public void setPasswordField(String password) {
        setText(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public String getDashboardHeader() {
        fluentWaitUntilVisible(2, dashboardHeader);
        return getText(dashboardHeader);
    }

}
