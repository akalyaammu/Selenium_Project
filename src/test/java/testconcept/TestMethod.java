package testconcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethod {
	
	@BeforeTest//just runs once
	public void setup() {
		System.out.println("Test Setup");
	}
	
	@Test
	public void login() {
		System.out.println("Test Login");
	}
	
	@Test
	public void homepage() {
		System.out.println("Test Homepage");
	}
	@AfterMethod//runs before every test
	public void quit() {
		System.out.println("Test Exit");
	}

}
