package TestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.DemoHomePage;
import TestData.HomePageTestData;
import Utils.Page_Object_Model_Utilities;

public class BaseClass {
	
	WebDriver driver;
	HomePageTestData hptd = new HomePageTestData();
	Page_Object_Model_Utilities pomu = new Page_Object_Model_Utilities();
	
	@BeforeSuite
	public void  BrowserSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sathish\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		//return driver;
	}
	
	@BeforeMethod
	public void testcase_Start() {
		
		System.out.println("Test Execution Started");
	}
	
	@AfterMethod
	
	public void Testcase_complete() {
		
		System.out.println("Test case execution completed");
	}
	
	@Test(priority = 0)
	public void HomePageTest_Tc01() {
		
		DemoHomePage dhp = new DemoHomePage(driver);
		dhp.username(hptd.username);
		dhp.password(hptd.password);
		pomu.Screenshot(driver,"Testcase_01_");
		dhp.login();
		String S1 = dhp.getTittleofBookingPage();
		Assert.assertEquals(S1, "Find a Flight: Mercury Tours:", "TestCase 1 executed Suucessfully");
	}

	@Test(priority = 1)
	public void nextPageTest_TC02() {
	}
	
	@AfterSuite
	public void TearDown() {
		
		System.out.println("Test execution completed - "
				+ "Please view console for TestCase Results");
		driver.quit();
	}
	

}