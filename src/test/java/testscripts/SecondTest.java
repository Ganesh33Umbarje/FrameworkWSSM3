package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass {
	@Test
	public void secondTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickdearstab();
		home.clickonskillrarydemoapp();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.selectcategory(web, 1);
		soft.assertTrue(testing.getPageHeader().isDisplayed());
		WebElement javaImage=testing.getjavaimage();
		WebElement cartimage=testing.getcartarea();
		web.dragandDropElement(javaImage, cartimage);
		web.scrollTillElement(testing.getFacbookIcon());
		testing.clickfacbookimage();
		
		soft.assertAll();
	}

}
