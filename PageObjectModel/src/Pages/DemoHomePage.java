package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoHomePage {
	
	private WebDriver driver;
	
	//private String  UserName;
	//private String password;
	
	By user_name = By.name("userName");
	By pass_word = By.name("password");
	By login = By.name("login");
	
	public void username(String UserName) {
		
	//	this.UserName = UserName;
		driver.findElement(user_name).sendKeys(UserName);
		System.out.println("username function executed successfully");
		
	}

	public void password(String password) {
		
	//	this.password = password;
		
		driver.findElement(pass_word).sendKeys(password);
		System.out.println("password  function executed successfully");
	}
	
	public void login() {
		
		driver.findElement(login).click();
	}
	
	public String getTittleofBookingPage() {
		
		return driver.getTitle();
	}
	
	public DemoHomePage(WebDriver driver) {
		
	
		this.driver =driver;
	}
	
	
	}


