package com.demoqa.tests.part3.elements;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
        var linksPage = homepage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();

        String actualResponse = linksPage.getResponse();
        assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual response (" + actualResponse + ") \n does not contain '400' and 'Bad Request'");
    }
}
