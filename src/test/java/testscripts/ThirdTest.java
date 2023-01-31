package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft=new SoftAssert();
		
		home.searchcourse("core java for selenium");
		soft.assertTrue(coreJava.getPageHeader().isDisplayed());
		coreJava.clickcorejavalink();
		soft.assertTrue(javaDemo.gerPageHeader().isDisplayed());
		web.switchToFrame(0);
		javaDemo.clickplaybutton();
		javaDemo.clickpausebutton();
		javaDemo.addwishlistbutton();
		
		soft.assertAll();
		
		
	}
	

}
