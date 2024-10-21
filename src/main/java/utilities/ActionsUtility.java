package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility {

    private static Actions act() {
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y) {
        act().dragAndDropBy(source, x, y).perform();
    }

    public static void dragAndDrop(WebElement sourceLocation, WebElement destinationLocation) {
        act().dragAndDrop(sourceLocation, destinationLocation).perform();
    }

    public static void sendKeys(WebElement source, CharSequence keys) {
        act().sendKeys(source, keys).perform();
    }

    public static void sendKeys(CharSequence keys) {
        act().sendKeys(keys).perform();
    }

    public static void contextClick(WebElement source) {
        act().contextClick(source).perform();
    }
}
