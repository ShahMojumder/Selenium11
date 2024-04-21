package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementByPartialLinkText("Try it Yourself »").click();
				Set<String> allwin = driver.getWindowHandles();
				System.out.println(allwin);
				for(String eachwin : allwin) {
					System.out.println(eachwin);
					driver.switchTo().window(eachwin);
					System.out.println(driver.getTitle());
				}
				

	}

}
