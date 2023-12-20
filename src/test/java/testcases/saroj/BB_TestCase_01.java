package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

//@Listeners(ListensTestNG.class)
public class BB_TestCase_01 extends CommonMethods {

//	@Test(retryAnalyzer = RetryAnalyzer.class)
	@Test
	public void removeItemfromCart() {
		getDriver();
		sendKey(hp.searchTextBox, getProperty("ItemAddedToCartForTestCase_BB_TestCase_01"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.montanaWindJacketItem2);
		click(ip.sizeS);
		click(ip.colorblack);
		click(ip.addToCartButton);
		click(ip.goToCart);
		waitForVisibility(ip.firstItemInCart);
		Assert.assertTrue(
				ip.firstItemInCart.getText().contains(getProperty("ItemAddedToCartForTestCase_BB_TestCase_01")));
		click(scp.trash);
		click(scp.okToDeleteItem);
		Assert.assertTrue(ip.emptyCart.getText().contains(getProperty("EmptyCart_ForTestCase_BB_TestCase_01")));

	}

}
