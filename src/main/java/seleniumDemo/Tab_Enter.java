package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Enter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementByXPath("//input[@id='email']").sendKeys("shahmojumder@gmail.com");
				Actions action = new Actions (driver);
				action.sendKeys(Keys.TAB).sendKeys("asdf").build().perform();
				action.sendKeys(Keys.TAB).perform();
				action.sendKeys(Keys.TAB).perform();
				action.sendKeys(Keys.TAB).perform();
				action.sendKeys(Keys.TAB).perform();


	}

}
