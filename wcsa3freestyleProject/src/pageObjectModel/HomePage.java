package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration for all the webelements present on the Home Page
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTaskLink;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[text()='Insert existing tasks']") private WebElement insertExistingTaskLink;
	

	
	//initilization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	//utilization
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getInsertExistingTaskLink() {
		return insertExistingTaskLink;
	} 
	
	
	//logout method
	
	public void logOutmethod()
	{
		logoutLink.click();
	}
	
}
