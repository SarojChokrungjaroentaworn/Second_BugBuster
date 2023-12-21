package testcases.saroj;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BBB extends CommonMethods{
	
	@Test
	public void justForTest() {
		getDriver();
		click(hp.topInWoman);
		System.out.println(ip.sortByPrice.getText());
		click(ip.sortByPrice);	
//		click(ip.sortByName);
		
	}

}
