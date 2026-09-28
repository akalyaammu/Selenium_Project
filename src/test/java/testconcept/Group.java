package testconcept;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Group {
		WebDriver driver;
		WebElement user;
		
		@BeforeTest//precondition
		public void setUp() {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		@Test(priority=0,groups="sanity")
		public void testLoginUser() {
			user = driver.findElement(By.id("user-name"));
			user.sendKeys("standard");
			String val = user.getAttribute("value");
			Assert.assertEquals(val, "standard_user");
		}
		
		@Test(priority=1,groups= "smoke")//depends on then if username is not valid then it won't runs
		public void testLoginPass() {
			user = driver.findElement(By.id("password"));
			user.sendKeys("secret_sauce");
			String val = user.getAttribute("value");
			Assert.assertEquals(val, "secret_sauce");
		}
		
		@AfterTest//post condition
		public void testClose() {
			driver.quit();
		}

	}

