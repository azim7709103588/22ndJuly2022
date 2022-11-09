package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjectModel;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constants;
import io.netty.util.Constant;

public class VeryfyLogin  extends BaseClass {

	@Test
	public void Login() throws IOException {
		
		
	   LoginPageObjectModel obj=new LoginPageObjectModel(driver);
	    
	   obj.enterusername().sendKeys(Constants.username);
	   
	   // CommonUtilities.handlExplictWait(10,obj.enterPssword());

	   
	    obj. enterpassword().sendKeys(Constants.password);
	    
	   // CommonUtilities.handlExplictWait(15,obj.clickOnLogin());
	    
	    
	    obj.clickOnLogin().click();
	    
	 //   CommonUtilities.handleAssertions(Constant.expectedString, obj.errorMessage().getText() );
	    
	  
	}	
	}

