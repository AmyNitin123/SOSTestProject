package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.GoogleHomePageActions;
import pages.actions.SoftwareSearchResultActions;
import utils.SeleniumDriver;

public class SearchSoftwareSteps {

	GoogleHomePageActions googleHomePageActions = new GoogleHomePageActions();
	SoftwareSearchResultActions softwareSearchResultActions = new SoftwareSearchResultActions();

	@Given("^User navigate to \"([^\"]*)\" Google Home page$")
	public void user_navigate_to_google_home_page(String url) {

		SeleniumDriver.openPage(url);
	}

	@When("Enter {string} as search term")
	public void enter_as_search_term(String Searchterm) {

		googleHomePageActions.searchSoftware(Searchterm);

	}

	@Then("ensure {string} is returned as the first rank")
	public void ensure_is_returned_as_the_first_rank(String RankItem) {

		softwareSearchResultActions.validateWikipediaRanking(RankItem);

	}

}