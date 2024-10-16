package testcases;

import common.MyScreenRecorder;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.PageBase;

public class TC01_Login extends TestBase{

    String username = "standard_user";
    String password = "secret_sauce";

    @Test(priority = 1, description = "Login with Valid Username and Password")
    public void loginWithValidUsernameAndPassword() throws Exception {

        new P01_LoginPage(driver).enterUSERNAME_TXT(username).enterPASSWORD_TEXT(password).clickOnLogin_BUTTON();

        // Take Screenshot
        PageBase.captureScreenshot(driver,"LoginScreenshot");
        // Assert if login successfully


    }
}
