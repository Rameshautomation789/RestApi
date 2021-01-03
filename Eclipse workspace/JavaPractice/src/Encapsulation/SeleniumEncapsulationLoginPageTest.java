package Encapsulation;

import org.openqa.selenium.WebDriver;

public class SeleniumEncapsulationLoginPageTest {

	private WebDriver driver; 
	 
	
		public void testLoginPage() throws InterruptedException { 
		 
			// Create an instance of SeleniumEncapsulationLoginPage class and provide the driver 
			SeleniumEncapsulationLoginPage seleniumEncapPage = new SeleniumEncapsulationLoginPage(driver); 
	 
			// Open the Application Page 
			seleniumEncapPage.getPage();
	 
			// Ecapsulation - I am accessing private member using getter method 
			// Enter user name 
			seleniumEncapPage.getuserName().sendKeys("someUserName"); 
			 
	       // Ecapsulation - I am accessing private member using getter method getter // // Enter password 
			seleniumEncapPage.getPassword().sendKeys("someUserName"); 
	 
	        // Ecapsulation - I am accessing private member using getter method getter // // Click login button 
	        seleniumEncapPage.getLoginButton().click(); 
			 
			Thread.sleep(10); 
			
			
		} 
		 
}
