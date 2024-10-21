package com.theinternet.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.contextClick;

public class ContextMenuPage extends BasePage {

    private final By contextMenuBox = By.id("hot-spot");

    public void clickContextMenuBox() {
        contextClick(find(contextMenuBox));
    }
}
