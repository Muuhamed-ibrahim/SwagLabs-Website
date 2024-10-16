package pages;

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

    public P02_InventoryPage addItemsToCartRandomly() throws InterruptedException {

        int randomNumber = Utility.generateRandomNumber();
        System.out.println("Adding " + randomNumber + " random items to the cart.");

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(@class, 'btn_inventory')]"));

        // خلط العناصر للحصول على ترتيب عشوائي
        Collections.shuffle(addToCartButtons);

        // إضافة عدد عشوائي من العناصر بعد ترتيبهم عشوائيًا
        for (int i = 0; i < randomNumber; i++) {
            addToCartButtons.get(i).click();
        }
        Thread.sleep(1000);
        return this;
    }
}
