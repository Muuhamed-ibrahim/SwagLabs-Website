package pages;

import actions.CustomDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_OverviewPage extends PageBase {
    public P05_OverviewPage(WebDriver driver) {
        super(driver);
    }

    final private By finishBtn = By.xpath("//a[@class=\"btn_action cart_button\"]");
    final private By totalPriceLocator = By.xpath("//div[@class='summary_subtotal_label']");

    public P05_OverviewPage clickOnFinishBtn() {
        //driver.findElement(finishBtn).click();
        new CustomDecorator(driver,this.finishBtn).click();
        return this;
    }

    public double getFinalPrice() throws InterruptedException {
        Thread.sleep(3000);
        String finalPriceText = driver.findElement(totalPriceLocator).getText().replace("Item total: $", "");
        return Double.parseDouble(finalPriceText);
    }
}
