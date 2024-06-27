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

public class RefferAndEarn
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
	public void clickonBlogs() throws Exception {

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
		         ".scrollIntoView(new UiSelector().text(\"₹   Refer & Earn\"))"));
		By clickOnReviewAndEarn = By.xpath("//android.widget.TextView[@text='₹   Refer & Earn']");
		WebElement clickOnReviewAndEarnl = driver.findElement(clickOnReviewAndEarn);
		clickOnReviewAndEarnl.isDisplayed();
		clickOnReviewAndEarnl.click();
		Thread.sleep(2000);
		
		By isdisplayWallet = By.xpath("//android.widget.TextView[@text='Wallet']");
		WebElement isdisplayWalletl = driver.findElement(isdisplayWallet);
		isdisplayWalletl.isDisplayed();
		String textdata = isdisplayWalletl.getText();
		System.out.println(textdata);
		String Exptextdata = "Wallet";
		Assert.assertEquals(textdata, Exptextdata, "test case pass");
         Thread.sleep(3000);
         By Refferalcodetext=By.xpath("//android.widget.TextView[@text='JOEY1465901136888']");
         WebElement Refferalcodetextl=driver.findElement(Refferalcodetext);
         Refferalcodetextl.isDisplayed();
        String data= Refferalcodetextl.getText();
        System.out.println(data);
        String exprefferalcode="JOEY1465901136888";
        Assert.assertEquals(data, exprefferalcode,"Test case pass");
        Thread.sleep(3000);
		By copyyourcode=By.xpath("//android.widget.TextView[@text='Copy your code']");
		WebElement copyyourcodel=driver.findElement(copyyourcode);
		copyyourcodel.isDisplayed();
		String copyyourcodeltext=copyyourcodel.getText();
		System.out.println(copyyourcodeltext);
		String ExpCopyyourcodetext="Copy your code";
		copyyourcodel.click();
		Assert.assertEquals(copyyourcodeltext, ExpCopyyourcodetext,"test case pass");
		Thread.sleep(3000);
		By clickokbtn=By.xpath("//android.widget.Button[@text='OK']");
		WebElement clickokbtnl=driver.findElement(clickokbtn);
		clickokbtnl.click();
		Thread.sleep(2000);
		By shareyourcode=By.xpath("//android.widget.TextView[@text='Share your code']");
		WebElement shareyourcodel=driver.findElement(shareyourcode);
		shareyourcodel.isDisplayed();
		String shareyourcodetext=shareyourcodel.getText();
		System.out.println(shareyourcodetext);
		String Expshareyoucode="Share your code";
		//shareyourcodel.click();
		Assert.assertEquals(shareyourcodetext, Expshareyoucode,"test case pass");
		//driver.hideKeyboard();
		Thread.sleep(2000);
		By IsdisplayCoinsEarns=By.xpath("//android.widget.TextView[@text='Coins Earned']");
		WebElement IsdisplayCoinsEarnsl=driver.findElement(IsdisplayCoinsEarns);
		IsdisplayCoinsEarnsl.isDisplayed();
		String Coinseraned=IsdisplayCoinsEarnsl.getText();
		System.out.println(Coinseraned);
		String expectdcoinsearns="Coins Earned";
		IsdisplayCoinsEarnsl.click();
		Assert.assertEquals(Coinseraned,expectdcoinsearns ,"test case pass");
		Thread.sleep(2000);
		By earndateisdisplay=By.xpath("//android.widget.TextView[@text='Jan 18th 24']");
		WebElement earndateisdiplayl=driver.findElement(earndateisdisplay);
		earndateisdiplayl.isDisplayed();
		String earndatetext=earndateisdiplayl.getText();
		System.out.println(earndatetext);
		String ExpeEarndate="Jan 18th 24";
		Assert.assertEquals(earndatetext, ExpeEarndate,"test case pass");
		By IsdisplayCoinsSpent=By.xpath("//android.widget.TextView[@text='Coins Spent']");
		WebElement IsdisplayCoinsSpentl=driver.findElement(IsdisplayCoinsSpent);
		IsdisplayCoinsSpentl.isDisplayed();
		String CoinsSpent=IsdisplayCoinsSpentl.getText();
		System.out.println(Coinseraned);
		String expectdcoinsSpent="Coins Spent";
		IsdisplayCoinsSpentl.click();
		Assert.assertEquals(CoinsSpent,expectdcoinsSpent ,"test case pass");
	    Thread.sleep(2000);
	    By SpentCoinsbookingId=By.xpath("//android.widget.TextView[@text='Booking ID : JR23305']");
	    WebElement SpentCoinsbookidl=driver.findElement(SpentCoinsbookingId);
	    SpentCoinsbookidl.isDisplayed();
	    String actualBookingId=SpentCoinsbookidl.getText();
	    System.out.println(actualBookingId);
	    String ExpectedBooingId="Booking ID : JR23305";
	    Assert.assertEquals(actualBookingId, ExpectedBooingId,"test case pass");
}
}
