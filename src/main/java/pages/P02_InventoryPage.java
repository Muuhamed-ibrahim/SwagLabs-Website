package pages;

import actions.CustomDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;
import java.util.Collections;

public class P02_InventoryPage extends PageBase {

    public P02_InventoryPage(WebDriver driver) {
        super(driver);
    }

    final private By cartBtn = By.id("shopping_cart_container");

    private double totalPrice = 0;

    public P02_InventoryPage addItemsToCartRandomly() throws InterruptedException {
        int randomNumber = Utility.generateRandomNumber();
        System.out.println("Adding " + randomNumber + " random items to the cart.");

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(@class, 'btn_inventory')]"));
        Collections.shuffle(addToCartButtons);
        Thread.sleep(3000);

        totalPrice = 0;
        for (int i = 0; i < randomNumber && i < addToCartButtons.size(); i++) {
            WebElement button = addToCartButtons.get(i);
            button.click();
            Thread.sleep(3000);

            WebElement itemElement = button.findElement(By.xpath("./ancestor::div[@class='inventory_item']"));
            String priceText = itemElement.findElement(By.xpath(".//div[@class='inventory_item_price']")).getText();

            double price = Double.parseDouble(priceText.replace("$", ""));
            totalPrice += price;
        }

        Thread.sleep(3000);
        System.out.println("Total price of added items: " + totalPrice);
        return this;
    }

    public P02_InventoryPage clickOnCartBtn() {
        //driver.findElement(cartBtn).click();
        new CustomDecorator(driver,cartBtn,2000).click();
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
