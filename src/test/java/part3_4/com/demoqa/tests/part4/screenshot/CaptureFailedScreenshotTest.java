package part3_4.com.demoqa.tests.part4.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJSExecutor() {
        var practiceFormPage = homepage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
