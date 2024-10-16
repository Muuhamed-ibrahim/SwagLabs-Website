package testcases;

import org.testng.annotations.Test;
import pages.P02_InventoryPage;

public class TC02_Inventory extends TestBase{
    @Test
    public void selectItemsRandomly() throws InterruptedException {
        new P02_InventoryPage(driver).addItemsToCartRandomly();
    }
}
