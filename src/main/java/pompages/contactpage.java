package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {
	//Declaration
	@FindBy(xpath="//img[@src='https://www.skillrary.com/assets/img/contactus.jpg']")private WebElement contactusimage;
	@FindBy(xpath="//input[@placeholder='Full Name']")private WebElement fullnameTF;
	@FindBy(xpath="//input[@placeholder='Email']")private WebElement emailTf;
	@FindBy(xpath="//input[@placeholder='Subject']")private WebElement subjectTF;
	@FindBy(xpath="//textarea[@placeholder='Message']")private WebElement messageTA;
	@FindBy(xpath="//button[normalize-space()='Send us mail']")private WebElement sendusmailbutton;
	
	//Initialization
	public contactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getHeaderImage() {
		return contactusimage;
		
	}
	public void setcontactdetails(String name,String subject,String email,String message) {
		fullnameTF.sendKeys(name);
		emailTf.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTA.sendKeys(message);
		
	}
	
	
	public void clicksenusmailbutton() {
		sendusmailbutton.click();
	}
	

}
