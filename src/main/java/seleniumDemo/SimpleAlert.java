package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
			//	WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver();

				driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementById("searchBtn").click();
				//Move control to alert window from main page
				String alert1 = driver.switchTo().alert().getText();
				System.out.println(alert1);
				driver.switchTo().alert().accept();
	}

}
