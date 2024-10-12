package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsCheckBox = By.id("hobbies-checkbox-1");
    private final By readingCheckBox = By.id("hobbies-checkbox-2");
    private final By musicCheckBox = By.id("hobbies-checkbox-3");
    private final By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        click(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void checkSportsCheckBox() {
        if (!find(sportsCheckBox).isSelected()) {
            scrollToElementJS(sportsCheckBox);
            click(sportsCheckBox);
        }
    }

    public void checkReadingCheckBox() {
        if (!find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            click(readingCheckBox);
        }
    }

    public void checkMusicCheckBox() {
        if (!find(musicCheckBox).isSelected()) {
            scrollToElementJS(musicCheckBox);
            click(musicCheckBox);
        }
    }

    public void uncheckReadingCheckBox() {
        if (find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            click(readingCheckBox);
        }
    }

    public boolean isReadingCheckboxSelected() {
        return find(readingCheckBox).isSelected();
    }

    public void clickSubmitButton() {
        click(submitButton);
    }
}
