package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
				//WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get(" https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//Drag & Drop
				
				driver.switchTo().frame(0);
				WebElement drg = driver.findElementByXPath("//div[@id='draggable']");
				WebElement srp = driver.findElementByXPath("//div[@id='droppable']");

				Actions action = new Actions (driver);
				action.dragAndDrop(drg, srp).perform();
				
				Thread.sleep(3000);
				
				driver.switchTo().parentFrame();
				driver.findElementByXPath("//a[text()='Selectable']").click();
				
				Thread.sleep(2000);
				driver.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

	
}
