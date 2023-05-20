package Stepdefinations;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class VehicleSearch extends Base{
    @When("I search for {string}")
    public void iSearchFor(String searchTerm) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        driver.findElement(By.name("q")).sendKeys(searchTerm);
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

    }
    @Then("I verify number of search result is visible")
    public void iVerifyNumberOfSearchResultIsVisible() {
        boolean isDisplayed = driver.findElement(By.cssSelector("#result-stats")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
