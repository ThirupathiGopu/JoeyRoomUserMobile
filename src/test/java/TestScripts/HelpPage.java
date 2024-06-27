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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HelpPage
{
	  AndroidDriver<MobileElement> driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		ExtentSparkReporter htmlReporter;
		ExtentReports extent;
		Actions action;
		Select select;
		@BeforeTest
		public void setup() throws Exception
		{
			htmlReporter = new ExtentSparkReporter("helpPage.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			cap.setCapability("Devicename", "Galaxy M12");
			cap.setCapability("UDID", "RZ8T404LY3P");
			cap.setCapability("platformname", "Android");
			cap.setCapability("platformversion", "13");
			cap.setCapability("apppackage", "com.joeyrooms");
			cap.setCapability("appactivity", "com.joeyrooms.MainActivity - Joey Rooms");
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
			System.out.println("Android driver started successfully");

		}
		@AfterTest
		  public void afterTest() 
		 {
			  extent.flush();
		  }
		@Test
		public void loginandHelpPage() throws Exception
		{
			By clickonapp=By.xpath("//android.widget.TextView[@text='Joey Rooms']");
			WebElement clickonappl=driver.findElement(clickonapp);
			clickonappl.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 By clickonProfile=By.xpath("//android.widget.ImageView[@bounds='[53,91][82,117]']");
			 WebElement clickonProfilel=driver.findElement(clickonProfile);
			 clickonProfilel.click();
			 Thread.sleep(2000);
			 MobileElement elemen = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Help\"))"));
			 By clickonhelp=By.xpath("//android.widget.TextView[@text='Help']");
			 WebElement clickonhelgl=driver.findElement(clickonhelp);
			 clickonhelgl.click();
			 Thread.sleep(3000);
			 By helppagetxtmsg=By.xpath("//android.widget.TextView[@text='Help Page']");
			 WebElement helppagetxtmsgl=driver.findElement(helppagetxtmsg);
			 helppagetxtmsgl.isDisplayed();
			 String textdata= helppagetxtmsgl.getText();
			 System.out.println(textdata);
			 String expdata="Help Page";
			 Assert.assertEquals(textdata, expdata,"test case pass");
			  Thread.sleep(3000); 
			  By clickonbackoption=By.xpath("//android.widget.ImageView[@bounds='[28,47][107,126]']");
			  WebElement clickonbackoptionl=driver.findElement(clickonbackoption);
			  clickonbackoptionl.click();
              Thread.sleep(2000);
              By clickonbackoptionp=By.xpath("//android.widget.ImageView[@bounds='[28,47][107,126]']");
			  WebElement clickonbackoptionpl=driver.findElement(clickonbackoptionp);
			  clickonbackoptionpl.click();
		}
		

}
