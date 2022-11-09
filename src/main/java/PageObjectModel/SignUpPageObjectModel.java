package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


     //   What to change here also same as POM/LPO
public class SignUpPageObjectModel {

	public WebDriver driver;
	
	By Firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By employee=By.xpath("//select[@name='CompanyEmployees']");
	//By Company=By.xpath("//input[@id='CompanyName-TlsR']");
	By Click=By.xpath("//div[@class='checkbox-ui']");
	By Country=By.xpath("//select[@id='CompanyCountry-Slwa']");
	
	
	public SignUpPageObjectModel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterFirstname() {
		
		return driver.findElement(Firstname);	
	}
	public WebElement enterlastname() {
		
		return driver.findElement(lastname);
	}
	public WebElement SelectEmployee() {
		return driver.findElement(employee);
	}
//	public WebElement Entercompany() {
	//	return driver.findElement(Company);
	//}
	public WebElement Clickbutton() {
		return driver.findElement(Click);	}
	
	public WebElement ClickCountry() {
		return driver.findElement(Country);	}
		}
   
 
