package MavenExecution;

import org.testng.annotations.Test;

public class ReadDataFromCommandLineTest {
	
	@Test(groups = "smoke")
	public void readDataFromcmdTest()
	{
		System.out.println("This is Smoke Testing");
		
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}
	
	@Test(groups = "regression")
	public void regressionTest()
	{
		System.out.println("This is Regression Testing");
	}

}
