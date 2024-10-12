package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;

public class LinksPage extends ElementsPage {

    private final By badRequestLink = By.id("bad-request");
    private final By responseLink = By.id("linkResponse");

    public void clickBadRequestLink() {
        click(badRequestLink);
    }

    public String getResponse() {
        return getText(responseLink);
    }
}
