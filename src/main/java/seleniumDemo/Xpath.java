package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id=\"username\"]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id=\"password\"]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class=\"decorativeSubmit\"]").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		

	}

}
