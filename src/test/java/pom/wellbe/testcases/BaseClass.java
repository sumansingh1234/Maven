package pom.wellbe.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public  String baseusrl ="http://automationpractice.com/index.php";
	
	public String username ="suman";
	public String password ="suman@123";
	public static WebDriver driver;
	@BeforeClass
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	
	
}
