package pages.loactors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SoftwareSearchResultPageLocators {
	
	@FindBy(how=How.XPATH,using="//div[@id='search']//div/descendant::div[@class='yuRUbf']")
	public List<WebElement> softwaresearchResultList;
	
	

}
