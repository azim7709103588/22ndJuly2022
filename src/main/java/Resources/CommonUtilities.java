package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

	public static void handleStaticDropdown(WebElement element, int index) {
		
		 WebElement e=element;
         Select s=new Select(e);
         s.selectByIndex(index);
         
	}      
         //for handle assertion
         public static void handleAssertion(String expected, String Actual) {
        	   SoftAssert sa=new    SoftAssert ();
        	   String expectedString=expected;
        	   String  actualString=Actual;
        	   sa.assertEquals(actualString,expectedString);
        	   sa.assertAll();
        	   
        	   
         }
		 }
		
	
	
	
	

