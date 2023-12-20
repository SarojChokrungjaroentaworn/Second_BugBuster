package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoppingCartPage {

	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	public WebElement proceedCheckOut;

	@FindBy(xpath = "//a[@title='Remove item']")
	public WebElement trash;

	@FindBy(xpath = "//button[@class='action-primary action-accept']")
	public WebElement okToDeleteItem;

	@FindBy(xpath = "//a[@class='action viewcart']")
	public WebElement viewAndEditCart;

	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody[1]")
	public WebElement firstItemInCart;
	
	@FindBy(xpath = "//strong[@class='subtitle empty']")
	public WebElement emptyCart;
	
	@FindBy(xpath = "//div[@class='minicart-items-wrapper']/ol/li[1]//input[1]")
	public WebElement qtyBoxFirstItem;
	
	@FindBy(xpath = "//button[@title='Update']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//input[@class='input-text qty']")
	public WebElement QTYBoxInviewAndEditcart;
	
	@FindBy(xpath = "//button[@title='Update Shopping Cart']")
	public WebElement updateShoppingCart;
	
	@FindBy(xpath = "//td[@class='col subtotal']")
	public WebElement subTotal;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
