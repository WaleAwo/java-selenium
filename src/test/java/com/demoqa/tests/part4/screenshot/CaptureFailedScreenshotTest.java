package com.demoqa.tests.part4.screenshot;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJSExecutor() {
        var practiceFormPage = homepage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
