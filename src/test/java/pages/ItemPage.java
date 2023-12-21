package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ItemPage {

	public ItemPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//img[@alt='Montana Wind Jacket']")
	public WebElement montanaWindJacketItem;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img")
	public WebElement montanaWindJacketItem2;

	@FindBy(xpath = "//div[@option-id='167']")
	public WebElement sizeS;

	@FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
	public WebElement colorblack;
	
	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	public WebElement colorblue;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//a[@class='action showcart']")
	public WebElement goToCart;
	
	@FindBy(xpath = "//a[@class='action showcart active']")
	public WebElement goToCartActive;
	
	@FindBy(xpath="//li[@class='item product product-item odd last']")
	public WebElement firstItemInCart;
	
	@FindBy(xpath = "//strong[@class='subtitle empty']")
	public WebElement emptyCart;
	
	@FindBy(xpath = "//select[@id='sorter']/option[3]")
	public WebElement sortByPrice;
	
	@FindBy(xpath = "//select[@id='sorter']/option[2]")
	public WebElement sortByName;
	
	

}
