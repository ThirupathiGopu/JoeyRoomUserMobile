package TestScripts;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.ActionOptions;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class PayHostelFeePayment
{
	AndroidDriver<MobileElement>  driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	Select select;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException 
	{
		htmlReporter = new ExtentSparkReporter("loginpage 1.html");
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
	 @Test(enabled=true)
	  public void LoginwithpasswordAndPayHosetlFeepayment() throws IOException, InterruptedException 
	 {
		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  
//		 //skip to login
//		 By skiplogil=By.xpath("//android.widget.TextView[@text='Skip Login']");
//		 WebElement skipLoginL=driver.findElement(skiplogil);
//		// skipLoginL.click();
//		 action=new Actions(driver);
//		 Thread.sleep(2000);
//		 action.click();
//		 System.out.println("clicked to skiplogin link");
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

		
		/*
		 By setyourloctationtextl=By.xpath("//android.widget.EditText[@text='Enter City or Area']");
		 WebElement setyourlocstionTitel=driver.findElement(setyourloctationtextl);
		 setyourlocstionTitel.sendKeys("madhapur");
		 Thread.sleep(3000);
		 
	     By selectoption=By.xpath("//android.widget.TextView[@text='Madhapur,Hyderabad,Telangana,India']");
	     WebElement selectoptionl=driver.findElement(selectoption);
		 select =new Select((WebElement) selectoptionl);
		 select.selectByVisibleText("Madhapur,Hyderabad,Telangana,India");
		 selectoptionl.click();
		 */
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
		 
	/*	if( daily.isDisplayed())
		{
			daily.click();
			System.out.println("sucessfully enter to home page");
			By dailylink=By.xpath("//android.widget.TextView[@text='Daily']");
			WebElement dailylinkl=driver.findElement(dailylink);
			dailylinkl.isDisplayed();
			dailylinkl.click();
		}
		
		
		 if(weeklyl.isDisplayed())
		{
			weeklyl.click();	
			System.out.println("sucessfully enter to home page");
			By weeklkyLtxt=By.xpath("//android.widget.TextView[@text='Daily']");
			WebElement weeklkyLtxtL=driver.findElement(weeklkyLtxt);
			weeklkyLtxtL.isDisplayed();
			weeklkyLtxtL.click();
			
		}
		*/
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
		 Thread.sleep(2000);
		    By payhostelfeel=By.xpath("//android.widget.ImageView[@bounds='[572,58][690,152]']");
			WebElement payhostelfeelL=driver.findElement(payhostelfeel);
			payhostelfeelL.isDisplayed();
			payhostelfeelL.click();
			Thread.sleep(3000);
			By PayhostelTitle=By.xpath("//android.widget.TextView[@text='Pay Hostel Fee']");
			WebElement PayhostelTitlel=driver.findElement(PayhostelTitle);
			PayhostelTitlel.isDisplayed();
			String actualTitle =PayhostelTitlel.getText();
			System.out.println(actualTitle);
			String expectedTitle="Pay Hostel Fee";
			Assert.assertEquals(actualTitle, expectedTitle,"test case pass");
			
			
			 By GuestnameTextboxl=By.xpath("//android.widget.EditText[@text='Enter Your name ']");
			 WebElement GuestnameTextbox=driver.findElement(GuestnameTextboxl);
			 GuestnameTextbox.clear();
			 GuestnameTextbox.sendKeys("Ramu");
			 Thread.sleep(2000);
			 By mobilenumberTextl=By.xpath("//android.widget.EditText[@text='Enter 10-digit number  ']");
			 WebElement mobilenumberText=driver.findElement(mobilenumberTextl);
			 mobilenumberText.clear();
			 mobilenumberText.sendKeys("8179592352");	
			 Thread.sleep(2000);
			 By mailidl=By.xpath("//android.widget.EditText[@text='Enter Your mail ID ']");
			 WebElement mailid=driver.findElement(mailidl);
			 mailid.clear();
			 mailid.sendKeys("ramu@gmail.com");
			 Thread.sleep(2000);
			 By propertyId=By.xpath("//android.widget.EditText[@text='Enter ID ']");
			 WebElement propertyIdl=driver.findElement(propertyId);
			 propertyIdl.clear();
			 propertyIdl.sendKeys("JR1012");
			 Thread.sleep(2000);
			 
			// Scroll view method
////			 WebElement element = (WebElement) driver.findElement(MobileBy.AndroidUIAutomator(
//			         "new UiScrollable(new UiSelector().resourceIdMatches(\".*part_id.*\").scrollable(true))" +
//			          ".scrollIntoView(new UiSelector().text(\"Pay Now\"))"));
			 MobileElement elemen = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Apply Coupon :\"))"));

			 Thread.sleep(3000);
			// By RoomModel=By.xpath("//android.widget.TextView[@bounds='[58,623][618,716]']");
			 By RoomModel=By.xpath("//android.widget.TextView[@text='Choose Room Model']");
			 WebElement RoomModell=driver.findElement(RoomModel);
			 RoomModell.click();
			 Thread.sleep(2000);
			 By selectRoomModel=By.xpath("//android.widget.TextView[@text='NCRroom']");
			 WebElement selectRoomModelL=driver.findElement(selectRoomModel);
			 selectRoomModelL.click();
			 
//			select=new Select(RoomModell);
//			select.selectByVisibleText("NCRroom");
			Thread.sleep(2000);
//			
//			By crossmark=By.xpath("android.widget.ImageView[@bounds='[652,1000][691,1039]']");
//			WebElement crossmarksl=driver.findElement(crossmark);
//			crossmarksl.click();
//			Thread.sleep(2000);
			
			 By selectmonth=By.xpath("//android.widget.TextView[@text='Select']");
			 WebElement selectmonthl=driver.findElement(selectmonth);
			 selectmonthl.click();
			 Thread.sleep(2000);
			 By janu=By.xpath("//android.widget.CheckBox[@bounds='[28,1058][88,1118]']");
			 WebElement janul=driver.findElement(janu);
			 janul.click();
			 By feb=By.xpath("//android.widget.CheckBox[@bounds='[28,1137][88,1197]']");
			 WebElement febl=driver.findElement(feb);
			 febl.click();
//			 select=new Select(selectmonthl);
//			 select.selectByVisibleText("January - 2024");
			// Thread.sleep(2000);
			 By clickioncrossmark=By.xpath("//android.view.ViewGroup[@bounds='[652,1000][691,1039]']");
			 WebElement crossmarkl=driver.findElement(clickioncrossmark);
			 crossmarkl.click();
			 Thread.sleep(4000);
			 
			 By bookingamount=By.xpath("//android.widget.EditText[@index=0]");
			 WebElement bookingamountl=driver.findElement(bookingamount);
//			 bookingamountl.clear();
			 bookingamountl.isDisplayed();
			 bookingamountl.click();
			 bookingamountl.clear();
			 bookingamountl.sendKeys("2500");
			 driver.hideKeyboard();
			 Thread.sleep(2000);
			 By viewmorecouponsl=By.xpath("//android.widget.TextView[@text='View more coupons']");
			 WebElement viewmorecouponslL=driver.findElement(viewmorecouponsl);
			 viewmorecouponslL.click();
//			 MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//				        "new UiScrollable(new UiSelector().scrollable(true))" +
//				         ".scrollIntoView(new UiSelector().text(\"Pay Now\"))"));
			 Thread.sleep(2000);
			 By selectcoupnsapply=By.xpath("//android.widget.TextView[@text='APPLY']");
			 WebElement selectcoupnsapplyl=driver.findElement(selectcoupnsapply);
			 selectcoupnsapplyl.click();
			 Thread.sleep(2000);
			 By paynow=By.xpath("//android.widget.TextView[@text='Pay Now']");
			 WebElement paynowl=driver.findElement(paynow);
			 paynowl.click();
			 Thread.sleep(2000);
			 By wallet=By.xpath("//android.view.View[@text='Wallet']");
			 WebElement walletl=driver.findElement(wallet);
			 walletl.click();
			 Thread.sleep(4000);
			 By freecharge=By.xpath("//android.widget.TextView[@text='Freecharge']");
			 WebElement freechargel=driver.findElement(freecharge);
			 freechargel.click();
			 Thread.sleep(3000);
			 By paynowbtn=By.xpath("//android.widget.Button[@text='Pay Now']");
			 WebElement paynowbtnl=driver.findElement(paynowbtn);
			 paynowbtnl.click();
			 Thread.sleep(2000);
			 By otp=By.xpath("//android.widget.EditText[@bounds='[37,421][684,511]']");
			 WebElement otpl=driver.findElement(otp);
			 otpl.sendKeys("1234");
			 By continuebtn=By.xpath("//android.widget.Button[@text='Continue']");
			 WebElement continuebtnl=driver.findElement(continuebtn);
			 continuebtnl.isDisplayed();
			 continuebtnl.click();
			 System.out.println("payment  successfully done ");
			 Thread.sleep(6000);
			 
			 By backoprion=By.xpath("//android.widget.ImageView[@index=0]");
			 WebElement backoptionsl=driver.findElement(backoprion);
			 backoptionsl.isDisplayed();
			backoptionsl.click();
			Thread.sleep(3000);
			MobileElement eleme = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"Pay Hostel Fee\"))"));
			Thread.sleep(2000);
			By backoptn=By.xpath("//android.widget.ImageView[@index=0]");
			 WebElement backoptnl=driver.findElement(backoptn);
			 backoptnl.isDisplayed();
			 backoptnl.click();
			 Thread.sleep(3000);
			 By menubar=By.xpath("//android.widget.ImageView[@bounds='[53,91][82,117]']");
			 WebElement menubarl=driver.findElement(menubar);
			 menubarl.click();
			 Thread.sleep(3000);
			 MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"Logout\"))"));
			 By logout=By.xpath("//android.widget.TextView[@text='Logout']");
			 WebElement logoutl=driver.findElement(logout);
			 logoutl.click();
			 Thread.sleep(2000);
			driver.close();
			
			 System.out.println("application  successfully close");
			 
			 
			 
	  }
	 @Test(enabled=false)
	 public void LoginWithOtpAndPayhosetlfee() throws InterruptedException
	 {
		 
		 //driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
	
		 By appli=By.xpath("//android.widget.TextView[@text='Joey Rooms']");
		 WebElement appliL=driver.findElement(appli);
		 appliL.click();
		 Thread.sleep(9000);
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.hideKeyboard();
		 //Thread.sleep(6000);
		 Thread.sleep(3000);
		 By logibntwithOTP=By.xpath("//android.widget.TextView[@text='Login with OTP']");
		 WebElement loginwithOptl=driver.findElement(logibntwithOTP);
		 loginwithOptl.isDisplayed();
		 loginwithOptl.click();
		 Thread.sleep(4000);
		 By usernametextbox=By.xpath("//android.widget.EditText[@text='Enter your mobile number']");
		 WebElement usernamel=driver.findElement(usernametextbox);
		 usernamel.clear();
		 usernamel.sendKeys("6300867226");
		 Thread.sleep(2000);
		 By GenarateWithOtp=By.xpath("//android.view.ViewGroup[@index=6]");
		 WebElement GenarateWithOtpl=driver.findElement(GenarateWithOtp);
		
		String data=GenarateWithOtpl.getText();
		System.out.println(data);
		Thread.sleep(3000);
//		//GenarateWithOtpl.click();
//		JavascriptExecutor js=JavascriptExecutor(driver);
//		js.executeScript("arguments[0].click();", GenarateWithOtpl);
		action=new Actions(driver);
		action.moveToElement(GenarateWithOtpl);
		action.click(GenarateWithOtpl);
		
		 Thread.sleep(6000);
		 By otptextmsg=By.xpath("//android.widget.TextView[@text='One Time Password']");
		 WebElement otptextmsl=driver.findElement(otptextmsg);
		 otptextmsl.isDisplayed();
		String titletext= otptextmsl.getText();
		System.out.println(titletext);
		String expectedTextTile="One Time Password";
		Assert.assertEquals(titletext, expectedTextTile,"test case pass");
		Thread.sleep(2000);
		By checkbox1l=By.xpath("//android.widget.EditText[@bounds='[49,561][100,655]']");
		WebElement checkbox1L=driver.findElement(checkbox1l);
		if(checkbox1L.isDisplayed())
		{
			checkbox1L.sendKeys("1");
			
		}
		Thread.sleep(2000);
		
		By checkbox2l=By.xpath("//android.widget.EditText[@bounds='[171,561][222,655]']");
		WebElement checkbox2L=driver.findElement(checkbox2l);
		if(checkbox2L.isDisplayed())
		{
			checkbox2L.sendKeys("2");
			
		}
		Thread.sleep(2000);
		By checkbox3l=By.xpath("//android.widget.EditText[@bounds='[293,561][344,655]']");
		WebElement checkbox3L=driver.findElement(checkbox3l);
		if(checkbox3L.isDisplayed())
		{
			checkbox3L.sendKeys("3");
			
		}
		Thread.sleep(2000);
		By checkbox4l=By.xpath("//android.widget.EditText[@bounds='[415,561][466,655]']");
		WebElement checkbox4L=driver.findElement(checkbox4l);
		if(checkbox4L.isDisplayed())
		{
			checkbox4L.sendKeys("4");
			
		}
		Thread.sleep(2000);
		By submitbtn=By.xpath("//android.widget.TextView[@text='Submit']");
		WebElement submitbtnl=driver.findElement(submitbtn);
		submitbtnl.click();
		 
	 }
	
	@Test(enabled=false)
	 public void LoginWithOtpwithoutmobilenumber() throws InterruptedException
	 {
		 By logibntwithOTP=By.xpath("//android.widget.TextView[@text='Login with OTP']");
		 WebElement loginwithOptl=driver.findElement(logibntwithOTP);
		 loginwithOptl.isDisplayed();
		 loginwithOptl.click();
		 Thread.sleep(2000);
		 By usernametextbox=By.xpath("//android.widget.EditText[@text='Enter your mobile number']");
		 WebElement usernamel=driver.findElement(usernametextbox);
		 usernamel.clear();
		 usernamel.sendKeys("");
		 Thread.sleep(2000);
		 By GenarateWithOtp=By.xpath("//android.widget.TextView[@text='Generate with OTP']");
		 WebElement GenarateWithOtpl=driver.findElement(GenarateWithOtp);
		 GenarateWithOtpl.isDisplayed();
		 GenarateWithOtpl.click();
		 Thread.sleep(2000);
		 
        
		 
	 }
}
