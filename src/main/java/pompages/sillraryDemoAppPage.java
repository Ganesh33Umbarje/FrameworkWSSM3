package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class sillraryDemoAppPage {
	//Declaration
	@FindBy(xpath="//b[normalize-space()='SkillRary']")private WebElement pageHeader;
	@FindBy(xpath="//a[@id='course']")private WebElement coursetab;
	@FindBy(xpath="//span[@class='wrappers']//a[@href='product.php?product=selenium-training'][normalize-space()='Selenium Training']")
	private WebElement seleniumtestinglink;
	@FindBy(xpath="//select[@name='addresstype']")private WebElement catogorydropdown;
	@FindBy(xpath="//a[normalize-space()='Contact Us']") private WebElement contactus;
	
	//Intialization
	public sillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utlization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public void mouserhovertocourselink(WebDriverUtility web) {
		web.mouseHover(coursetab);
		
	}
	public void clickseleniumtesting() {
		seleniumtestinglink.click();
		
	}
	public void selectcategory(WebDriverUtility web,int index) {
		web.dropdown(catogorydropdown, index);
	}
	public WebElement getContactusLink() {
		return contactus;
	}
	public void clickcontactus() {
		contactus.click();
		
	}
	
	

}
