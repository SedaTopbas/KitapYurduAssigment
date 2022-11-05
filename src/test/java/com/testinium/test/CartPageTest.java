package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CartPage;
import org.junit.Test;

public class CartPageTest extends BaseTest {

    @Test
    public void goToCart(){
        CartPage cartPage = new CartPage();
        cartPage.goToCart();
    }

    @Test
    public void increaseProductNum(){
        CartPage cartPage = new CartPage();
        cartPage.increaseProductNum("3");

    }

    @Test
    public void buyButton(){
        CartPage cartPage = new CartPage();
        cartPage.buyButton();
    }

    @Test
    public void addAdress(){
        CartPage cartPage = new CartPage();
        cartPage.addAddress();
    }

    @Test
    public void payment(){
        CartPage cartpage = new CartPage();
        cartpage.payment();
    }

    @Test
    public void logOut(){
        CartPage cartPage = new CartPage();
        cartPage.logOut();
    }


}
