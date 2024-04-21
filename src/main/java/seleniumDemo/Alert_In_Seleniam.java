package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_In_Seleniam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//PROMPT ALERT
				driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
				//Move your control to Alert window from main window - way-1
				/*String promt = driver.switchTo().alert().getText();
				System.out.println(promt);
				driver.switchTo().alert().sendKeys("testing software");
			
				//Accept Alert
                 driver.switchTo().alert().accept();*/
				
				//Move your control to Alert window from main window - way-2 (using Alert Class)
				/*Alert promptAlert1 = driver.switchTo().alert();
				promptAlert1.getText();
				System.out.println(promptAlert1.getText());
				
				Thread.sleep(3000);
				//Type text into the box
				promptAlert1.sendKeys("I am a Human");
				
				//Click on OK
				promptAlert1.accept();*/
				
				Alert prompt = driver.switchTo().alert();
				prompt.getText();
				prompt.sendKeys("testing");
				prompt.accept();
				
                 

	}

}
