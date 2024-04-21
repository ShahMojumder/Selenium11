package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgJava {
	
	@BeforeMethod
	public void login () {
		System.out.println("login");
	}
	
	@Test
	public void google () {
		System.out.println("google search");
	}
	
	
	@AfterMethod
	public void logout () {
		System.out.println("log out");
	}
	
	
	}
	
	


