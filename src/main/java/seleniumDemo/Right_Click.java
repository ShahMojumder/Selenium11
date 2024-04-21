package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://jqueryui.com/selectable/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.switchTo().frame(0);
				WebElement rightclick = driver.findElementByXPath("(//ol[@id='selectable'])/li[1]");
				WebElement rightclick2 = driver.findElementByXPath("(//ol[@id='selectable'])/li[2]");
				WebElement rightclick3 = driver.findElementByXPath("(//ol[@id='selectable'])/li[3]");
				WebElement rightclick4 = driver.findElementByXPath("(//ol[@id='selectable'])/li[4]");
				WebElement rightclick5 = driver.findElementByXPath("(//ol[@id='selectable'])/li[5]");
				//WebElement rightclick6 = driver.findElementByXPath("(//ol[@id='selectable'])/li[6]");
				//WebElement rightclick7 = driver.findElementByXPath("(//ol[@id='selectable'])/li[7]");
				Actions action = new Actions (driver);
action.keyDown(Keys.CONTROL).click(rightclick).click(rightclick2).click(rightclick3).click(rightclick4).click(rightclick5).release().perform();				
				
		
		

	}

}
