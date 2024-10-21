package com.theinternet.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By addRemoveElements = By.linkText("Add/Remove Elements");
    private final By contextMenu = By.linkText("Context Menu");
    private final By dragAndDrop = By.linkText("Drag and Drop");
    private final By dynamicControls = By.linkText("Dynamic Controls");

    public AddRemoveElementsPage goToAddRemoveElements() {
        click(addRemoveElements);
        return new AddRemoveElementsPage();
    }

    public ContextMenuPage goToContextMenu() {
        click(contextMenu);
        return new ContextMenuPage();
    }

    public DragAndDropPage goToDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage();
    }

    public DynamicControlsPage goToDynamicControls() {
        click(dynamicControls);
        return new DynamicControlsPage();
    }
}