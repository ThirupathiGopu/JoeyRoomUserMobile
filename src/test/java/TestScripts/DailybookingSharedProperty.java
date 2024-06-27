package TestScripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class DailybookingSharedProperty 
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
	  }
	 @Test
	 public void LoginwithpasswordAndDailybookingpayment() throws IOException, InterruptedException 
	 {
		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
		
		By clickonOkbutton=By.xpath("//android.widget.Button[@text='OK']");
		WebElement clickonokaybtn=driver.findElement(clickonOkbutton);
		clickonokaybtn.click();

		
		
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
		 By clickonsearchinHomepage=By.xpath("//android.widget.TextView[@text='Search']");
		 WebElement searchbtnl=driver.findElement(clickonsearchinHomepage);
		 searchbtnl.isDisplayed();
		 searchbtnl.click();
		 Thread.sleep(8000);
		 By hosteltitle=By.xpath("//android.widget.TextView[@text='PG Hostel']");
		 WebElement hostelTitleL=driver.findElement(hosteltitle);
		 hostelTitleL.isDisplayed();
		 Thread.sleep(3000);
		 By jkreddyhstl=By.xpath("//android.widget.TextView[@text='JR111 JK Reddy PG Hostel']");
		 WebElement jkreddyhstlL=driver.findElement(jkreddyhstl);
		 jkreddyhstlL.click();
		 
		 Thread.sleep(4000);
		 By selectroombtnl=By.xpath("//android.widget.TextView[@text='Select Rooms']");
		 WebElement selectroombtnL=driver.findElement(selectroombtnl);
		 selectroombtnL.isEnabled();
		 selectroombtnL.click();
		 Thread.sleep(3000);
		 By selectbtn=By.xpath("//android.widget.TextView[@text='Select']");
		 WebElement selectbtnl=driver.findElement(selectbtn);
		 By clickonbackbtb=By.xpath("//android.widget.ImageView[@bounds='[28,69][113,153]']");
		 // By clickonbackbtb=By.xpath("//android.widget.ImageView[@index='0']");
		 WebElement clickonbackbtnl=driver.findElement(clickonbackbtb);
		 
		if( selectbtnl.isEnabled())
		{
			selectbtnl.click();
			By clickonplusbtn=By.xpath("//android.widget.TextView[@text='+']");
			 WebElement clickonplusbtnl=driver.findElement(clickonplusbtn);
			 clickonplusbtnl.click();
			 Thread.sleep(2000);
			 By clickonsubstractionbtn=By.xpath("//android.widget.TextView[@text='-']");
			 WebElement clickonsubstractionbtnl=driver.findElement(clickonsubstractionbtn);
			 clickonsubstractionbtnl.click();
			 Thread.sleep(3000);
			 By proceedtocheckout=By.xpath("//android.widget.TextView[@text='Proceed to Checkout']");
			 WebElement proceedtocheckoutl=driver.findElement(proceedtocheckout);
			 proceedtocheckoutl.isDisplayed();
			 proceedtocheckoutl.click();
			 Thread.sleep(4000);
			 MobileElement element= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Total Amount\"))"));
			 Thread.sleep(3000);
			 By payatcheckin=By.xpath("//android.widget.TextView[@text='Pay @ Check In']");
			 WebElement payatcheckinl=driver.findElement(payatcheckin);
			 payatcheckinl.click();
			 System.out.println("booking successfully completed ");
			 Thread.sleep(6000);
			 By bookingdetailpage=By.xpath("//android.widget.TextView[@text='Booking Detail']");
			 WebElement bookingdetailpagel=driver.findElement(bookingdetailpage);
			 String titletext=bookingdetailpagel.getText();
			 if(bookingdetailpagel.isDisplayed())
			 {
				 System.out.println(titletext);
				 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true))" +
					         ".scrollIntoView(new UiSelector().text(\"Total Amount\"))"));
				 By clickonQuerys=By.xpath("//android.widget.TextView[@text='Have a Query or Request? ']");
				 WebElement clickonQuerysl=driver.findElement(clickonQuerys);
				 String clickonQuerysL=clickonQuerysl.getText();
				 System.out.println(clickonQuerysL);
				 clickonQuerysl.click();
				 Thread.sleep(3000);
				 By textbox=By.xpath("//android.widget.EditText[@text='Type here']");
				 WebElement textboxl=driver.findElement(textbox);
				 textboxl.sendKeys("services not good... implement to services");
				 By clickonsubmitbn=By.xpath("//android.widget.TextView[@text='Submit']");
				 WebElement clickonsubmitbnl=driver.findElement(clickonsubmitbn);
				 clickonsubmitbnl.click();
				 Thread.sleep(3000);
				 By clickonokaybn=By.xpath("//android.widget.Button[@text='OK']");
				 WebElement clickonokaybnl=driver.findElement(clickonokaybn);
				 clickonokaybnl.click();
		}
		}
		else
		{
			 clickonbackbtnl.click();
		}
	 

}
}
