package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage extends PageBase{


    //TODO: Define Constructor
    public P01_LoginPage(WebDriver driver) {
        super(driver);
    }

    //TODO: Define Locators
    final private By USERNAME_TEXT = By.xpath("//input[@data-test=\"username\"]");
    final private By PASSWORD_TEXT = By.xpath("//input[@data-test=\"password\"]");
    final private By Login_BUTTON = By.id("login-button");

    //TODO: Action Methods
    public P01_LoginPage enterUSERNAME_TXT(String username){
        driver.findElement(this.USERNAME_TEXT).sendKeys(username);
        return this;
    }
    public P01_LoginPage enterPASSWORD_TEXT(String password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }
    public P01_LoginPage clickOnLogin_BUTTON(){
        driver.findElement(this.Login_BUTTON).click();
        return this;
    }

}
