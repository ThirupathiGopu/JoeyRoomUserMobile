package TestScripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
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

public class RatingAndReviews 
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
		htmlReporter = new ExtentSparkReporter("dailybookings.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8T404LY3P");
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
		  extent.flush();
		 // driver.close();
	  }
	 
//	  private WebElement searchbtnl;
//	  private WebElement welcomebacktextl;

	 @Test
	 public void AddtoRatingAndReviews() throws IOException, InterruptedException 
	 {
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	 
		 By welcomebacktextL=By.xpath("//android.widget.TextView[@text='Welcome Back..!']");
		 WebElement welcomebacktextlT=driver.findElement(welcomebacktextL);
		
// 	 try {
//		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
//     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 Thread.sleep(3000);
//	     By clickonsearchinHomepage=By.xpath("//android.widget.TextView[@text='Search']");
//
//		 By welcomebacktext=By.xpath("//android.widget.TextView[@text='Enter your Mobile Number :']");
//	   searchbtnl=driver.findElement(clickonsearchinHomepage);
//	   welcomebacktextl=driver.findElement(welcomebacktext);
//	 }catch (NoSuchElementException e) {
//		    System.out.println("Element not found: " + e.getMessage());
//	 }
			  if(welcomebacktextlT.isDisplayed())
				 {
				 
					 System.out.println("..............................");

					 
					 String welcomtexts=welcomebacktextlT.getText();
					 System.out.println(welcomtexts);
					 Thread.sleep(3000);
						 By MobilenumberTextl=By.xpath("//android.widget.EditText[@text='Enter your mobile number']");
						 WebElement mobiletextl=driver.findElement(MobilenumberTextl);
						 mobiletextl.clear();
						 mobiletextl.click();
						 mobiletextl.sendKeys("6300867226");
						 Thread.sleep(2000);
						 By passwordTextl=By.xpath("//android.widget.EditText[@text='Enter password']");
						 WebElement PasswordTextl=driver.findElement(passwordTextl);
						 PasswordTextl.clear();
						 PasswordTextl.click();
						 PasswordTextl.sendKeys("abcd@123");
						 Thread.sleep(2000);
						 driver.hideKeyboard();
						 Thread.sleep(2000);
						 By loginbtn=By.xpath("//android.widget.TextView[@text='Login']");
						 WebElement loginbuttonl=driver.findElement(loginbtn);
						loginbuttonl.click();
						Thread.sleep(2000);
						By clickonOkbutton=By.xpath("//android.widget.Button[@text='OK']");
						WebElement clickonokaybtn=driver.findElement(clickonOkbutton);
						clickonokaybtn.click();
						Thread.sleep(2000);
						By clickoncurrentloctionl=By.xpath("//android.widget.TextView[@text='Use your current location']");
						 WebElement clickoncurrentloctionL=driver.findElement(clickoncurrentloctionl);
						 clickoncurrentloctionL.click();
						 Thread.sleep(6000);
						
						 By dailyl=By.xpath("//android.widget.ImageView[@bounds='[0,488][360,881]']");
						 WebElement daily=driver.findElement(dailyl);
						 By weekly=By.xpath("//android.widget.ImageView[@bounds='[360,488][720,881]']");
						 WebElement weeklyl=driver.findElement(weekly);
						 By monthly=By.xpath("//android.widget.ImageView[@bounds='[28,882][692,1276]']");
						 WebElement monthlyl=driver.findElement(monthly);
						 
					
						 if(daily.isDisplayed())
							{
							   daily.click();
								System.out.println("sucessfully enter to home page");
								By dailylink=By.xpath("//android.widget.TextView[@text='Daily']");
								WebElement dailylinkl=driver.findElement(dailylink);
								dailylinkl.isDisplayed();
								dailylinkl.click();
								Thread.sleep(2000);
								
							}
						else if(weeklyl.isDisplayed())
						{
							
							weeklyl.click();	
							System.out.println("sucessfully enter to home page");
							By weeklkyLtxt=By.xpath("//android.widget.TextView[@text='Daily']");
							WebElement weeklkyLtxtL=driver.findElement(weeklkyLtxt);
							weeklkyLtxtL.isDisplayed();
							weeklkyLtxtL.click();
						}
						else 
						{
							monthlyl.click();
							System.out.println("sucessfully enter to home page");
							By monthlyLinkl=By.xpath("//android.widget.TextView[@text='Daily']");
							WebElement monthlyLinkL=driver.findElement(monthlyLinkl);
							monthlyLinkL.isDisplayed();
							monthlyLinkL.click();
						}
					
						 
						 Thread.sleep(3000);
						 By clickonBookings=By.xpath("//android.widget.TextView[@text='Bookings']");
						 WebElement clickonbookingsL=driver.findElement(clickonBookings);
						 clickonbookingsL.isDisplayed();
						 clickonbookingsL.click();
						 Thread.sleep(5000);
						 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
							        "new UiScrollable(new UiSelector().scrollable(true))" +
							         ".scrollIntoView(new UiSelector().text(\"Booking ID : JR23102\"))"));
						 Thread.sleep(3000);
						 By selectproperty=By.xpath("//android.widget.TextView[@text='Booking ID : JR23202']");
						 WebElement selectpropertyl=driver.findElement(selectproperty);
						 selectpropertyl.isDisplayed();
						 selectpropertyl.click();
						 Thread.sleep(3000);
						 By status=By.xpath("//android.widget.TextView[@text='Booked']");
						 WebElement statusl=driver.findElement(status);
						 statusl.isDisplayed();
						 String statustext=statusl.getText();
						 System.out.println(statustext);
						 String expectedstatus="Booked";
						 Assert.assertEquals(statustext, expectedstatus,"expected status and actual status ia matched=status "+statustext);
						Thread.sleep(3000);
						 MobileElement ele= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
							        "new UiScrollable(new UiSelector().scrollable(true))" +
							         ".scrollIntoView(new UiSelector().text(\"Have a Query or Complaint? \"))"));
						 Thread.sleep(3000);
						 By clickonRateYourExperience=By.xpath("//android.widget.TextView[@text='Rate Your Experience']");
						 WebElement clickonRateYourExperiencel=driver.findElement(clickonRateYourExperience);
						 clickonRateYourExperiencel.click();
						 Thread.sleep(3000);
						 By FeedbackTitle=By.xpath("//android.widget.TextView[@text='Feedback']");
						 WebElement feedbackl=driver.findElement(FeedbackTitle);
						 feedbackl.isDisplayed();
						String textdata= feedbackl.getText();
						System.out.println("Actual text title="+textdata);
						String exptext="Feedback";
						Assert.assertEquals(textdata,exptext ,"test case pass");
						Thread.sleep(3000);
						 By valueformoney=By.xpath("//android.widget.ImageView[@bounds='[542,191][589,238]']");
						 WebElement valueformoneyl=driver.findElement(valueformoney);
						 valueformoneyl.isEnabled();
						 valueformoneyl.click();
						 Thread.sleep(3000);
						 By atmosphere=By.xpath("//android.widget.ImageView[@bounds='[542,282][589,329]']");
						 WebElement atmospherel=driver.findElement(atmosphere);
						 atmospherel.isEnabled();
						 atmospherel.click();
						 Thread.sleep(4000);
						 By security=By.xpath("//android.widget.ImageView[@bounds='[542,372][589,419]']");
						 WebElement securityl=driver.findElement(security);
						 securityl.isEnabled();
						 securityl.click();
						 Thread.sleep(4000);
						 By Facilites=By.xpath("//android.widget.ImageView[@bounds='[542,463][589,510]']");
						 WebElement Facilitesl=driver.findElement(Facilites);
						 Facilitesl.isEnabled();
						 Facilitesl.click();
						 Thread.sleep(3000);
						 By locations=By.xpath("//android.widget.ImageView[@bounds='[542,553][589,600]']");
						 WebElement locationsl=driver.findElement(locations);
						 locationsl.isEnabled();
						 locationsl.click();
						 Thread.sleep(3000);
						 By cleanliiines=By.xpath("//android.widget.ImageView[@bounds='[542,644][589,691]']");
						 WebElement cleanliiinesl=driver.findElement(cleanliiines);
						 cleanliiinesl.isEnabled();
						 cleanliiinesl.click();
						 Thread.sleep(3000);
						 By staff=By.xpath("//android.widget.ImageView[@bounds='[542,734][589,781]']");
						 WebElement staffl=driver.findElement(staff);
						 staffl.isEnabled();
						 staffl.click();
						 Thread.sleep(3000);
						 By addrewiesa=By.xpath("//android.widget.EditText[@text='write your review...']");
						 WebElement addrewiesal=driver.findElement(addrewiesa);
						 addrewiesal.click();
						 addrewiesal.sendKeys("Nice seriveces");
				         Thread.sleep(2000);
						 By applybtn=By.xpath("//android.widget.TextView[@text='Apply']");
						 WebElement applybtnl=driver.findElement(applybtn);
						 applybtnl.click();
						 }
			else 
		  {
				
			 Thread.sleep(3000);
			 By clickonBookings=By.xpath("//android.widget.TextView[@text='Bookings']");
			 WebElement clickonbookingsL=driver.findElement(clickonBookings);
			 clickonbookingsL.isDisplayed();
			 clickonbookingsL.click();
			 Thread.sleep(5000);
			 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Booking ID : JR23102\"))"));
			 Thread.sleep(3000);
			 By selectproperty=By.xpath("//android.widget.TextView[@text='Booking ID : JR23202']");
			 WebElement selectpropertyl=driver.findElement(selectproperty);
			 selectpropertyl.isDisplayed();
			 selectpropertyl.click();
			 Thread.sleep(3000);
			 By status=By.xpath("//android.widget.TextView[@text='Booked']");
			 WebElement statusl=driver.findElement(status);
			 statusl.isDisplayed();
			 String statustext=statusl.getText();
			 System.out.println(statustext);
			 String expectedstatus="Booked";
			 Assert.assertEquals(statustext, expectedstatus,"expected status and actual status ia matched=status "+statustext);
			Thread.sleep(3000);
			 MobileElement ele= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Have a Query or Complaint? \"))"));
			 Thread.sleep(3000);
			 By clickonRateYourExperience=By.xpath("//android.widget.TextView[@text='Rate Your Experience']");
			 WebElement clickonRateYourExperiencel=driver.findElement(clickonRateYourExperience);
			 clickonRateYourExperiencel.click();
			 Thread.sleep(3000);
			 By FeedbackTitle=By.xpath("//android.widget.TextView[@text='Feedback']");
			 WebElement feedbackl=driver.findElement(FeedbackTitle);
			 feedbackl.isDisplayed();
			String textdata= feedbackl.getText();
			System.out.println("Actual text title="+textdata);
			String exptext="Feedback";
			Assert.assertEquals(textdata,exptext ,"test case pass");
			Thread.sleep(3000);
			 By valueformoney=By.xpath("//android.widget.ImageView[@bounds='[542,191][589,238]']");
			 WebElement valueformoneyl=driver.findElement(valueformoney);
			 valueformoneyl.isEnabled();
			 valueformoneyl.click();
			 Thread.sleep(3000);
			 By atmosphere=By.xpath("//android.widget.ImageView[@bounds='[542,282][589,329]']");
			 WebElement atmospherel=driver.findElement(atmosphere);
			 atmospherel.isEnabled();
			 atmospherel.click();
			 Thread.sleep(4000);
			 By security=By.xpath("//android.widget.ImageView[@bounds='[542,372][589,419]']");
			 WebElement securityl=driver.findElement(security);
			 securityl.isEnabled();
			 securityl.click();
			 Thread.sleep(4000);
			 By Facilites=By.xpath("//android.widget.ImageView[@bounds='[542,463][589,510]']");
			 WebElement Facilitesl=driver.findElement(Facilites);
			 Facilitesl.isEnabled();
			 Facilitesl.click();
			 Thread.sleep(3000);
			 By locations=By.xpath("//android.widget.ImageView[@bounds='[542,553][589,600]']");
			 WebElement locationsl=driver.findElement(locations);
			 locationsl.isEnabled();
			 locationsl.click();
			 Thread.sleep(3000);
			 By cleanliiines=By.xpath("//android.widget.ImageView[@bounds='[542,644][589,691]']");
			 WebElement cleanliiinesl=driver.findElement(cleanliiines);
			 cleanliiinesl.isEnabled();
			 cleanliiinesl.click();
			 Thread.sleep(3000);
			 By staff=By.xpath("//android.widget.ImageView[@bounds='[542,734][589,781]']");
			 WebElement staffl=driver.findElement(staff);
			 staffl.isEnabled();
			 staffl.click();
			 Thread.sleep(3000);
			 By addrewiesa=By.xpath("//android.widget.EditText[@text='write your review...']");
			 WebElement addrewiesal=driver.findElement(addrewiesa);
			 addrewiesal.click();
			 addrewiesal.sendKeys("Nice seriveces");
	         Thread.sleep(2000);
	         driver.hideKeyboard();
			 By applybtn=By.xpath("//android.widget.TextView[@text='Apply']");
			 WebElement applybtnl=driver.findElement(applybtn);
			 applybtnl.click(); 
		 } 
		 
		 }
		 
}

