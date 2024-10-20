package testcases;

import org.testng.annotations.Test;
import pages.P05_OverviewPage;

public class TC05_Overview extends TestBase {
    @Test(priority = 1)
    public void completeOrderAndValidatePrice() throws InterruptedException {
        P05_OverviewPage overviewPage = new P05_OverviewPage(driver);

        double finalPrice = overviewPage.getFinalPrice();

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Final Price: " + finalPrice);

        if (Math.abs(finalPrice - totalPrice) < 0.01) {
            System.out.println("price is matching");
        } else {
            System.out.println("price is not matching");
        }
    }

    @Test(priority = 2)
    public void clickOnFinishBtn() {
        P05_OverviewPage overviewPage = new P05_OverviewPage(driver);
        overviewPage.clickOnFinishBtn();
    }
}
