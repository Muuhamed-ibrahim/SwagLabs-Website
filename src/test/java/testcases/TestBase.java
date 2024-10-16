package testcases;

import common.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {

    static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        MyScreenRecorder.startRecording("SwagLabs TestCases");
    }

    @BeforeTest
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
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
