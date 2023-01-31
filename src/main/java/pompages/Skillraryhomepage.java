package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillraryhomepage {
	@FindBy(xpath="//img[@alt='SkillRary']") private WebElement logo;
	@FindBy(xpath="//input[@placeholder='Search for Courses']")private WebElement searchTF;
    @FindBy(xpath="//input[@value='go']")private WebElement searchbutton;
    @FindBy(xpath="//a[contains(text(),'GEARS')]") private WebElement geartab;
    @FindBy(xpath="//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']")private WebElement SkillrarydemoAppLink;
    
    //Intiatlization
    public Skillraryhomepage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    //utilization
    public WebElement getLogo() {
    	return logo;
    }
    public void searchcourse(String text) {
    	searchTF.sendKeys(text);
    	searchbutton.click();
    	
    }
    public void clickdearstab() {
    	geartab.click();
    	
    }
    public void clickonskillrarydemoapp() {
    	SkillrarydemoAppLink.click();
    	
    }
    
}
