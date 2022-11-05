package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest() {

        ProductPage productPage = new ProductPage();

        productPage.searchProduct();
        productPage.scrollAndHover();
        productPage.scrollAndAddFavorite();

    }

}
