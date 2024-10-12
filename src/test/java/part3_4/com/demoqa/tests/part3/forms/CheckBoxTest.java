package part3_4.com.demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static org.testng.Assert.assertFalse;


public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homepage.goToForms().clickPracticeForm();
        formsPage.checkSportsCheckBox();
        formsPage.checkReadingCheckBox();
        formsPage.checkMusicCheckBox();
        formsPage.uncheckReadingCheckBox();

        assertFalse(formsPage.isReadingCheckboxSelected(), "\n Checkbox is selected \n");
    }
}
