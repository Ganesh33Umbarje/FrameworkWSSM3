package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	@Test
	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickdearstab();
		home.clickonskillrarydemoapp();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouserhovertocourselink(web);
		demoApp.clickseleniumtesting();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleclickplusbutton(web);
		selenium.clickAddtocart();
		web.handlealert();
		web.screenshot();
		
		soft.assertAll();
	}

}
