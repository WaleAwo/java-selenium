package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products header is not displayed \n");
    }
}
