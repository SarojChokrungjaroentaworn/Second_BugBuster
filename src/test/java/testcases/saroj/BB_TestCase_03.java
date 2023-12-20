package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TestCase_03 extends CommonMethods {

	@Test
	public void updateQuantityInCart() {
		getDriver();
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_ForTestCase_BB_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(1);
		click(ip.goToCart);
//		deleteText(scp.qtyBoxFirstItem);
//		sendText(scp.qtyBoxFirstItem, getProperty("QuantityUpdated_ForTestCase_BB_TestCase_03"));
//		click(scp.updateButton);
		click(scp.viewAndEditCart);
		sendText(scp.QTYBoxInviewAndEditcart, getProperty("QuantityUpdated_ForTestCase_BB_TestCase_03"));
		click(scp.updateShoppingCart);
		hardWait(2);
		Assert.assertTrue(scp.subTotal.getText().contains(getProperty("ConfirmQty_ForTestCase_BB_TestCase_03")));

	}

}
