package com.theinternet.tests;

import com.theinternet.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {
        var dragAndDropPage = homePage.goToDragAndDrop();
        dragAndDropPage.dragAndDropBoxes();

        String actualText = dragAndDropPage.getColumnBText();
        String expectedText = "A";

        assertEquals(actualText, expectedText, "\n Actual and expected text do not match \n");
    }
}
