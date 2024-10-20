package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_CheckoutPage extends PageBase{

    public P04_CheckoutPage(WebDriver driver) {
        super(driver);
    }
    final private By firstname = By.xpath("(//input)[1]");
    final private By lastname = By.xpath("(//input)[2]");
    final private By zip = By.xpath("(//input)[3]");
    final private By continueBtn = By.xpath("(//input)[4]");

    public P04_CheckoutPage enterFirstName(String firstname){
        driver.findElement(this.firstname).sendKeys(firstname);
        return this;
    }
    public P04_CheckoutPage enterLastName(String lastname){
        driver.findElement(this.lastname).sendKeys(lastname);
        return this;

    }
    public P04_CheckoutPage enterZip(String zip){
        driver.findElement(this.zip).sendKeys(zip);
        return this;

    }
    public P04_CheckoutPage clickOnContinueBtn(){
        driver.findElement(this.continueBtn).click();
        return this;

    }

}
