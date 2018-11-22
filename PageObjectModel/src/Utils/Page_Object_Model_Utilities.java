package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Page_Object_Model_Utilities {
	
	private WebDriver driver;
	
	
	public void timeOut() {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void Screenshot(WebDriver driver,String testcaseName) {
		
		this.driver = driver;
		
		System.out.println("Screenshot processing");
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH_mm_ss");
			//cal
			System.out.println(cal.getTime());
			File dest = new File("E:\\Sathish\\PageObjectModel\\src\\Screenshot\\"+testcaseName+sdf.format(cal.getTime())+".png");
			
		 
	      //  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	      //  System.out.println( sdf.format(cal.getTime()) );
		
		try {
			FileUtils.copyFile(srcfile, dest);
		} catch (IOException e) {
		
				System.out.println(e);
		}
	}

}
