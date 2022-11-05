package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.PointCatalog;
import org.junit.Test;


public class PointCatalogTest extends BaseTest {

    @Test
    public void pointCatalogTest() {
        PointCatalog pointCatalog = new PointCatalog();

        pointCatalog.pointCatalog();
        pointCatalog.allBooks();
        pointCatalog.selectRandomBook();
        pointCatalog.addToCart();
        pointCatalog.deleteFavorite();

    }


}
