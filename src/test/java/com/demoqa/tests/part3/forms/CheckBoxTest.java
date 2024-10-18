package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

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
