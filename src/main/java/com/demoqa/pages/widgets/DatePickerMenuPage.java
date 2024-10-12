package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.GetUtility.getAttribute;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class DatePickerMenuPage extends WidgetsPage {

    private final By selectDateField = By.id("datePickerMonthYearInput");
    private final By monthDropDown = By.className("react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.
                xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day) {
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        try {
            return find(dayValue(day)).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickSelectDate() {
        click(selectDateField);
    }

    public String getDate() {
        return getAttribute(selectDateField, "value");
    }

    public void selectMonth(String month) {
        scrollToElementJS(monthDropDown);
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year) {
        scrollToElementJS(yearDropDown);
        selectByVisibleText(yearDropDown, year);
    }
}
