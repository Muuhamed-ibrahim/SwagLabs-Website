package testcases;

import common.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static drivers.DriverFactory.getNewInstance;
import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {

    static WebDriver driver;
    protected static double totalPrice;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        MyScreenRecorder.startRecording("SwagLabs TestCases");
    }

    @Parameters("browsername")
    @BeforeTest
    public void setUpDriver(String browsername){
        setDriver(getNewInstance(browsername));
        driver=getDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();
    }

}
