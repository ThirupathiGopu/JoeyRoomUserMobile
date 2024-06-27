package TestScripts;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;

public class Testclass 
{
	AndroidDriver driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException {
		htmlReporter = new ExtentSparkReporter("Signup 1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	     
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8T404LY3P");
		cap.setCapability("Platformname", "Android");
		cap.setCapability("Platformversion", "13");
		
		//cap.setCapability("Devicename", "Le1S");
		//cap.setCapability("UDID", "ROVGMRBAYPMBJF45");
		//cap.setCapability("Platformname", "Android");
		//cap.setCapability("Platformversion", "6.0");
		
		
		
		cap.setCapability("apppackage", "com.joeyrooms");
		cap.setCapability("appactivity", "com.joeyrooms.MainActivity - Joey Rooms");
		//URL url = new URL("http://127.0.1.1:4723/wd/hub");
		driver = new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Android driver started successfully");
		//driver.findElementByXPath("//android.widget.TextView[@text='Troop Messenger']").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	 @AfterTest
	  public void afterTest() 
	 {
		  extent.flush();
	  }
	 @Test
	  public void Lanchappclicktoskiplogin() throws IOException, InterruptedException {
		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		// click on signup
		/*  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='Signup']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			// click on submit
			
		driver.findElementById("com.tvisha.troopmessenger:id/submitForm").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		String toastMessage = driver.findElementByXPath("//android.widget.Toast").getText();
		System.out.println(toastMessage);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 click on login
		driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();
		By emaitextl=By.xpath("//android.widget.EditText[@text='E-mail']");
		WebElement emailtextbox=driver.findElement(emaitextl);
		emailtextbox.click();
		emailtextbox.clear();
		emailtextbox.sendKeys("gopu.thirupathi@tvisha.in");
		Thread.sleep(2000);
		By passwordtextl=By.xpath("//android.widget.EditText[@text='Password']");
		WebElement passwordtextboxl=driver.findElement(passwordtextl);
		passwordtextboxl.click();
		passwordtextboxl.clear();
		passwordtextboxl.sendKeys("Thiru@123");
		Thread.sleep(2000);
		By logintbn=By.id("com.tvisha.troopmessenger:id/submitImg");
		WebElement loginbtnl=driver.findElement(logintbn);
		loginbtnl.click();
		Thread.sleep(2000);
		By Trooptext=By.id("com.tvisha.troopmessenger:id/actionLable");
		WebElement troopmtext=driver.findElement(Trooptext);
		troopmtext.isDisplayed();
		String title=troopmtext.getText();
		System.out.println(title);
		//String expectedtitle="TROOPM.";
		//Assert.assertEquals(title, expectedtitle,"test case pass");
		By searchl=By.id("com.tvisha.troopmessenger:id/fabsearchChat");
		WebElement searchboxl=driver.findElement(searchl);
		searchboxl.click();
		Thread.sleep(2000);
		By searchboxtxt=By.xpath("//android.widget.EditText[@text='Search']");
		WebElement searchboxtextl=driver.findElement(searchboxtxt);
		searchboxtextl.clear();
		searchboxtextl.click();
		//searchboxtextl.sendKeys("sumith jadhav");
		searchboxtextl.sendKeys("vinay alle");

		Thread.sleep(2000);
		By namel=By.id("com.tvisha.troopmessenger:id/top_view");
		WebElement nametextl=driver.findElement(namel);
		nametextl.click();
		Thread.sleep(2000);
		By textmsgl=By.xpath("//android.widget.EditText[@text='write message...']");
		WebElement textmsgL=driver.findElement(textmsgl);
		textmsgL.sendKeys("good em doing");
		Thread.sleep(2000);
		By sentbutton=By.id("com.tvisha.troopmessenger:id/sendMessage");
		WebElement sentbtnl=driver.findElement(sentbutton);
		sentbtnl.isDisplayed();
		sentbtnl.click();
		Thread.sleep(2000);
		By backoptionl=By.id("com.tvisha.troopmessenger:id/actionBack");
		WebElement backoptionL=driver.findElement(backoptionl);
		backoptionL.click();
		Thread.sleep(2000);
		By headerl=By.id("com.tvisha.troopmessenger:id/viewBar");
		WebElement header=driver.findElement(headerl);
		header.click();
		Thread.sleep(2000);
		By logoutL=By.id("com.tvisha.troopmessenger:id/navLogout");
		WebElement logout=driver.findElement(logoutL);
		logout.click();
		/*By signupL=By.xpath("//android.widget.TextView[@text='Signup']");
		WebElement signupl=driver.findElement(signupL);
		if(signupl.isDisplayed())
		{
			String text=signupl.getText();
			System.out.println(text);
			String expectedtext="Signup";
			signupl.click();
			Assert.assertEquals(text, expectedtext,"test case pass");
		}
			*/ 	
		 //skip to login
		 By skiplogil=By.xpath("//android.widget.TextView[@text='Skip Login']");
		 WebElement skipLoginL=driver.findElement(skiplogil);
		// skipLoginL.click();
		 action=new Actions(driver);
		 Thread.sleep(2000);
		 action.click(skipLoginL);
		 System.out.println("clicked to skiplogin link");
		 Thread.sleep(2000);
		 By setyourloctationtextl=By.xpath("//android.widget.TextView[@text='Set your location']");
		 WebElement setyourlocstionTitel=driver.findElement(setyourloctationtextl);
		String titletext= setyourlocstionTitel.getText();
		System.out.println("visible text data ="+titletext);
		 
		 
	  }
	 
}
