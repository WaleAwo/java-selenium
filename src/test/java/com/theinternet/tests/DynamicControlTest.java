package com.theinternet.tests;

import com.theinternet.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DynamicControlTest extends BaseTest {

    @Test
    public void testDynamicControl() {
        var dynamicControlPage = homePage.goToDynamicControls();
        dynamicControlPage.clickEnabledButton();
        dynamicControlPage.clickInputField();
        String actualMessage = dynamicControlPage.getMessageText();

        assertTrue(actualMessage.contains("enabled!"));
    }
}
