package steps;
import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.fail;

public class EbayHome_steps {

    WebDriver driver = new Environment().getDriver(); // serenity implementation needs an empty constructor in the step definition file

    public EbayHome_steps(){}

    @Given("I am on ebay homepage")
    public void i_am_on_ebay_homepage() {
        driver.get("https://www.ebay.com");
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link()  {
        driver.findElement(By.linkText("Advanced")).click();
    }

    @Then("I navigate to Advanced Search page")
    public void i_navigate_to_advanced_search_page() {
        String expURL = "https://www.ebay.com/sch/ebayadvsearch";
        String actURL = driver.getCurrentUrl();
        if (!expURL.equals(actURL))
        {
            fail("Page does not navigate to expected page");
        }
    }

    @When("I search for {string}")
    public void i_search_for_iphone(String str1) {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
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

  /*  @When("I search for {string} in {string} category")
    public void i_search_for_category(String string, String string1)  {
        driver.findElement(By.id("gh-ac")).sendKeys(string);
        driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
        List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
        for(WebElement x: cat){
            if(x.getText().trim().toLowerCase().equals(string1.toLowerCase())){
                x.click();
                break;
            }
        }
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }*/

}
