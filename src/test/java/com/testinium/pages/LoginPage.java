package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;



public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        logger.info("Giriş yap'a tıklandı.");
        methods.waitBySeconds(5);


        methods.sendKeys(By.id("login-email"),"seda.topbas@testinium.com");
        logger.info("Mail girildi.");
        methods.waitBySeconds(5);


        methods.sendKeys(By.cssSelector(".ky-form-group>#login-password"),"SedaTopbas123");
        methods.click(By.cssSelector(".ky-login-btn"));
        logger.info("Şİfre girildi.");
        methods.waitBySeconds(5);


        //Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[contains(text(), 'Hesabım')]")));

        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("Login olunur.");
        methods.waitBySeconds(3);
    }
}
