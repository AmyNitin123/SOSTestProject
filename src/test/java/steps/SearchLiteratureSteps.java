package steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.GoogleHomePageActions;
import pages.actions.LiteratureSearchResultPageActions;

public class SearchLiteratureSteps {
	
	GoogleHomePageActions googleHomePageActions=new GoogleHomePageActions();
	LiteratureSearchResultPageActions literatureSearchResultPageActions=new LiteratureSearchResultPageActions();

	@When("Enter {string} as the search item")
	public void enter_as_the_search_item(String searchItem) {
	    googleHomePageActions.searchLiterature(searchItem);
	}

	@Then("Validate the position of {string}")
	public void validate_the_position_of(String RankingItem) {
		
		literatureSearchResultPageActions.validateWikipediaRanking(RankingItem);
	    
	}

}
