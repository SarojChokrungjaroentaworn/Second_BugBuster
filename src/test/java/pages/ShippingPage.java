package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShippingPage {

	public ShippingPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@name='street[0]']")
	public WebElement streetAddress;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;

	@FindBy(xpath = "//select[@id='O83E2KK']")
	public WebElement regionID;

	@FindBy(xpath = "//select[@class='select']/option")
	public List<WebElement> regionIDList;

	@FindBy(xpath = "//select[@class='select']/option[62]")
	public WebElement virginia;

	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement zipCode;

	@FindBy(xpath = "//select[@name='country_id']/option")
	public List<WebElement> countryList;

	@FindBy(xpath = "//input[@name='telephone']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//button[@class='button action continue primary']")
	public WebElement nextButton;

	@FindBy(xpath = "//table[@class='table-checkout-shipping-method']/tbody/tr")
	public List<WebElement> shippingMethod;

	@FindBy(xpath = "//table[@class='table-checkout-shipping-method']/tbody/tr[1]")
	public WebElement shippingMethodTableRate;

}
