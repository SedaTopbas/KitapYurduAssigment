package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void homeTest(){
    homePage.homeControl();
    }
}
