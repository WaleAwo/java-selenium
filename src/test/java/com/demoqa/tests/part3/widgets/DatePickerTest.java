package com.demoqa.tests.part3.widgets;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {
    String month = "March";
    String monthNumber = "03";
    String year = "2021";
    String day = "14";

    @Test
    public void testDatePicker() {


        var datePickerPage = homepage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate, "\n The dates done match \n");
    }

    @Test
    public void testInvalidDate() {
        var datePickerPage = homepage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);

        Assert.assertFalse(datePickerPage.isDayInMonth("32"));
    }
}
