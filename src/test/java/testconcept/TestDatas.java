package testconcept;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDatas {
	
	@DataProvider(name="loginTest")//object highlevel it can contain string, int any datatype
	public Object[][] getData(){
		
		return new Object[][] {
			{"user1","pass1","Pass"},//datadriven testing for testing various possibilities in login page
			{"user2","pass1","Fail"},//pass/fail is just our prediction in real project we check with url only because if it is successful login then url changes to home likethis we can check
			{"user3","pass3","Pass"}
		};
	}
	@Test(dataProvider = "loginTest")
	public void testLogin(String userName,String password,String result) {
		Assert.assertTrue(result.equals("Pass"));//to check pass/fail
		System.out.println("User: "+userName+" Password: "+password+" Result: "+result);
	}
	}

 //if we want fail then use assert, this is just a string Fail