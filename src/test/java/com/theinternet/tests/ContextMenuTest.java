package com.theinternet.tests;

import com.theinternet.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.goToContextMenu();
        contextMenuPage.clickContextMenuBox();

        String actualText = getAlertText();
        String expectedText = "You selected a context menu";
        acceptAlert();

        assertEquals(actualText, expectedText, "\n Actual and expected text do not match \n");
    }
}
