package com.testinium.pages;


import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){

        methods =  new Methods();
    }

    public void searchProduct(){
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        logger.info("Oyuncak isimli ürün araması yapıldı.");
        methods.waitBySeconds(5);

    }
    public void scrollAndHover(){
        methods.scrollToElement(methods.findElements(By.cssSelector(".grid_7>div.name")).get(6));
        logger.info("7. ürüne scroll edildi.");
        methods.waitBySeconds(5);
    }


    public void scrollAndAddFavorite(){

        int a=7;
        List<WebElement> listElement= methods.listElement(By.cssSelector(".add-to-favorites>.fa.fa-heart"));
        while (a<11){
            listElement.get(a).click();
            a++;
            methods.waitBySeconds(2);
        }
        logger.info("4 ürün favorilere eklendi.");

        Assert.assertTrue("Ürün favorilere eklenemedi.",methods.isElementVisible(By.id("swal2-title")));
        logger.info("Favorilere eklendi kontrolü yapıldı.");

    }

}










