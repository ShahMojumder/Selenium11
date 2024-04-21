package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver(); 
		//WebDriver driver = WebDriverManager.chromedriver().create();

				
				//WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				/*WebElement frame = driver.findElementByXPath("//iframe[@id='iframeResult']");
				driver.switchTo().frame(frame);
				driver.findElementByXPath("//input[@id='fname']").clear();
				driver.findElementByXPath("//input[@id='fname']").sendKeys("Shah");
				driver.findElementByXPath("//input[@id='lname']").clear();
				driver.findElementByXPath("//input[@id='lname']").sendKeys("mojumder");
				driver.findElementByXPath("//input[@type='submit']").click();*/
				
				Thread.sleep(3000);
				driver.switchTo().parentFrame();
				driver.close();
	}

}
