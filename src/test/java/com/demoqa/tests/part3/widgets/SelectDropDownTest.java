package com.demoqa.tests.part3.widgets;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homepage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("volvo");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        Assert.assertFalse(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
        Assert.assertTrue(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
    }
}
