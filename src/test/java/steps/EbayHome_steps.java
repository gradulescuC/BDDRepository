package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.fail;

public class EbayHome_steps {

    WebDriver driver = new Environment().getDriver(); // serenity implementation needs an empty constructor in the step definition file
    public EbayHome_steps(){}

    @Given("I am on ebay homepage")
    public void i_am_on_ebay_homepage() throws InterruptedException {
        driver.get("https://www.ebay.com");
        Thread.sleep(1000);
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() throws InterruptedException {
        driver.findElement(By.linkText("Advanced")).click();
    }

    @Then("I navigate to Advanced Search page")
    public void i_navigate_to_advanced_search_page() {
        String expURL = "https://www.ebay.com/sch/ebayadvsearch";
        String actURL = driver.getCurrentUrl();
       // String actURL = "https://www.ebay.com/sch/ebayadvsearch";
//          assert expURL==actURL;
         //if (!expURL.equals(actURL))
        if (expURL.equals(actURL))
        {
            System.out.println("Test has passed");
        }
        else {
            fail("Page does not navigate to expected page");
        }
    }

    @When("I search for {string}")
    public void i_search_for_iphone(String str1) throws  Exception {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(1000);
    }
    @Then("I have at least {int} search items returned")
    public void i_have_at_least_search_items_returned(int count) {
        String itemCount = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]")).getText().trim();
        String itemCount2 = itemCount.replace(",","");
        int itemCountint  = Integer.parseInt(itemCount2);
        if (!(itemCountint >=count)){
            fail("Less than 1000 items");
        }
    }
}
