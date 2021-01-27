package pom.wellbe.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public  String baseusrl ="http://automationpractice.com/index.php";
	public String personalinformationurl ="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	public String username ="sumansingh.infoo@gmail.com";
	public String password ="suman@123";
	public String firstname ="suman";
	public String lastname ="kumar";
	public String company ="tesla";
	public String emailid ="sumansingh.infoo@gmail.com";
	public static WebDriver driver;
	@BeforeClass
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	
	
}
