package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	  public WebDriver driver;
	  public Properties prop;
	    public void iniatializeDriver() throws IOException {
	    	
	    	//To Read The Data
     FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\SetProject22ndJuly\\src\\main\\java\\Resources\\data.properties");

      //Acces THE Data.properties
     
     prop=new Properties();
     
     prop.load(fis);
  //   prop.containsKey("browser");
     
   //  prop.getProperty("browser");
     
     String browserName= prop.getProperty("browser");
     if(browserName.equalsIgnoreCase("chrome")) {
    	 
    	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\ChromeDriver\\chromedriver.exe");
    
    	 WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
     }
         else if(browserName.equalsIgnoreCase("firefox")) {
         
       	 //firefox Code
        	      }
         else if(browserName.equalsIgnoreCase("edge")) {
        	
    	 
     }
         else {
        	 System.out.println("Please enter prop browser");
         }
     
   
	    }
	    
	    @BeforeMethod
	    public void launchURL() throws IOException {
	    	iniatializeDriver();
	    	   String url= prop.getProperty("url");
	 	   driver.get(url);}
	    
	    
	    
	    
	    
}


