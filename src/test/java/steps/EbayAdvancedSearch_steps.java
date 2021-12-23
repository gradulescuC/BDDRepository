package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class EbayAdvancedSearch_steps {
    WebDriver driver = new Environment().getDriver();

    public EbayAdvancedSearch_steps(){}

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }

    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
        driver.findElement(By.xpath("//a[@id='gh-la']")).click();
    }

    @Then("I am navigated to Ebay homepage")
    public void i_am_navigated_to_ebay_homepage() {
        String expURL = "https://www.ebay.com/";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        if(!expURL.equals(actualURL)){
            fail("Logo does not navigate to homepage");
        }
    }

    @Given("I am on the advanced search page")
    public void i_am_on_the_advanced_search_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I advance search an item")
    public void i_advance_search_an_item(DataTable dataTable) {

        throw new io.cucumber.java.PendingException();
    }
}
