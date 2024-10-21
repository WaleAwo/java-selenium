package com.theinternet.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementsPage extends BasePage {

    private final By addElementButton = By.xpath("//div[@id='content']//button[contains(text(),'Add')]");
    private final By deleteButton = By.xpath("//div[@id='elements']/button");

    public void clickAddElementButton() {
        click(addElementButton);
    }

    public int getAllDeleteButtons() {
        List<WebElement> deleteButtonsList = findElements(deleteButton);
        return deleteButtonsList.size();
    }

    public void clickDeleteButton(int index) {
        List<WebElement> deleteButtonsList = findElements(deleteButton);

        if (index >= 0 && index < deleteButtonsList.size()) {
            deleteButtonsList.get(index).click();
        } else {
            throw new IllegalArgumentException("Invalid button index: " + index);
        }
    }
}
