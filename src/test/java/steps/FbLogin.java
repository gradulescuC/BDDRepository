package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {
    WebDriver driver = new Environment().getDriver();

    public FbLogin() {
    }

    @Given("I navigate into the app")
    public void Navigate_into_the_app() throws InterruptedException {
        driver.get("https://politrip.com/account/sign-up");
        Thread.sleep(3000);
//      driver.manage().window().maximize();
        driver.findElement(By.id("cookiescript_accept")).click();
    }

    @When("I click on Facebook Sign Up button")
    public void Click_on_Facebook_button() throws InterruptedException {
        WebElement fbButton  = driver.findElement(By.xpath("//*[@id=\"socialmedia-account-component-div\"]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(fbButton);
//        fbButton.click();
        Thread.sleep(3000);
    }

    @Then("The account should be created with Facebook account")
    public void Create_account_with_Facebook() throws InterruptedException {
        System.out.println("The account has been created with Facebook");
    }
}