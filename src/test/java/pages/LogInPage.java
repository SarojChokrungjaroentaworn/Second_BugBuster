package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LogInPage {

	public LogInPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//*[@name='login[password]']")
	public WebElement password;

	@FindBy(id = "email")
	public WebElement lumaEmail;

	@FindBy(id = "pass")
	public WebElement lumaPassword;

	@FindBy(xpath = "//*[@class='action login primary']")
	public WebElement signInButton;

	@FindBy(xpath = "//ul[@class='header links']")
	public List<WebElement> AccountMenu;

	@FindBy(xpath = "//li[@class='authorization-link']")
	public WebElement signIn;

	@FindBy(id = "send2")
	public WebElement lumaSignInButton;

}
