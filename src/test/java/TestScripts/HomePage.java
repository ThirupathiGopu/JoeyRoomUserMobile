package TestScripts;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.List;
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

public class HomePage 
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
	public void BestDalsandOffers() throws Exception
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
//			 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//				        "new UiScrollable(new UiSelector().scrollable(true))" +
////				         ".scrollIntoView(new UiSelector().text(\"\"))"));
//			 By displayBestDealsoffertext=By.xpath("//android.widget.TextView[@text='Best deals and Offers']");
//			 WebElement displayBestDealsoffertextl=driver.findElement(displayBestDealsoffertext);
//			 String text=displayBestDealsoffertextl.getText();
//             System.out.println(text);
//			 Thread.sleep(3000);

			 By propertiesnearyou=By.xpath("//android.widget.TextView[@text='Properties Near You']");
			 WebElement propertiesnearyoul=driver.findElement(propertiesnearyou);
			 
			 if( propertiesnearyoul.isDisplayed())
			{
			 Thread.sleep(3000);
			 By clickonViewAll=By.xpath("//android.widget.TextView[@text='View all']");
			 WebElement clickonViewAllL=driver.findElement(clickonViewAll);
			
			 Thread.sleep(2000);
			 if (clickonViewAllL.isDisplayed())
			 {
				 clickonViewAllL.click();
				 
			 }
			 else
			 {
			 By offerdetailslist=By.xpath("//android.widget.TextView[@text='Happy New Year']");
			 WebElement offerdetailsLists=driver.findElement(offerdetailslist);
			 String happytextdata=offerdetailsLists.getText();
			 System.out.println(happytextdata);
			 Thread.sleep(2000);
			 By viewproperties=By.xpath("//android.widget.TextView[@text='View Properties']");
			 WebElement viewpropertiesl=driver.findElement(viewproperties);
			 String viewpprop=viewpropertiesl.getText();
			 System.out.println(viewpprop);
			 viewpropertiesl.isEnabled();
			 if (viewpropertiesl.isDisplayed())
			 {
				 viewpropertiesl.click(); 
			 }
			 else
			 {
				 By clickonbackoption=By.xpath("//android.view.ViewGroup[@bounds='[28,66][113,150]']");
				 WebElement clickonbackoptionl=driver.findElement(clickonbackoption);
				 clickonbackoptionl.isDisplayed();
				 clickonbackoptionl.click();
			 }
			 }

			}
//			else if(displaypropertiesnearyoutextl.isDisplayed())
//			{
//				 By clickonViewAll=By.xpath("//android.widget.TextView[@text='View all']");
//				 WebElement clickonViewAllL=driver.findElement(clickonViewAll);
//				 clickonViewAllL.click();
//			}
		 } 
		 else 
		 {
//			 String welcomtext=welcomebacktextl.getText();
//			 System.out.println(welcomtext);
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
				 By displayBestDealsoffertext=By.xpath("//android.widget.TextView[@text='Best deals and Offers']");
				 WebElement displayBestDealsoffertextl=driver.findElement(displayBestDealsoffertext);
				 Thread.sleep(3000);
				 By displaypropertiesnearyoutext=By.xpath("//android.widget.TextView[@text='Best deals and Offers']");
				 WebElement displaypropertiesnearyoutextl=driver.findElement(displaypropertiesnearyoutext);
				if( displayBestDealsoffertextl.isDisplayed())
				{
				 Thread.sleep(3000);
				 By clickonViewAll=By.xpath("android.widget.TextView[@text='View all']");
				 WebElement clickonViewAllL=driver.findElement(clickonViewAll);
				 clickonViewAllL.click();
				}
				else if(displaypropertiesnearyoutextl.isDisplayed())
				{
					 By clickonViewAll=By.xpath("//android.widget.TextView[@text='View all']");
					 WebElement clickonViewAllL=driver.findElement(clickonViewAll);
					 clickonViewAllL.click();
				}	
	 }
	 
	}
	}


