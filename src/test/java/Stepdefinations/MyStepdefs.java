package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Base{

        @When("I add quantity")
        public void iAddQuantity() {
            driver.findElement(By.cssSelector("#three > div > form > div > div.\\31 u.\\31 2u\\$\\(small\\).select-wrapper > select")).click();
            driver.findElement(By.cssSelector("#three > div > form > div > div.\\31 u.\\31 2u\\$\\(small\\).select-wrapper > select > option:nth-child(4)")).click();

        }


    @Then("I click on buy now")
    public void iClickOnBuyNow() {
            driver.findElement(By.cssSelector("#three > div > form > div > div.\\33 u.\\31 2u\\$\\(small\\) > ul > li > input")).click();
    }

    @And("I add payment information")
    public void iAddPaymentInformation() {

    }

    @And("I click on pay")
    public void iClickOnPay() {

    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String arg0) {
    }
}
