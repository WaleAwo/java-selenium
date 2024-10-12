package com.demoqa.pages.alertsframewindows;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;

public class ModalDialogsPage extends AlertsFrameWindowsPage {

    private final By smallModalButton = By.id("showSmallModal");
    private final By smallModelCloseButton = By.id("closeSmallModal");
    private final By smallModalText = By.xpath("//div[contains(text(),'small modal')]");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public void clickSmallModalCloseButton() {
        click(smallModelCloseButton);
    }

    public String getSmallModalText() {
        return getText(smallModalText);
    }
}
