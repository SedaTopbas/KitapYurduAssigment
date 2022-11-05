package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PointCatalog {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public PointCatalog() {

        methods = new Methods();
    }

    public void pointCatalog() {
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        logger.info("Puan Kataloğu'na tıklandı.");
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        logger.info("Türk Klasikleri'ne tıkladı.");
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");
        logger.info("Yüksek oylama filtrelemesi yapıldı.");
        methods.waitBySeconds(5);
    }

    public void allBooks() {
        WebElement element = methods.findElement(By.xpath(".//span[contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);
        methods.scrollToElement(element);
        methods.waitBySeconds(1);
        element.findElement(By.xpath("//*[text()='Hobi']")).click();
        logger.info("Tüm Kitaplar altındaki Hobi kategorisine tıklandı.");
        methods.waitBySeconds(2);
    }

    public void selectRandomBook() {
        methods.randomElement(By.cssSelector(".pr-img-link>img")).click();
        logger.info("Rastgele kitap seçimi yapıldı.");
        methods.waitBySeconds(3);
    }

    public void addToCart() {
        methods.findElement(By.id("button-cart")).click();
        logger.info("Kitap sepete eklendi.");
        methods.waitBySeconds(3);
    }

    public void goToFavorites() {
        methods.hover(By.xpath("//div[@class='menu top my-list']"));
        logger.info("Listelerim'e tıklandı.");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        logger.info("Favorilerim'e gidildi.");
        methods.waitBySeconds(2);
    }

    public void deleteFavorite() {
        methods.findElement(By.xpath("(//a[@data-title='Favorilerimden Sil'])[3]")).click();
        logger.info("Favorilerimdeki 3. ürün silinir");
        methods.waitBySeconds(2);
    }






}

