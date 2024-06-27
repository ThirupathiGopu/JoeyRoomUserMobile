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

public class CorporateClients 
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
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"), cap);
		System.out.println("Android driver started successfully");

	}

	@AfterTest
	public void afterTest() {
		extent.flush();
		// driver.close();
	}

	@Test
	public void ClickonAboutUS() throws Exception {

		driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 By MobilenumberTextl=By.xpath("//android.widget.EditText[@text='Enter your mobile number']");
//		 WebElement mobiletextl=driver.findElement(MobilenumberTextl);
//		 mobiletextl.clear();
//		 mobiletextl.click();
//		 mobiletextl.sendKeys("6300867226");
//		 Thread.sleep(2000);
//		 By passwordTextl=By.xpath("//android.widget.EditText[@text='Enter password']");
//		 WebElement PasswordTextl=driver.findElement(passwordTextl);
//		 PasswordTextl.clear();
//		 PasswordTextl.click();
//		 PasswordTextl.sendKeys("abcd@123");
//		 Thread.sleep(2000);
//		 driver.hideKeyboard();
//		 Thread.sleep(2000);
//		 By loginbtn=By.xpath("//android.widget.TextView[@text='Login']");
//		 WebElement loginbuttonl=driver.findElement(loginbtn);
//		loginbuttonl.click();
//		
//		By clickonOkbutton=By.xpath("//android.widget.Button[@text='OK']");
//		WebElement clickonokaybtn=driver.findElement(clickonOkbutton);
//		clickonokaybtn.click();
//        Thread.sleep(3000);
//        By clickoncurrentloctionl=By.xpath("//android.widget.TextView[@text='Use your current location']");
//		 WebElement clickoncurrentloctionL=driver.findElement(clickoncurrentloctionl);
//		 clickoncurrentloctionL.click();
//		 Thread.sleep(6000);
//		 By dailyl=By.xpath("//android.widget.ImageView[@bounds='[0,488][360,881]']");
//		 WebElement daily=driver.findElement(dailyl);
//		 By weekly=By.xpath("//android.widget.ImageView[@bounds='[360,488][720,881]']");
//		 WebElement weeklyl=driver.findElement(weekly);
//		 By monthly=By.xpath("//android.widget.ImageView[@bounds='[28,882][692,1276]']");
//		 WebElement monthlyl=driver.findElement(monthly);
//		 if(daily.isDisplayed())
//			{
//			   daily.click();
//				System.out.println("sucessfully enter to home page");
//				By dailylink=By.xpath("//android.widget.TextView[@text='Daily']");
//				WebElement dailylinkl=driver.findElement(dailylink);
//				dailylinkl.isDisplayed();
//				dailylinkl.click();
//				Thread.sleep(2000);
//				
//			}
//		else if(weeklyl.isDisplayed())
//		{
//			weeklyl.click();	
//			System.out.println("sucessfully enter to home page");
//			By weeklkyLtxt=By.xpath("//android.widget.TextView[@text='Daily']");
//			WebElement weeklkyLtxtL=driver.findElement(weeklkyLtxt);
//			weeklkyLtxtL.isDisplayed();
//			weeklkyLtxtL.click();
//		}
//		else 
//		{
//			monthlyl.click();
//			System.out.println("sucessfully enter to home page");
//			By monthlyLinkl=By.xpath("//android.widget.TextView[@text='Daily']");
//			WebElement monthlyLinkL=driver.findElement(monthlyLinkl);
//			monthlyLinkL.isDisplayed();
//			monthlyLinkL.click();
//		}
		Thread.sleep(2000);

		By clickOnMenubaruoption = By.xpath("//android.view.ViewGroup[@bounds='[30,67][105,142]']");
		WebElement clickOnMenubaruoptionl = driver.findElement(clickOnMenubaruoption);
		clickOnMenubaruoptionl.isDisplayed();
		clickOnMenubaruoptionl.click();
		Thread.sleep(2000);
		MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().text(\"About Us\"))"));
		By clickOnCorporate = By.xpath("//android.widget.TextView[@text='Corporate clients']");
		WebElement clickOnCorporatel = driver.findElement(clickOnCorporate);
		clickOnCorporatel.isDisplayed();
		clickOnCorporatel.click();
		Thread.sleep(2000);
    
	  By clickOnMedplus = By.xpath("//android.widget.TextView[@text='Medplus']");
	  WebElement clickOnMedplusl = driver.findElement(clickOnMedplus);
	  clickOnMedplusl.isDisplayed();
	 String medplustext= clickOnMedplusl.getText();
	 System.out.println(medplustext);
	  clickOnMedplusl.click();
	  String expText="Medplus";
	  Assert.assertEquals(medplustext, expText,"test case pass");
	  Thread.sleep(2000);
	  By textdatamedpl=By.xpath("//android.widget.TextView[@text='MedPlus is our trusted corporate partner and currently we are providing hospitality services in Hyderabad and Bangalore.']");
	  WebElement textdatamepls=driver.findElement(textdatamedpl);
	 String txtdata= textdatamepls.getText();
	 System.out.println(txtdata);
	 String expdata="MedPlus is our trusted corporate partner and currently we are providing hospitality services in Hyderabad and Bangalore.";
	Assert.assertEquals(txtdata, expdata,"test case pass");
	Thread.sleep(2000);
	By backoption=By.xpath("//android.widget.ImageView[@bounds='[28,75][107,154]']");
	WebElement backoptionl=driver.findElement(backoption);
	backoptionl.click();
	Thread.sleep(2000);
	By backoptionbtn=By.xpath("//android.widget.ImageView[@index=0]");
	WebElement backoptionbtnl=driver.findElement(backoptionbtn);
	backoptionbtnl.click();
	Thread.sleep(2000);
	MobileElement elemen= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true))" +
	         ".scrollIntoView(new UiSelector().text(\"Logout\"))"));
	By clickonLogout=By.xpath("//android.widget.TextView[@text='Logout']");
	WebElement clickonlogoutbtnl=driver.findElement(clickonLogout);
	clickonlogoutbtnl.click();
	Thread.sleep(2000);
	 By welcomebacktextL=By.xpath("//android.widget.TextView[@text='Welcome Back..!']");
	 WebElement welcomebacktextlT=driver.findElement(welcomebacktextL);
	String text= welcomebacktextlT.getText();
	System.out.println(text);
	String exptext="Welcome Back..!";
	Assert.assertEquals(text, exptext,"test case pass");
	 
}
}
