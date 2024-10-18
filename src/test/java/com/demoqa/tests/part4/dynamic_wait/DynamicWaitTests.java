package com.demoqa.tests.part4.dynamic_wait;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DynamicWaitTests extends BaseTest {

    public void testVisibleAfterButtonText() {
        var dynamicPropertiesPage = homepage.goToElements().clickDynamicProperties();
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";

        Assert.assertEquals(actualText, expectedText, "\n Actual and expected text do not match \n");
    }

    public void testProgressBar() {
        var progressBarPage = homepage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartStopButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";

        Assert.assertEquals(actualValue, expectedValue, "\n Actual and expected value do not match \n");
    }
}
