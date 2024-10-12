package com.demoqa.pages.alertsframewindows;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFrameWindowsPage {

    private final By textInFrame = By.id("sampleHeading");
    private final By headerFramesText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private final By iframeSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    private void switchToBigBox() {
        String iFrameBigBox = "frame1";
        switchToFrameSting(iFrameBigBox);
    }

    private void switchToSmallBox() {
        //switchToFrameIndex(3);
        switchToFrameWebElement(find(iframeSmallBox)); // find by WebElement
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = getText(textInFrame);
        System.out.println("Small frame text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = getText(textInFrame);
        System.out.println("Big frame text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return getText(headerFramesText);
    }
}
