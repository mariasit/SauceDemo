package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTestXpath extends BaseTest {
    private final static String USERNAME = "standard_user";
    private final static String PASSWORD = "secret_sauce";

    @Test
         public void sauceDemoMainFlowTest(){

        driver.get(Urls.SAUCEDEMO_MAIN);

        driver.findElement(By.name("user-name")).sendKeys(USERNAME);
        driver.findElement(By.name("password")).sendKeys(PASSWORD);
        driver.findElement(By.name("login-button")).submit();

        String itemNameInStore = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();
        String itemPriceInStore = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")).getText();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        driver.get("https://www.saucedemo.com/cart.html");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String itemNameInCart = driver.findElement(By.className("inventory_item_name")).getText();
        String itemPriceInCart = driver.findElement(By.className("inventory_item_price")).getText();

        Assert.assertEquals(itemNameInCart, itemNameInStore);
        Assert.assertEquals(itemPriceInCart, itemPriceInStore);
}

}
