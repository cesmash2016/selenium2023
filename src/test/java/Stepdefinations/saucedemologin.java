package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class saucedemologin extends Base{

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        driver.findElement(By.cssSelector("#login-button")).click();
    }

    @Then("I should be successfully logged in")
    public void iShouldBeSuccessfullyLoggedIn() {
       String currenturl = driver.getCurrentUrl();
        assert currenturl.contains("/inventory.html");

    }
}
