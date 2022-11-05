package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.*;
import org.junit.Test;

public class GeneralTest extends BaseTest {

    @Test
    public void generalTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        PointCatalog pointCatalogPage = new PointCatalog();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        loginPage.login();
        productPage.searchProduct();
        productPage.scrollAndHover();
        productPage.scrollAndAddFavorite();
        homePage.homeControl();
        pointCatalogPage.pointCatalog();
        pointCatalogPage.allBooks();
        pointCatalogPage.selectRandomBook();
        pointCatalogPage.addToCart();
        pointCatalogPage.goToFavorites();
        pointCatalogPage.deleteFavorite();
        cartPage.goToCart();
        cartPage.increaseProductNum("3");
        cartPage.buyButton();
        cartPage.addAddress();
        cartPage.payment();
        cartPage.logOut();

    }


}
