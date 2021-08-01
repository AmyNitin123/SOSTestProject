package pages.loactors;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePageLocators {
	

		
		@FindBy(how=How.XPATH,using="//input[@title='Search']")
		public WebElement googleSearchTextBox;
		
		//@FindBy(how=How.XPATH,using="//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")
	//	public WebElement softwaresearchList;
		
		//@FindBy(how=How.XPATH,using="//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")
		//public WebElement literaturesearchList;
		
		@FindBy(how=How.XPATH,using="//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")
		public List<WebElement> searchList;
		

	}



