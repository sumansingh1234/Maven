package pom.wellbe.testcases;

import org.testng.annotations.Test;

import pom.wellbe.pageobject.LogInpage;

public class TC_logIn0001 extends BaseClass{

	@Test
	public void LoginTest() {
		driver.get(baseusrl);
		LogInpage login =new LogInpage(driver);
		driver.manage().window().maximize();
		login.signin();
		
		
	}
	
	
	
}
