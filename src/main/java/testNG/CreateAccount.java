package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccount {

	//public static void main(String[] args)
	@Test
	
	public void launchBrowser (){
		
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
				
				driver.findElementByXPath("//a[text()='Accounts']").click();
				driver.findElementByXPath("//a[text()='Create Account']").click();
				driver.findElementById("accountName").sendKeys("abc");
				driver.findElementById("groupNameLocal").sendKeys("cvs");
				WebElement dropdown = driver.findElementByCssSelector("select[name='industryEnumId']");
				Select dd = new Select (dropdown);
				dd.selectByValue("IND_AEROSPACE");
				driver.findElementByCssSelector("textarea[name='description']").sendKeys("Test NG Class");
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
