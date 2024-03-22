package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//By UName=By.id("username");
		//By Pword=By.id("password");
		//By Log=By.id("login");7
		
		@FindBy(id="username")
		WebElement UName;
		@FindBy(id="password")
		WebElement Pword;
		@FindBy(id="login")
		WebElement Log;
		
		
	public LoginPage(WebDriver driver) 
	{
		super();
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	 public void LoginTestCase(WebDriver driver) {
	    	this.driver=driver;
	    }
	
	public void LoginAction(String username,String password)
	{
		UName.sendKeys("vasuvespag");
		Pword.sendKeys("vasu1234");
		Log.click();
	}
	
}
