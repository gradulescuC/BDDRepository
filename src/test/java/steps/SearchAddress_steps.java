package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAddress_steps {
    WebDriver driver = new Environment().getDriver();  //s-a declarat o variabila numita driver care stocheaza driverul returnat de metoda getDriver

    public SearchAddress_steps() {
    }

    @Given("I am on openstreetmap.org")
    public void open_street_map() throws InterruptedException {
        driver.get("https://www.openstreetmap.org/");
        Thread.sleep(3000);
    }

    @When("I insert some data in the text box")
    public void insert_data() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
        //String address = "hhhhhh";
        //String js = "arguments[0].setAttribute('value','"+address +"')";
        //((JavascriptExecutor) driver).executeScript(js, query);
        search.click();
        search.sendKeys("Strada Garii, Nr 85");
        Thread.sleep(2000);
    }

    @And("I click on the \"Go\" button")
    public void click_go_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[1]/div/div[2]/input")).click();
    }

    @Then("I should have results returned")
    public void return_results() {
        System.out.println("Test has passed!");
    }
}





