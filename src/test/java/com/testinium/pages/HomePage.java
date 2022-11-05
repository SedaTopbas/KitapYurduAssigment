package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods;
    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(){

        methods = new Methods();
    }

    public void homeControl(){

        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-text']")));
        methods.click(By.xpath("//div[@class='logo-text']"));
        logger.info("Anasayfaya gidildi.");
        methods.waitBySeconds(5);


    }
}
