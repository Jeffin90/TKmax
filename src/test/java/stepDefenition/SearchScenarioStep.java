package stepDefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BrowserDriver;

public class SearchScenarioStep extends BrowserDriver {
    @Given("^I am on home page \"([^\"]*)\"$")
    public void i_am_on_home_page(String url) throws Throwable {
        driver.get(url);
    }

    @When("^I enter the product to be search in search tab \"([^\"]*)\"$")
    public void i_enter_the_product_to_be_search_in_search_tab(String search) throws Throwable {
        driver.findElement(By.id("js-site-search-input")).sendKeys(search);
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
        driver.findElement(By.xpath("//li[@id=\"mbSearchbar\"]/form/div/div/button/span/i")).click();
       
    }

    @Then("^I could be able to get the result of list of product that i searched for$")
    public void i_could_be_able_to_get_the_result_of_list_of_product_that_i_searched_for() throws Throwable {
        WebElement uniqueText = driver.findElement(By.xpath("//li[@class=\"active\"]"));
        Assert.assertTrue(uniqueText.isDisplayed());
    }


}
