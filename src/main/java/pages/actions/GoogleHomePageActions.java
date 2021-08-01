package pages.actions;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.loactors.GoogleHomePageLocators;
import utils.SeleniumDriver;

public class GoogleHomePageActions {

	GoogleHomePageLocators googleHomePageLocators = null;

	public GoogleHomePageActions() {

		this.googleHomePageLocators = new GoogleHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), googleHomePageLocators);
	}

	public void searchLiterature(String literature) {

		googleHomePageLocators.googleSearchTextBox.sendKeys(literature);

		List<WebElement> literaturesearchlist = (List<WebElement>) googleHomePageLocators.searchList;

		for (int i = 0; i < literaturesearchlist.size(); i++) {

			String literaturelistitem = literaturesearchlist.get(i).getText();

			if (literaturelistitem.equalsIgnoreCase("Literature")) {
				literaturesearchlist.get(i).click();
				break;
			}
		}

	}

	public void searchSoftware(String software) {

		googleHomePageLocators.googleSearchTextBox.sendKeys(software);

		List<WebElement> softwaresearchlist = (List<WebElement>) googleHomePageLocators.searchList;

		for (int i = 0; i < softwaresearchlist.size(); i++) {

			String softwarelistitem = softwaresearchlist.get(i).getText().trim();

			if (softwarelistitem.equalsIgnoreCase(software)) {

				softwaresearchlist.get(i).click();

				break;
			}
		}
	}
}
