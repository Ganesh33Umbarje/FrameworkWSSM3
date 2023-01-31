package testscripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ForthTest extends BaseClass {
	@Test
	public void fourthtest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickdearstab();
		home.clickonskillrarydemoapp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		web.scrollTillElement(demoApp.getContactusLink());
		
		demoApp.clickcontactus();
		
		soft.assertTrue(contact.getHeaderImage().isDisplayed());
		List<String> list=excel.fetchdatafromexcel("TestData");
		contact.setcontactdetails(list.get(0), list.get(1), list.get(2), list.get(3));
		contact.clicksenusmailbutton();
		
		
		soft.assertAll();

		
	}
	
	
	

}
