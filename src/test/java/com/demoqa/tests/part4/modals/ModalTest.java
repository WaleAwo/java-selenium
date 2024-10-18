package com.demoqa.tests.part4.modals;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var modalDialogsPage = homepage.goToAlertsFrameWindow().clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();

        String actualText = modalDialogsPage.getSmallModalText();

        Assert.assertTrue(actualText.
                contains("small modal"), "\n The message does not contain 'small modal' \n");
        modalDialogsPage.clickSmallModalCloseButton();
    }
}
