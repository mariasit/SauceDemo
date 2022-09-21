package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class WebElements extends BaseTest {
    WebElement elementByLink = driver.findElement(By.linkText("LinkedIn"));
    WebElement elementByPartOfLink = driver.findElement(By.partialLinkText("Linked"));
    WebElement elementByTag = driver.findElement(By.tagName("div"));
    WebElement elementByClassName = driver.findElement(By.className("social_twitter"));
    WebElement elementByXPathOne = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
    WebElement elementByXPathTwo = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
    WebElement elementByCssSelector = driver.findElement(By.cssSelector(".inventory_list > .inventory_item:first-child > .inventory_item_description > .pricebar > button"));
}
