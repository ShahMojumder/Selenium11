package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Down_ArrowKey {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://jqueryui.com/selectable/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.switchTo().frame(0);
				WebElement drag = driver.findElementByXPath("(//ol[@id='selectable'])/li[1]");
				WebElement drop = driver.findElementByXPath("(//ol[@id='selectable'])/li[2]");
				WebElement resi = driver.findElementByXPath("(//ol[@id='selectable'])/li[3]");
				WebElement fhr = driver.findElementByXPath("(//ol[@id='selectable'])/li[4]");
				WebElement fhv = driver.findElementByXPath("(//ol[@id='selectable'])/li[5]");
				WebElement six = driver.findElementByXPath("(//ol[@id='selectable'])/li[6]");
				WebElement svn = driver.findElementByXPath("(//ol[@id='selectable'])/li[7]");
				Actions action = new Actions (driver);
			    action.keyDown(Keys.CONTROL).click(drag).click(drop).click(resi).click(fhr).click(fhv).click(six).click(svn).release().perform();
			    
			    
			    
			    
				
				


	}

}
