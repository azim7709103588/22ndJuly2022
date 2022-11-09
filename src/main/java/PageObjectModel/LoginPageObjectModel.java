package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObjectModel {
	public WebDriver driver ;//This dont have scope
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By Login=By.xpath("//input[@id='Login']");
	
	By tryForFree=By.xpath("//a[@id='signup_link']");
	
//	By actualErrorMessage=By.xpath("//div[@id='error']");
		
	public LoginPageObjectModel(WebDriver driver2) {
		driver =driver2;
	}
      public WebElement enterusername(){
    	  
       return driver.findElement(username);
    	   }
     public WebElement enterpassword(){
    	  
     return driver.findElement(password);
    	   }
     public WebElement clickOnLogin() {
    	 return driver.findElement(Login);
     }
     
    // public WebElement clickOntryForFee(){
   	  
     public WebElement clickOnTryForFree() {
    	  return driver.findElement(tryForFree);
    	     	   
          }

   	   
     

	
	
	
}
