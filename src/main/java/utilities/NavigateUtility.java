package utilities;

import org.openqa.selenium.WebDriver;

public class NavigateUtility extends Utility {

    private static WebDriver.Navigation navigation() {
        return driver.navigate();
    }

    public static void refreshPage() {
        navigation().refresh();
    }

    public static void navigateBack() {
        navigation().back();
    }

    public static void navigateForward() {
        navigation().forward();
    }
}
