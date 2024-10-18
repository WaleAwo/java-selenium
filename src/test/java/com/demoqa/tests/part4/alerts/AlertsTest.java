package com.demoqa.tests.part4.alerts;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";

        var alertsPage = homepage.goToAlertsFrameWindow().clickAlerts();
        alertsPage.clickInformationAlertButton();

        Assert.assertEquals(getAlertText(),
                expectedAlertText, "\n Actual and expected messages do not match \n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedText = "You selected Cancel";

        var alertsPage = homepage.goToAlertsFrameWindow().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();

        String actualText = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualText, expectedText, "\n Actual and expected messages do not match \n");
    }

    public void testPromptAlert() {
        String alertText = "John Doe";
        String expectedText = "You entered " + alertText;

        var alertsPage = homepage.goToAlertsFrameWindow().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();

        String actualText = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualText, expectedText, "\n Actual and expected message do not match\n");
    }
}
