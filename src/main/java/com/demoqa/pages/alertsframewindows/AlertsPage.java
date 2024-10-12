package com.demoqa.pages.alertsframewindows;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;

public class AlertsPage extends AlertsFrameWindowsPage {

    private final By informationAlertButton = By.id("alertButton");
    private final By conformationAlertButton = By.id("confirmButton");
    private final By conformationResult = By.id("confirmResult");
    private final By promptAlertButton = By.id("promtButton");
    private final By promptResult = By.id("promptResult");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(conformationAlertButton);
    }

    public String getConfirmationResult() {
        return getText(conformationResult);
    }

    public void clickPromptAlertButton() {
        click(promptAlertButton);
    }

    public String getPromptAlertResult() {
        return getText(promptResult);
    }
}
