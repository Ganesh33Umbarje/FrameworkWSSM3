package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	//Declaration 
	@FindBy(xpath="//h2[normalize-space()='core java for selenium']")private WebElement pageHeader; 
	@FindBy(xpath="//a[normalize-space()='Core Java For Selenium Trainin']")private WebElement corejavalink;
	
	//Intialization 
	public CoreJavaForSeleniumPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utlization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void clickcorejavalink() {
		corejavalink.click();
		
	}

}
