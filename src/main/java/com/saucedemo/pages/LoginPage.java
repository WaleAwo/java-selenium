package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.GetUtility.getText;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("#login_button_container h3");

    public void setUsername(String username) {
        setText(usernameField, username);
    }

    public void setPassword(String password) {
        setText(passwordField, password);
    }

    // transition to another page
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    // combines multiple methods + transition to another page
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }
}
