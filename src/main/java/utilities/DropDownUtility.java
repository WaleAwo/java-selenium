package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility {

    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String option) {
        findDropDown(locator).selectByVisibleText(option);
    }

    public static void selectByIndex(By locator, int option) {
        findDropDown(locator).selectByIndex(option);
    }

    public static void deselectByValue(By locator, String option) {
        findDropDown(locator).deselectByValue(option);
    }

    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
