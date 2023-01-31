package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//Declaration
	@FindBy(xpath="//h1[normalize-space()='Testing']") private WebElement pageHeader;
	@FindBy(xpath="//img[@id='java']")private WebElement javaImage;
	@FindBy(xpath="//div[@id='cartArea']")private WebElement cartarea;
	@FindBy(xpath="//div[@class='icons']//li[1]//a[1]")private WebElement facebookicon;
	
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//uitlization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public WebElement getjavaimage() {
		return javaImage;
	}
	public WebElement getcartarea() {
		return cartarea;
	}
	public WebElement getFacbookIcon(){
		return facebookicon;
	}
	
	public void clickfacbookimage() {
		facebookicon.click();
		
	}
	

}
