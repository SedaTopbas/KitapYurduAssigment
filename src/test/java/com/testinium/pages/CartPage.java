package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CartPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public CartPage(){
        methods = new Methods();
    }

    public void goToCart() {
        methods.click(By.xpath("//h4[@class='common-sprite']"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        logger.info("Sepete gidildi.");
        methods.waitBySeconds(3);
    }

    public void increaseProductNum(String num){
        methods.clear(By.xpath("//input[@name='quantity']"));
        methods.sendKeys(By.xpath("//input[@name='quantity']"), num);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='right']"));
        logger.info("Sepetteki ürün sayısı arttırıldı.");
        methods.waitBySeconds(3);
    }

    public void buyButton(){
        methods.findElement(By.cssSelector("button.red")).click();
        logger.info("Satın al butonuna tıklandı.");
        methods.waitBySeconds(3);

    }

    public void addAddress(){
        methods.findElement(By.id("address-firstname-companyname")).click();
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-firstname-companyname"),"Seda");
        methods.sendKeys(By.id(("address-lastname-title")),"Topbas");
        methods.selectByText(By.id("address-country-id"),"Türkiye");
        methods.selectByText(By.id("address-zone-id"),"Ankara");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"), "AKYURT");
        methods.sendKeys(By.id("address-address-text"),"adres ekleme");
        methods.sendKeys(By.id("address-mobile-telephone"),"5554535251");
        methods.waitBySeconds(3);

        methods.click(By.id("button-checkout-continue"));
        logger.info("Adres bilgileri kaydedildi.");
        methods.waitBySeconds(5);
        }

    public void payment(){
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-owner"),"Seda Topbas");
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.sendKeys(By.id("credit_card_number_2"),"1111");
        methods.sendKeys(By.id("credit_card_number_3"),"1111");
        methods.sendKeys(By.id("credit_card_number_4"),"1111");
        methods.selectByText(By.id("credit-card-expire-date-month"),"01");
        methods.selectByText(By.id("credit-card-expire-date-year"),"2023");
        methods.sendKeys(By.id("credit-card-security-code"),"000");
        methods.click(By.id("button-checkout-continue"));
        logger.info("Geçersiz kart bilgileri girildi.");
        methods.waitBySeconds(5);

        methods.isElementVisible(By.xpath("//span[@class='error']"));
        logger.info("Hata mesajı alındı.");
        methods.waitBySeconds(3);

    }
    public void logOut(){
        methods.click(By.xpath("//img[@title='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("common-sprite"), "Çıkış");
        logger.info("Çıkış yapıldı.");
        methods.waitBySeconds(3);
    }
}
