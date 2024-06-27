package TestScripts;



	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
	import java.net.MalformedURLException;
	import java.net.URL;
import java.util.concurrent.TimeUnit;

	public class AppAutomationTest {

	    public static void main(String[] args) throws MalformedURLException, InterruptedException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M12");
	       // caps.setCapability(MobileCapabilityType.APP, "path/to/your/app.apk");
           
	        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"), caps);
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms']")).click();
	     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Check if user is already logged in
	        if (isLoggedIn(driver)) {
	            // User is logged in, navigate to the dashboard
	            navigateToDashboard(driver);
	        } else {
	            // User is not logged in, perform login
	            performLogin(driver);
	            // After login, navigate to the dashboard
	            navigateToDashboard(driver);
	        }

	        // Close the app session
	        driver.quit();
	    }

	    private static boolean isLoggedIn(AndroidDriver<MobileElement> driver) {
	        // Check if the logout button is visible (indicating that the user is logged in)
	    	  By textname=By.xpath("//android.widget.TextView[@text='Best deals and Offers']");
	    	  WebElement textdata=driver.findElement(textname);
	    	 String data= textdata .getText();
	    	 if(data.equals("Best deals and Offers")) {
	    		 return true;
	    	 }else {
	    		 return false;
	    	 }
	    	  
			
	       
	    }

	    private static void performLogin(AndroidDriver<MobileElement> driver) throws InterruptedException {
	        // Perform the login process (Enter credentials, click login button, etc.)
	        MobileElement usernameField = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your mobile number']"));
	        usernameField.sendKeys("6300867226");

	        MobileElement passwordField = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter password']"));
	        passwordField.sendKeys("abcd@123");
	        Thread.sleep(2000);
            driver.hideKeyboard();
            Thread.sleep(2000);
	        MobileElement loginButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Login']"));
	        loginButton.click();
	    }

	    private static void navigateToDashboard(AndroidDriver<MobileElement> driver) {
	        // Navigate to the dashboard screen
	        // Example: Click on the dashboard button or navigate through the menu
	        MobileElement dashboardButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Best deals and Offers']"));
	      String txt=  dashboardButton.getText();
	        System.out.println(txt);
	    }
	}


