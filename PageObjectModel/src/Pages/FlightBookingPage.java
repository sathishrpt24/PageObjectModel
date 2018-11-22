package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingPage {
	
	private WebDriver driver;
	private String passenger_count;
	
	By Pass_count = By.name("passCount");
	By from_port = By.name("fromPort");
	
	
	public void Pass_count(String passenger_count) {
		
		WebElement passcount = driver.findElement(Pass_count);
		Select DD = new Select(passcount);
		DD.selectByValue(passenger_count);
	}

	
	
}
