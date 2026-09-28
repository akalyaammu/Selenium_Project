package testconcept;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAddition {
	
	@BeforeTest//just setup like how we open browser in Selenium
	public void testSetUp() {
		System.out.println("Runs before Test");
	}
	
	@Test
	public void testAddition() {
		int a=10;
		int b=20;
		int c=a+b;
		Assert.assertTrue(c==25,"C not equals 30");
		
	}
	
	@Test//without this project doesn't works
	public void testSubtract() {
		int a = 50;
		int b = 25;
		int c = a-b;
		Assert.assertEquals(c, 25);
	}
	
	@AfterTest
	public void testDown() {
		System.out.println("Runs after Test");
	}
	
	

}
