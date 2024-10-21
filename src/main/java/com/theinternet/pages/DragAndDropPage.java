package com.theinternet.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDrop;
import static utilities.GetUtility.getText;

public class DragAndDropPage extends BasePage {

    private final By columnABox = By.id("column-a");
    private final By columnBBox = By.id("column-b");

    public String getColumnBText() {
        return getText(columnBBox);
    }

    public void dragAndDropBoxes() {
        dragAndDrop(find(columnABox), find(columnBBox));
    }
}
