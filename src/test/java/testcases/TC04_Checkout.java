package testcases;

import org.testng.annotations.Test;
import pages.P04_CheckoutPage;

import static utilities.Utility.*;

public class TC04_Checkout extends TestBase{
    String firstname = generateRandomFirstname();
    String lastname = generateRandomLastname();
    String zip = generateRandomZip();
    @Test(priority = 1, description = "Enter Valid data in Checkout Page")
    public void enterDataInCheckoutPage(){
        new P04_CheckoutPage(driver).enterFirstName(firstname).enterLastName(lastname)
                .enterZip(zip).clickOnContinueBtn();
    }
}
