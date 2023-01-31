package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.CoreJavaForSeleniumPage;
import pompages.CorejavaDemoVideoPage;
import pompages.Seleniumtraingpage;
import pompages.Skillraryhomepage;
import pompages.TestingPage;
import pompages.contactpage;
import pompages.sillraryDemoAppPage;

public class BaseClass {
	 protected PropertiesFileUtility property;
	 protected ExcelFileUtility excel;
	 protected WebDriverUtility web;
	 protected WebDriver driver;
	 protected Skillraryhomepage home;
	 protected sillraryDemoAppPage demoApp;
	 protected contactpage contact; 
	 protected TestingPage testing;
	 protected Seleniumtraingpage selenium;
	 protected CoreJavaForSeleniumPage coreJava;
	 protected CorejavaDemoVideoPage javaDemo;
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classSetup(){
		property=new PropertiesFileUtility();
		excel=new ExcelFileUtility();
		web=new WebDriverUtility();
		
		property.propertiesIntialization(iConstantPath.PROPERTY_FILE_PATH);
		String browser=property.fetchproperty("browser");
		String url=property.fetchproperty("url");
		long time=Long.parseLong(property.fetchproperty("timeouts"));
		
		driver=web.openApplication(browser, url, time);
		home=new Skillraryhomepage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		
	}
	@BeforeMethod
	public void methodSetup(){
		excel.fetchdatafromexcel(iConstantPath.EXCEL_FILE_PATH);
		demoApp=new sillraryDemoAppPage(driver);
		contact=new contactpage(driver);
		testing=new TestingPage(driver);
		selenium=new Seleniumtraingpage(driver);
		coreJava=new CoreJavaForSeleniumPage(driver);
		javaDemo=new CorejavaDemoVideoPage(driver);
		
		
	}
	@AfterMethod
	public void MethodTearDown() {
		excel.closeworkbook();
	}
	public void classTearDown(){
		web.quitBrowser();
		
	}
	//@AfterTest
	//@AfterSuite

}
