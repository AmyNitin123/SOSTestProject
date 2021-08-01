package pages.loactors;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LiteratureSearchResultPageLocators {
	
	@FindBy(how=How.XPATH,using="//div[@id='search']//div/descendant::cite[@class='iUh30 Zu0yb qLRx3b tjvcx']")
	public List<WebElement> literaturesearchResultList;
}
