package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homepage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();

        assertTrue(formsPage.isFemaleRadioButtonSelected(), "\n Button not selected \n");
    }
}
