package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class FooterPage {
	
	public FooterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
