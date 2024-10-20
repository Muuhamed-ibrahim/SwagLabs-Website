package testcases;

import org.testng.annotations.Test;
import pages.P03_CartPage;

public class TC03_Cart extends TestBase{

    @Test(priority = 1, description = "Click on checkout Btn")
    public void clickOnCheckoutBtn(){
        new P03_CartPage(driver).clickOnCheckoutBtn();
    }
}
