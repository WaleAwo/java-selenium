package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homepage.goToElements().clickTextBox();
        textBoxPage.setFullName("John Doe");
        textBoxPage.setEmail("test@test.com");
        textBoxPage.setCurrentAddress("First Line");
        textBoxPage.setCurrentAddress("Second Line");
        textBoxPage.setCurrentAddress("Third Line");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddressResult();
        String expectedAddress = "First Line";

        Assert.assertTrue(actualAddress.
                contains(expectedAddress), "\n Actual address does not contain 'First Line'\n");
    }
}
