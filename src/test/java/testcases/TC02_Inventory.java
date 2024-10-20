package testcases;

import org.testng.annotations.Test;
import pages.P02_InventoryPage;

public class TC02_Inventory extends TestBase {
    @Test(priority = 1, description = "add random products and calculate the price")
    public void selectItemsRandomly() throws InterruptedException {
        totalPrice = new P02_InventoryPage(driver).addItemsToCartRandomly().getTotalPrice(); // تخزين السعر الإجمالي
    }

    @Test(priority = 2, description = "click on cart Btn")
    public void clickOnCartBtn() {
        new P02_InventoryPage(driver).clickOnCartBtn();
    }
}
