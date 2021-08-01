package pages.actions;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.loactors.LiteratureSearchResultPageLocators;
import utils.SeleniumDriver;

public class LiteratureSearchResultPageActions {
	
	LiteratureSearchResultPageLocators literatureSearchResultPageLocators=null;
	public LiteratureSearchResultPageActions()
	{
		
		this.literatureSearchResultPageLocators=new LiteratureSearchResultPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), literatureSearchResultPageLocators);
	}

	public void validateWikipediaRanking(String britanicaLink) {


		List<WebElement> litsearchresultlist = literatureSearchResultPageLocators.literaturesearchResultList;
		{
		for (int j = 0; j < litsearchresultlist.size(); j++) {

			String literatureSearchResult = litsearchresultlist.get(j).getText();

				
				if (literatureSearchResult.startsWith("https://www.")
						&& literatureSearchResult.contains(britanicaLink)) {

				int rank = 1;
				rank++;
				System.out.println("The ranking position of "+britanicaLink+" is: " + rank);

	}

}}}}
