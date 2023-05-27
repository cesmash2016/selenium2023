package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class guru99payment extends Base{

        @When("I add quantity")
        public void iAddQuantity() {
           WebElement quantityel= driver.findElement(By.xpath("//select[@name='quantity']"));
            Select quantity = new Select(quantityel);
            quantity.selectByValue("4");



        }


    @Then("I click on buy now")
    public void iClickOnBuyNow() {
            driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
    }

    @Then("I add payment information")
    public void iAddPaymentInformation() {
            driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys("1234567891234567");

            // selecting month

           WebElement expmonthel= driver.findElement(By.id("month"));
           Select expmonth= new Select(expmonthel);
           expmonth.selectByValue("3");

           /// selecting year

        WebElement expyearel= driver.findElement(By.id("year"));
        Select expyear= new Select(expyearel);
        expyear.selectByValue("2025");

        driver.findElement(By.id("cvv_code")).sendKeys("2345");



    }

    @Then("I click on pay")
    public void iClickOnPay() {
            driver.findElement(By.xpath("//input[@name='submit']")).click();

    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectext) {

            String actualtxt =driver.findElement(By.xpath("//h2[normalize-space()='Payment successfull!']")).getText();
        assert actualtxt.contains(expectext);

    }
}
