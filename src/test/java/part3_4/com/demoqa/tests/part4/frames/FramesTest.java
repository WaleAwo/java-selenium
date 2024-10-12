package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class FramesTest extends BaseTest {

    public void testFramesBigBox() {
        var framesPage = homepage.goToAlertsFrameWindow().clickFrames();
        String expectedText = "This is a sample page";
        String actualText = framesPage.getTextInBigFrame();

        Assert.assertEquals(actualText, expectedText, "\n Actual and expected message done match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText,
                expectedHeaderText, "\n  Actual and expected message do not match \n");
    }

    public void testFramesSmallBox() {
        var framesPage = homepage.goToAlertsFrameWindow().clickFrames();
        String expectedText = "This is a sample page";
        String actualText = framesPage.getTextInSmallFrame();

        Assert.assertEquals(actualText, expectedText, "\n Actual and expected message done match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText,
                expectedHeaderText, "\n  Actual and expected message do not match \n");
    }
}
