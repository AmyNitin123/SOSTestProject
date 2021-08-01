package pages.actions;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.loactors.SoftwareSearchResultPageLocators;
import utils.SeleniumDriver;

public class SoftwareSearchResultActions {

	SoftwareSearchResultPageLocators softwareSearchResultPageLocators = null;

	public SoftwareSearchResultActions() {

		this.softwareSearchResultPageLocators = new SoftwareSearchResultPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), softwareSearchResultPageLocators);
	}

	public void validateWikipediaRanking(String Wikipedia) {

		List<WebElement> swsearchresultlist = softwareSearchResultPageLocators.softwaresearchResultList;

		String softwareSearchResult = swsearchresultlist.get(0).getText();

		if (softwareSearchResult.contains(Wikipedia)) {

			System.out.println(Wikipedia + "is ranked first in the Software Google Search");
			Assert.assertTrue(true, Wikipedia + "is ranked first in the Software Google Search");

		}

	}
}
