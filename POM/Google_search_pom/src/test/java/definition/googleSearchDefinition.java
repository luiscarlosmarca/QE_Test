package definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageobjects.GoogleHomePage;
import steps.SearchGoogleSteps;

import static utils.Constants.PAGE_HOME_GOOGLE;

public class googleSearchDefinition {

    GoogleHomePage pageGoogle;
    private  WebDriver driver;
    @Before
    public void setup()throws Exception{
        pageGoogle = new GoogleHomePage(driver);
        driver=pageGoogle.chromeDriver();
        pageGoogle.visit(PAGE_HOME_GOOGLE);
    }

    @Steps
    SearchGoogleSteps Google_search;

    @Given("^I’m on the homepage$")
    public void i_m_on_the_homepage() {
        Google_search.into_page();
    }

    @When("^I type \"([^\"]*)\" into the search field$")
    public void i_type_The_name_of_the_wind_into_the_search_field(String words)  {
        Google_search.type_the(words);
    }

    @When("^I click the Google Search button$")
    public void i_click_the_Google_Search_button()  {
        Google_search.search();
    }
    @Then("^I go to the search results page$")
    public void i_go_to_the_search_results_page() {
        Google_search.verify_page();
    }

    @Then("^the first result is \"([^\"]*)\"$")
    public void the_first_result_is(String result)  {
        Google_search.verify_result(result);
    }

    @Then("^I go to the \"([^\"]*)\" page$")
    public void i_go_to_the_page(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
    }


}
