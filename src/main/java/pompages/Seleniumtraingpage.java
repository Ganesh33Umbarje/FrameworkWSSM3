package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class Seleniumtraingpage {
	//Declaration
	@FindBy(xpath="//h1[normalize-space()='Selenium Training']")private WebElement pageheader;
	@FindBy(xpath="//i[@class='fa fa-plus']")private WebElement Plusbutton;
	@FindBy(xpath="//button[normalize-space()='Add to Cart']") private WebElement Addtocartbutton;
	
	//Initalization
	public Seleniumtraingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getPageHeader() {
		return pageheader;
	}
	public void doubleclickplusbutton(WebDriverUtility web) {
		web.doubleclick(Plusbutton);
	}
	public void clickAddtocart() {
		Addtocartbutton.click();
		
		
	}
}
