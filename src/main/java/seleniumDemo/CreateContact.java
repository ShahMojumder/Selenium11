/*package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		
		
				

				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				
				
				//click create contact				
				driver.findElementByLinkText("Create Contact").click();
				
				//Get Title of Crate Contact page
				System.out.println(driver.getTitle());
				
				driver.findElementById("firstNameField").sendKeys("Hema");
				
				driver.findElementById("lastNameField").sendKeys("Mali");
				driver.findElementById("Bangladesh");
								
				
				
				//click create contact btn
				//driver.findElementByName("submitButton").click();
				
				//Get title of View Contact page
				System.out.println(driver.getTitle());
				
				
				
	}

}
*/

package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

    public static void main(String[] args) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Login
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        
        username.sendKeys("DemoSalesManager");
        password.sendKeys("crmsfa");
        loginButton.click();

        // Navigate to CRM/SFA page
        WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
        crmSfaLink.click();

        // Navigate to create contact page
        WebElement createContactLink = driver.findElement(By.linkText("Create Contact"));
        createContactLink.click();

        // Get title of Create Contact page
        System.out.println("Title of Create Contact page: " + driver.getTitle());

        // Fill in contact details
        WebElement firstNameField = driver.findElement(By.id("firstNameField"));
        WebElement lastNameField = driver.findElement(By.id("lastNameField"));
        firstNameField.sendKeys("Hema");
        lastNameField.sendKeys("Mali");
        // Assuming "Bangladesh" is supposed to be an input, find the appropriate element and fill it in

        // Click create contact button
        // WebElement submitButton = driver.findElement(By.name("submitButton"));
        // submitButton.click();

        // Get title of View Contact page
        System.out.println("Title of View Contact page: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

