package pkg3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class Demo300_Selenium {

    // below parameters needs to be used frequently
    private String sParamUrl   = "";
    private String sParamXpath = "";

    // An object of this class will be created whenever a @Test will run
    public Demo300_Selenium(String sUrl, String sXpath) {
        sParamUrl      = sUrl;
        sParamXpath    = sXpath;
    }

    @Parameterized.Parameters
    public static Collection WebDataSupplier() {

        return Arrays.asList(new Object[][] {
          { "http://the-internet.herokuapp.com/add_remove_elements/",  // url
                  "//button[text()='Add Element']"},                   // xpath
          { "http://the-internet.herokuapp.com/disappearing_elements", // url
                  "//a[text()='About']"},                              // xpath
          { "http://the-internet.herokuapp.com/dynamic_content?with_content=static", // url
                  "//a[text()='click here']"}                                        // xpath
        });
    }

    // below @Test method will run for every set of data passed from parameterized annotation
    @Test
    public void WebScenarioTester(){
        String sChromeBinary=System.getProperty("user.dir") + "\\src\\BrowserDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", sChromeBinary);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);

        System.out.println("Navigating to " + sParamUrl);
        driver.get(sParamUrl);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        System.out.println("Clicking on element");
        driver.findElement(By.xpath(sParamXpath)).click();
        try{Thread.sleep(4000);}catch (Exception e){}

        driver.quit();
    }

}
