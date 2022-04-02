package pkg4;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

// Using fixtures
// Splitting the coding part
// Using one time usable fixture
// Fixture make things little easy and allow to focus developing core needs
public class Demo402_Fixtures {
    WebDriver driver   = null;

    // one time setup before the very first @Test executes
    // notice method associated with it must be static (by design from Junit)
    @BeforeClass
    public static void globalSetUp() throws Exception{
        System.out.println("Log: Reading input data");
        System.out.println("Log: Making required environment database connection");
        System.out.println("Log: Making required environment web-app up");
    }

    // one time teardown after the very last @Test executes
    // notice method associated with it must be static (by design from Junit)
    @AfterClass
    public static void globalTearDown() throws Exception{
        System.out.println("Log: Closing properties file");
        System.out.println("Log: Closing excel file");
        System.out.println("Log: Closing csv file");
        System.out.println("Log: Making required environment Db connection close");
        System.out.println("Log: Making required environment web-app down");
    }

    @Before
    public void setUp() throws Exception {
        String sChromeBinary=System.getProperty("user.dir") + "\\src\\BrowserDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", sChromeBinary);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("test-type");
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
    public void WebScenarioTester1(){
        System.out.println("Log: Navigating to " + "http://localhost:9050/add_remove_elements/");
        driver.get("http://localhost:9050/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        System.out.println("Log: Interacting with an element");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        try{Thread.sleep(4000);}catch (Exception e){}
    }

    @Test
    public void WebScenarioTester2(){
        System.out.println("Log: Navigating to " + "http://localhost:9050/challenging_dom");
        driver.get("http://localhost:9050/challenging_dom");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        System.out.println("Log: Interacting with an element");
        driver.findElement(By.xpath("//a[text()='foo']")).click();
        try{Thread.sleep(4000);}catch (Exception e){}
    }
}


// What may go in @Before/ @After
//      Navigating to home page, clear browser cookies
//      Login / Logout
//      Read test data row
//      Launch/ close chrome instance
//      Log individual test scenario report
//      Take screenshot of failed tests

// What may go in @BeforeClass/ @AfterClass
//      Mostly one time setup activities
//      Read overall website properties
//      Launch/ close chrome instance
//      Prepare and publish final test report/ email it etc

