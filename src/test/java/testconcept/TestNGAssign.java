package testconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAssign {
	WebDriver dr;
	
	@BeforeMethod
	public void setup() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/");
	}
	
	@DataProvider(name="loginTest")
	public Object[][] getData(){
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"problem_user","secret_sauce"}, 
			{"user","secret_sauce"}
		};
	}
	@Test(dataProvider = "loginTest")
	public void testLogin(String userName,String password) {
		dr.findElement(By.id("user-name")).sendKeys(userName);
		dr.findElement(By.id("password")).sendKeys(password);
		dr.findElement(By.id("login-button")).click();
		String currentURL = dr.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("inventory.html"));
		System.out.println("User: "+userName+" Password: "+password);
	}
	@AfterTest
	public void quit() {
		dr.close();
}
}