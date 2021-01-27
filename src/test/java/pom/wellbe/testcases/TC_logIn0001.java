package pom.wellbe.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.wellbe.pageobject.LogInpage;




public class TC_logIn0001 extends BaseClass {

	
	@Test
	public void LoginTest() {
		driver.get(baseusrl);
		LogInpage login =new LogInpage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		login.signin();
		login.CreatAnaccount(username);
		login.createemail();
		String logintestpagetitle=driver.getTitle();
		System.out.println(logintestpagetitle);
		if(logintestpagetitle.equals("Login - My Store")) {
			
			System.out.println("Build sucessfull");
		}
	}
	/*Registrationpage*/
	@Test
	public void personalInformation() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LogInpage login =new LogInpage(driver);
	    login.selectsalutaion();	    
        login.firstname(firstname);
		login.lastname(lastname);
		login.Company(emailid);
		
	}
	
	
}
