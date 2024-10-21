package com.base;

import org.openqa.selenium.*;

import java.util.List;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void setText(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        WebElement element = find(locator);
        try {
            element.click();
        } catch (ElementNotInteractableException e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }
}
