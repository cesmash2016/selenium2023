package Stepdefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Stepdefinations.Base.driver;

public class demoqa {
        @When("I expand all checkboxes")
        public void iExpandAllCheckboxes() {
            driver.findElement(By.cssSelector(".rct-option-expand-all")).click();
        }


        @And("I check public and private")
        public void iCheckPublicAndPrivate() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(483, 625)", "");
            driver.findElement(By.cssSelector("label[for='tree-node-public']")).click();
            driver.findElement(By.cssSelector("label[for='tree-node-private']")).click();
        }

        @Then("I should see a text called {string}")
        public void iShouldSeeATextCalled(String expectedText) {
            // #result

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
            wait.until(ExpectedConditions.textToBe( By.cssSelector("#result"),"You have selected :publicprivate"));

            String actualText = driver.findElement(By.cssSelector("#result")).getText().trim();
            String actualTextNoNewLine = actualText.replace("\n", "");

            System.out.println(actualTextNoNewLine);
            assert actualTextNoNewLine.contains(expectedText);








        }
}

