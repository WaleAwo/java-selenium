package com.demoqa.pages.alertsframewindows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.getWindowHandle;
import static utilities.GetUtility.getWindowHandles;
import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends AlertsFrameWindowsPage {
    private final By newWindowButton = By.id("windowButton");
    private final By newTabButton = By.id("tabButton");

    public void clickNewWindowsButton() {
        click(newWindowButton);
    }

    public void clickNewTabButton() {
        click(newTabButton);
    }

    public void switchToNewWindow() {
        String currentHandle = getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");

        Set<String> allHandles = getWindowHandles();
        System.out.println("Number of open windows: " + allHandles.size());

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd window ID: " + handle);
            }
        }
    }
}