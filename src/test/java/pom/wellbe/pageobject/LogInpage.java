package pom.wellbe.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInpage {

	WebDriver ldriver;
	public LogInpage(WebDriver rdriver){
		ldriver=rdriver;
	     PageFactory.initElements(rdriver, this);	
	}

	    @FindBy(xpath="//a[normalize-space()='Sign in']") 
	    WebElement SendEmail;
	
	     @FindBy(xpath="//input[@id='email_create']")
	     WebElement CreatAnaccount;
     	 @FindBy(xpath="//span[normalize-space()='Create an account']")
	     WebElement Creat;
	
	     @FindBy(xpath="//input[@id='id_gender2']") 
	 	WebElement entersalationmr;
	    
	    @FindBy(xpath="//input[@id='customer_firstname']")
	    WebElement Enterfirstname;
	    
	    @FindBy(xpath="//input[@id='customer_lastname']")
	    WebElement Lastname;
	    
	    @FindBy(xpath="//input[@id='company']")
	    WebElement company;
		
	    @FindBy(xpath="//input[@id='email']")
	    WebElement Emailid;
	    
	    @FindBy(xpath="//input[@id='passwd']")
	    WebElement password;

	
	
	public void signin() {
		
		SendEmail.click();
		
		
	}
	
public void CreatAnaccount(String signin) {
		
	CreatAnaccount.sendKeys(signin);
		
	}

public void createemail() {
	
	Creat.click();
}
	
	public void selectsalutaion() {
		entersalationmr.click();
		
	}
	
	
	public void firstname(String firstname) {
		// TODO Auto-generated method stub
		Enterfirstname.sendKeys(firstname);

	}

	public void lastname(String lastname) {
		// TODO Auto-generated method stub
		Lastname.sendKeys(lastname);
	}

	public void Company(String emailid) {
		// TODO Auto-generated method stub
		
		
		Lastname.sendKeys(emailid);

	}

	

	
	}	

