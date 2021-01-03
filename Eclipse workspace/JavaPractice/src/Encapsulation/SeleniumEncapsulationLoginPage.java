package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumEncapsulationLoginPage {

	private String url = "http://somedomain.com/myTest.html"; 
	 
	@FindBy(name="uesr1") 
	private WebElement userName; 
	 
   @FindBy(name="pass1") 
	private WebElement password; 
    
   @FindBy(name= "logButton") 
   private WebElement loginButton; 
 
 	private WebDriver driver; 
 
	public SeleniumEncapsulationLoginPage(WebDriver driver) { 
		this.driver = driver; 
		PageFactory.initElements(driver, this); 
	} 
	 
   // Class getters 
   public WebElement getuserName() { 
      return userName; 
   } 
 
   public WebElement getPassword() { 
      return password; 
   } 
    
   public WebElement getLoginButton() { 
      return loginButton; 
   } 
	 
   public String getPage() { 
      driver.get("url");
	return url; 
   } 
 


}
