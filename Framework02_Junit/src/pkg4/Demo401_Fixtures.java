package pkg4;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

// Using fixtures
// A test fixtures is a fixed state of a set of objects used as a baseline for running tests.
// The purpose of a test fixture is to ensure that there is a well known and fixed environment
// in which tests are run so that results are repeatable.
// Splitting the coding part
public class Demo401_Fixtures {
    WebDriver driver   = null;
    String sParamUrl   = "http://localhost:9050/add_remove_elements/";
    String sParamXpath = "//button[text()='Add Element']";

    @Before
    public void setUp() throws Exception {
        String sChromeBinary=System.getProperty("user.dir") + "\\src\\BrowserDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", sChromeBinary);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options);
        System.out.println("Log: Chrome browser instance launched");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        System.out.println("Log: Chrome browser instance closed");
    }

    @Test
    public void WebScenarioTester(){
        System.out.println("Log: Navigating to " + sParamUrl);
        driver.get(sParamUrl);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        System.out.println("Log: Interacting with an element");
        driver.findElement(By.xpath(sParamXpath)).click();
        try{Thread.sleep(4000);}catch (Exception e){}
    }
}
