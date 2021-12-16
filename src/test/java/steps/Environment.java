package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Environment {

    private static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/gradulescu/Desktop/Personal/Diverse/automation/CursAutomatizare/BDDImplementation/BDDRepository/BDD/webdrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1000);
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
