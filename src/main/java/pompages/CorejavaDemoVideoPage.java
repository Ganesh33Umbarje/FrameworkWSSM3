package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaDemoVideoPage {
	
	@FindBy(xpath="//h1[normalize-space()='Core Java For Selenium Training']")private WebElement pageHeader;
	@FindBy(xpath="//button[@aria-label='Play']//*[@data-play-icon='true']")private WebElement playbutton;
    @FindBy(xpath="//button[@aria-label='Pause']//*[name()='svg']//*[name()='path' and contains(@class,'fill')]") private WebElement pausebutton;
    @FindBy(xpath="//span[normalize-space()='Add To Wishlist']") private WebElement AddWishListButton;
    
    //Initalization
    public CorejavaDemoVideoPage (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    //Utilization
    public WebElement gerPageHeader() {
    	return  pageHeader;
    }
    public void clickplaybutton() {
    	playbutton.click();
    	
    }
    public void clickpausebutton() {
    	pausebutton.click();
    	
    }
    public void addwishlistbutton() {
    	AddWishListButton.click();
    }
}
