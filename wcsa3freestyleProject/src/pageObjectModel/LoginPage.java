package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declare all the webElements present on Login page
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
    @FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
    @FindBy(xpath="//a[contains(text(),'License')]") private WebElement licenseLink;
    
	
    
    
    //initialization
    
    
    public LoginPage(WebDriver driver) 
    {
		PageFactory.initElements(driver,this);
	}
    
    
    
    
    
    //utilzation
    public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
    
    //valid Login Method
	
	public void validLoginToActiTime(String validUsername,String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
	}
	
	//invalid Login Method
	public void invalidLoginToActiTime(String validUsername,String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
		usn.clear();
	}
	
	
	
	
    
    
}






