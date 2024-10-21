package com.theinternet.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.explicitWaitUntilClickable;

public class DynamicControlsPage extends BasePage {

    private final By inputField = By.xpath("//form[@id='input-example']/input");
    private final By enabledButton = By.xpath("//form[@id='input-example']/button");
    private final By message = By.id("message");

    public void clickInputField() {
        explicitWaitUntilClickable(3, inputField);
        click(inputField);
    }

    public void clickEnabledButton() {
        click(enabledButton);
    }

    public String getMessageText() {
        return getText(message);
    }
}
