package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatLead {

	//public static void main(String[] args) {
	
	@Test
	public static void launchBrowser () {
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
                driver.findElementByXPath("//a[text()='Create Lead']").click();
                driver.findElementByCssSelector("input[id='createLeadForm_companyName']").sendKeys("xyz");
                driver.findElementByCssSelector("input[id='createLeadForm_firstName']").sendKeys("john");
                driver.findElementByCssSelector("input[id='createLeadForm_lastName']").sendKeys("smith");
                WebElement cold = driver.findElementByCssSelector("select[id='createLeadForm_dataSourceId']");
                Select dd = new Select (cold);
                dd.selectByValue("LEAD_COLDCALL");
	
	
	
	
	}

}
