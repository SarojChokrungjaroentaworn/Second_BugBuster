package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SearchPage {
	
	public SearchPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
