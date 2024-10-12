package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private final By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String option) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, option);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String option) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, option);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
