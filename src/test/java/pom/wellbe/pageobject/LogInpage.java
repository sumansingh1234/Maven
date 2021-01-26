package pom.wellbe.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInpage {

	WebDriver driver;
	public LogInpage(WebDriver ldriver){
		this.driver=ldriver;
	}

	@FindBy(id="email_create") 
	WebElement SendEmail;
	
	@FindBy(xpath="button[id='SubmitCreate'] span")
	WebElement CreatAnaccount;

	public void signin() {
		
		SendEmail.click();
		
	}
	
public void CreatAnaccount(String signin) {
		
		SendEmail.sendKeys(signin);
		
	}
	
}
