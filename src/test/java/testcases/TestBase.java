package testcases;

import common.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static drivers.DriverFactory.getNewInstance;
import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;
import static pages.PageBase.quitBrowser;

@Listeners(listeners.Listener.class)
public class TestBase {

    static WebDriver driver;
    protected static double totalPrice;
    private static String PROJECT_NAME = null;
    private static String PROJECT_URL = null;

    // define Suite Elements
    static Properties prop;
    static FileInputStream readProperty;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        setProjectDetails();
        MyScreenRecorder.startRecording("SwagLabs TestCases");

    }
    private void setProjectDetails() throws IOException {
        // TODO: Step1: define object of properties file
        readProperty = new FileInputStream(
                System.getProperty("user.dir") + "/src/test/resources/properties/environment.properties");
        prop = new Properties();
        prop.load(readProperty);

        // define project name from properties file
        PROJECT_NAME = prop.getProperty("projectName");
        PROJECT_URL = prop.getProperty("url");
    }


    @Parameters("browsername")
    @BeforeTest
    public void setUpDriver(String browsername){
        setDriver(getNewInstance(browsername));
        driver=getDriver();
        driver.get(PROJECT_URL);
    }

    @AfterTest
    public void tearDown(){
        quitBrowser(driver);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();
    }

}