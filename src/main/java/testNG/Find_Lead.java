package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class Find_Lead {

	//public static void main(String[] args) {
		
	@Test
	public void launch () {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
					
					//WebDriverManager.chromedriver().setup();
					//ChromeDriver driver = new ChromeDriver();

					driver.get("http://leaftaps.com/opentaps/control/login");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.findElementById("username").sendKeys("DemoSalesManager");
					driver.findElementById("password").sendKeys("crmsfa");
					driver.findElementByClassName("decorativeSubmit").click();
					driver.findElementByLinkText("CRM/SFA").click();
					
					
					driver.findElementByXPath("//a[text()='Leads']").click();
					
	                driver.findElementByXPath("//a[text()='Find Leads']").click();
	                driver.findElementByXPath("//span[text()='Email']").click();
	                driver.findElementByCssSelector("input[name='emailAddress']").sendKeys("shahmojumder@gmail.com");
	                driver.findElementByXPath("//button[text()='Find Leads']").click();
	                
	                
	
	
	
	
	
	
	
	}
					
					
					}
	                

	
	
	
	

	


