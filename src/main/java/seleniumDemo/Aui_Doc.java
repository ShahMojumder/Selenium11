package seleniumDemo;
/*12_AUI-Homework
Mouse events:
1. Mouse Hover On- Practice website:- http://mrbool.com/
2. For DragAndDrop- website:- https://jqueryui.com/droppable/
3. For Right Click- website:- https://swisnl.github.io/jQuery-contextMenu/demo.html
Keyboard events:
4. Key Board Keys events: Tab, Enter, KeyDown etc.
Practice website:- https://jqueryui.com/selectable/*/

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aui_Doc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://mrbool.com/");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //Mouse Hover On- Practice website:- http://mrbool.com/
	    WebElement contant = driver.findElementByXPath("//a[@class='menulink']");
	    Actions action = new Actions(driver);
	    action.moveToElement(contant).perform();
	    driver.findElementByXPath("//a[text()='Articles']").click();
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // For DragAndDrop- website:- https://jqueryui.com/droppable/
	    
	    
	    
		
		

	}

}
