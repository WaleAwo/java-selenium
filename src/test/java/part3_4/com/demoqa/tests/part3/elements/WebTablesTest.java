package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTablesTest extends BaseTest {

    @Test
    public void testWebTables() {
        String email = "kierra@example.com";
        String expectedAge = "57";

        var webTablesPage = homepage.goToElements().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("57");
        webTablesPage.clickSubmitButton();

        String actualAge = webTablesPage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual and expected ages do not match \n");
    }
}
