package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();
	   //  WebDriver driver = new ChromeDriver();

        
		

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElements("username").sendKeys("DemoSalesManager");
		driver.findElement("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElement("createLeadForm_companyName").sendKeys("abc");
		
		
		
		
		driver.close();

	}

}
