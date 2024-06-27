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

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class PropertiesNearYou 
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
	 @Test
	 public void ClickOnPropertyNearYou() throws Exception
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
        Thread.sleep(3000);
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
		 Thread.sleep(2000);
        By clickOnMenubaruoption=By.xpath("//android.view.ViewGroup[@bounds='[30,67][105,142]']");
        WebElement clickOnMenubaruoptionl=driver.findElement(clickOnMenubaruoption);
        clickOnMenubaruoptionl.isDisplayed();
        clickOnMenubaruoptionl.click();
        Thread.sleep(2000);
        By propertynearyou=By.xpath("//android.widget.TextView[@text='Properties Near You']");
        WebElement propertynearyoul=driver.findElement(propertynearyou);
        propertynearyoul.click();
        Thread.sleep(2000);
        By isdisplayDpapoularnearTex=By.xpath("//android.widget.TextView[@text='Properties Near You']");
        WebElement isdisplayDpapoularnearTexl=driver.findElement(isdisplayDpapoularnearTex);
        isdisplayDpapoularnearTexl.isDisplayed();
        String textdata=isdisplayDpapoularnearTexl.getText();
        System.out.println(textdata);
        String Exptextdata="Properties Near You";
        Assert.assertEquals(textdata, Exptextdata, "test case pass");
        Thread.sleep(2000);
        By clickonviewall=By.xpath("//android.widget.TextView[@text='View all']");
        WebElement clickonviewAllL=driver.findElement(clickonviewall);
        clickonviewAllL.click();
        Thread.sleep(3000);
        By hoteltext=By.xpath("//android.widget.TextView[@text='Hotel']");
        WebElement hoteltextl=driver.findElement(hoteltext);
        String data=hoteltextl.getText();
        System.out.println(data);
        String expecteddata="Hotel";
        Assert.assertEquals(data, expecteddata,"test case passs");
        
	 }

}
