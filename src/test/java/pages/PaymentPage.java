package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PaymentPage {
	
	public PaymentPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
