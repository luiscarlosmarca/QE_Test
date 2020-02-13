package definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SearchGoogleSteps;

public class googleSearchDefinition {


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
    public void the_first_result_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click on the first result link$")
    public void i_click_on_the_first_result_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }



    @Then("^I go to the \"([^\"]*)\" page$")
    public void i_go_to_the_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
