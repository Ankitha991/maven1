package TestCases;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTestCase {
	    @Test
	    public void Program() {
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://adactinhotelapp.com/");
	    	LoginPage ltc=PageFactory.initElements(driver, LoginPage.class);
	    	ltc.LoginAction("vasuvespag","vasu1234");
	    	
	    }
	}
