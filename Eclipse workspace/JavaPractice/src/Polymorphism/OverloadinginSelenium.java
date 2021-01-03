package Polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OverloadinginSelenium {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.switchTo().frame("");   // frame Method id overloading method
		
		
		Actions act=new Actions(driver);
		
		WebElement el=driver.findElement(By.xpath(""));
				act.click();  // here click is the overloading method
		act.click(el);
	}

}
