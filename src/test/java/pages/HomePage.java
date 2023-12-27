package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@class='header links']/li")
	public List<WebElement> header;
	
	@FindBy(xpath = "//button[@class='action switch']")
	public WebElement headerButton;
	
	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchTextBox;

	@FindBy(xpath = "//button[@title='Search']")
	public WebElement MagnifyingGlass;

	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	public List<WebElement> topBarMenu;

	@FindBy(xpath = "//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all']/li")
	public List<WebElement> subTopBarMenu;
	
	@FindBy(xpath = "//dl[@id='narrow-by-list2']//ol/li[1]/a")
	public WebElement topInWoman;
	
	@FindBy(xpath = "//div[@class='footer content']/div/div/ul/li[3]/a")
	public WebElement contactUs;
	
	
	
	

}
