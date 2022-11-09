package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjectModel;
import PageObjectModel.SignUpPageObjectModel;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constants;

public class VeryfySignup  extends BaseClass {
	
	  @Test
	  
      public void signup() throws IOException, InterruptedException {
    	  
			driver.get("https://login.perf1h.pc-rnd.salesforce.com/?locale=eu");
    	  LoginPageObjectModel LPO= new LoginPageObjectModel(driver);
    	// LPO.clickOntryForFee().click();
    	  SignUpPageObjectModel SPO=new SignUpPageObjectModel(driver);
    	  Thread.sleep(2000);
    	 SPO.enterFirstname().sendKeys(Constants.enterFirstname);
    	 SPO.enterlastname().sendKeys(Constants.enterlastname);
    	 CommonUtilities.handleStaticDropdown(SPO.SelectEmployee(), 1);
    	 
    	 CommonUtilities.handleStaticDropdown(SPO.ClickCountry(), 1);
    	 
    	 
    	 WebElement Country = SPO.ClickCountry();
    	 Select s1 =new Select (Country);
    	 s1.selectByIndex(1);
    	 
  
			
      }
	
	
	
}


/*LPO.clickOntryForFee().click();
SignUpPageObjectModel SPO=new SignUpPageObjectModel(driver);


Thread.sleep(3000);
SPO.enterFirstname().sendKeys("ram");
SPO.enterlastname().sendKeys("test");*/







