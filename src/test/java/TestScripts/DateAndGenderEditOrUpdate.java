package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class DateAndGenderEditOrUpdate 
{
	AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	Select select;
	AndroidTouchAction touch;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException {
//		htmlReporter = new ExtentSparkReporter("dailybookings.html");
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8T404LY3P");
		//cap.setCapability("Devicename", "Galaxy M12");
		//cap.setCapability("UDID", "RZ8R918FGWH");
		cap.setCapability("Platformname", "Android");
		cap.setCapability("Platformversion", "13");
		
		cap.setCapability("apppackage", "com.joeyrooms");
		cap.setCapability("appactivity", "com.joeyrooms.MainActivity - Joey Rooms");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		System.out.println("Android driver started successfully");
		
	}
	 @AfterTest
	  public void afterTest() 
	 {
//		  extent.flush();
		  driver.close();
	  }
	 @Test
	public void propeertybooking() throws Exception
	{

		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 
		
		 By clickonsearchinHomepage=By.xpath("//android.widget.TextView[@text='Search']");
		 WebElement searchbtnl=driver.findElement(clickonsearchinHomepage);
		
		  if((searchbtnl.isDisplayed()))
		  {
			  String seachtex= searchbtnl.getText();
			  System.out.println(seachtex);
			 Thread.sleep(3000);
			 By selectdate=By.xpath("//android.widget.TextView[@text='Check in']");
			 WebElement selectdatel=driver.findElement(selectdate);
			 selectdatel.isDisplayed();
			 String datel=selectdatel.getText();
			 System.out.println(datel);
			 selectdatel.click();
			 Thread.sleep(2000);
			 By clickonchangedate=By.xpath("//android.view.View[@text='29']");
			 WebElement clickonchangedatel=driver.findElement(clickonchangedate);
			 clickonchangedatel.click();
			 Thread.sleep(2000);
			 By clickonOkaybutton=By.xpath("//android.widget.Button[@text='OK']");
			 WebElement clickonOkaybuttonl=driver.findElement(clickonOkaybutton);
			 clickonOkaybuttonl.click();
			 Thread.sleep(2000);
			 By selectcheckoutdate=By.xpath("//android.widget.TextView[@text='Check out']");
			 WebElement selectcheckoutdatel=driver.findElement(selectcheckoutdate);
			 selectcheckoutdatel.isDisplayed();
			 String checoutTl=selectcheckoutdatel.getText();
			 System.out.println(checoutTl);
			 selectcheckoutdatel.click();
			 Thread.sleep(2000);
			 By clickonNextbt=By.id("android:id/next");
			 WebElement nextbnl=driver.findElement(clickonNextbt);
			 nextbnl.click();
			 Thread.sleep(2000);
			 By clickoncheckoutchangedatel=By.xpath("//android.view.View[@text='1']");
			 WebElement clickoncheckoutchangedateL=driver.findElement(clickoncheckoutchangedatel);
			 clickoncheckoutchangedateL.click();
			 Thread.sleep(2000);
			 By clickonOkbutton=By.xpath("//android.widget.Button[@text='OK']");
			 WebElement clickonOkbuttonl=driver.findElement(clickonOkbutton);
			 clickonOkbuttonl.click();
			 Thread.sleep(2000);
			 By gender=By.xpath("//android.widget.TextView[@text='Gender']");
			 WebElement genderl=driver.findElement(gender);
			 genderl.click();
			 Thread.sleep(2000);
			 By clickonany=By.xpath("//android.view.ViewGroup[@bounds='[28,1061][692,1140]']");
			 WebElement clickonAnyl=driver.findElement(clickonany);
			 clickonAnyl.click();
			 Thread.sleep(3000);
			 searchbtnl.click();
			 Thread.sleep(5000);
			 MobileElement elemen = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"JR1227 STAR DELUXE MENS HOSTEL\"))"));
			 Thread.sleep(3000);
			 By clickonpriyanka=By.xpath("//android.widget.TextView[@text ='JR3707 Hometel Men's PG']");
			 WebElement clickonpriyankal=driver.findElement(clickonpriyanka);
			 clickonpriyankal.isDisplayed();
			String  propertytitletext=clickonpriyankal.getText();
			System.out.println(propertytitletext);
			String exptext="JR3707 Hometel Men's PG";
			Assert.assertEquals(propertytitletext, exptext,"test case pass");
			clickonpriyankal.click();			 
			 Thread.sleep(2000);
			 By selectroom=By.xpath("//android.widget.TextView[@text='Select Rooms']");
			 WebElement selectrooml=driver.findElement(selectroom);
			 selectrooml.isDisplayed();
			 String selectromstext=selectrooml.getText();
			 System.out.println(selectromstext);
			 String expselectroomtext="Select Rooms";
			 Assert.assertEquals(selectromstext, expselectroomtext,"test case pass");
		  }

	}
}
