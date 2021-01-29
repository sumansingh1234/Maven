package pom.wellbe.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LogInpage {

public static 	WebDriver ldriver;
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
        
	    @FindBy(xpath="//input[@id='address1']")
	    WebElement address;
	    
	    @FindBy(xpath="//input[@id='address2']")
	    WebElement address1;
	    
	    @FindBy(xpath="//input[@id='city']")
	    WebElement city;
	   
	    
	    @FindBy(xpath="//select[@id='id_state']")
	    WebElement state;
	   
	    @FindBy(xpath="//input[@id='postcode']")
	    WebElement pincode;
	    
	    @FindBy(xpath="//select[@id='id_country']")
	    WebElement id_country;
	    
	    @FindBy(xpath="//textarea[@id='other']")
	    WebElement other;
	    
	    
	    
	    
	    
	
	
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
	public void Email(String lastname) {
		// TODO Auto-generated method stub
		Emailid.sendKeys(lastname);
	}

	public void Company(String Company) {
		// TODO Auto-generated method stub
		
		company.sendKeys(Company);
		
	}

	public void address(String address2) {
		// TODO Auto-generated method stub
		
		address.sendKeys(address2);
		
		
	}

	

	public void address1(String address12) {
		
		address1.sendKeys(address12);
		
	}

	public void city(String city2) {
		// TODO Auto-generated method stub
		
		city.sendKeys(city2);
		
	}

	public void state( ) {
		
		
		
		
		
		Select sel = new Select(state);
		
		sel.selectByIndex(5);
		
		
	}

	public void pincode(String pincode) {
		
		city.sendKeys(pincode);
		
	}

	public void country() {
		// TODO Auto-generated method stub
		Select sel = new Select(id_country);
		
		sel.selectByIndex(1);
	}

	public void other(String other1) {
		
	String othervalue =	other.getAttribute("name");
		
	System.out.println(othervalue);
		
		
	}

	public void showalert() {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("alert('This is alertforfor verification');");
		
		
	}

	public void acceptalert() {
		
		
		String alart =ldriver.switchTo().alert().getText();
		System.out.println(alart);
		
		
		
	}
	
    public void alertaccept() {
    	
    	ldriver.switchTo().alert().accept();
    }
	
    
    public void closewindow() {
    	
    	ldriver.close();
    }

	
	}	

