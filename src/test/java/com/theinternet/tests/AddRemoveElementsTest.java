package com.theinternet.tests;

import com.theinternet.base.BaseTest;
import com.theinternet.pages.AddRemoveElementsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class AddRemoveElementsTest extends BaseTest {

    public void testAddButton() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.goToAddRemoveElements();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickAddElementButton();

        int actualButtonCount = addRemoveElementsPage.getAllDeleteButtons();
        int expectButtonCount = 2;
        assertEquals(actualButtonCount, expectButtonCount, "\n Button count do not match \n");
    }

    public void testDeleteButton() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.goToAddRemoveElements();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickDeleteButton(1);

        int actualButtonCount = addRemoveElementsPage.getAllDeleteButtons();
        int expectButtonCount = 1;
        assertEquals(actualButtonCount, expectButtonCount, "\n Button count do not match \n");
    }
}
