package pages;

import actions.CustomDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_CartPage extends PageBase{
    public P03_CartPage(WebDriver driver){
        super(driver);
    }

    final private By checkoutBtn = By.xpath("//a[@class=\"btn_action checkout_button\"]");

    public P03_CartPage clickOnCheckoutBtn(){
        //driver.findElement(checkoutBtn).click();
        new CustomDecorator(driver,checkoutBtn,2000);
        return this;
    }
}
