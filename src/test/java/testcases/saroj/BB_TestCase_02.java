package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class BB_TestCase_02 extends CommonMethods {

	@Test
	public void addItemtoCart() {
		getDriver();
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_ForTestCase_BB_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(1);
		click(ip.goToCart);
		waitForVisibility(ip.firstItemInCart);
		Assert.assertTrue(
				ip.firstItemInCart.getText().contains(getProperty("ProductItemSelected_ForTestCase_BB_TestCase_02")));
	}

}
