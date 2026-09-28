package testconcept;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaTest {
	
	@Test
	@Parameters({"browser","url"})
	public void testParam(String browser,String webURL) {//to store the string two variable needed
		System.out.println("Browser: "+browser);
		System.out.println("Website: "+webURL);
	}

}
