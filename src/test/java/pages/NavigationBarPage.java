package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NavigationBarPage {
	
	public NavigationBarPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
