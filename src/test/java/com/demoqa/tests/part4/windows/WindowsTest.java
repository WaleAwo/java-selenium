package com.demoqa.tests.part4.windows;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {
    String expectedURL = "https://demoqa.com/sample";

    @Test
    public void testNewWindowURL() {
        var browserWindowsPage = homepage.goToAlertsFrameWindow().clickBrowserWindows();
        browserWindowsPage.clickNewWindowsButton();
        browserWindowsPage.switchToNewWindow();
        String actualURL = getURL();

        Assert.assertEquals(actualURL, expectedURL, "\n Actual and expected URL do not match \n");
    }

    @Test
    public void testNewTabWindowURL() {
        var browserWindowsPage = homepage.goToAlertsFrameWindow().clickBrowserWindows();
        browserWindowsPage.clickNewTabButton();
        browserWindowsPage.switchToNewWindow();
        String actualURL = getURL();

        Assert.assertEquals(actualURL, expectedURL, "\n Actual and expected URL do not match \n");
    }
}
