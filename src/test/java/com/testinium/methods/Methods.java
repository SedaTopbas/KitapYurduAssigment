package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    Actions actions;

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        //Ne kadar bir aramalı? Max ne kadar sürede aramalı?
        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).
                ignoring(NoSuchElementException.class);
        actions = new Actions(driver);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public void click(By by) {

        findElement(by).click();
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;

        }
    }

    public void sendKeys(By by, String text) {

        findElement(by).sendKeys(text);
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));

    }

    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }

    public int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public WebElement randomElement(By by) {

        List<WebElement> elementList = wait.until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(by));
        return elementList.get(randomNumber(elementList.size()));
    }


    public void hover(By by) {

        WebElement we = driver.findElement(by);
        actions.moveToElement(we).build().perform();

    }

    public void scrollToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public List<WebElement> listElement(By by) {
        List<WebElement> elementList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return elementList;

    }
    public void clear(By by) {
        findElement(by).clear();
    }
}
