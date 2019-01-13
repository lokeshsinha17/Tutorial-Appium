import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellenius_Methods extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
     AndroidDriver<AndroidElement> driver = capabilities();
		
		// identify the element based on xpath, class, id
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println(driver.currentActivity());
		
		System.out.println(driver.getContext());  // this will show you the views/type of app as below
		
		/*
		// Type of apps : 
		 1. Native Apps : Fully functional apps
		 2. Hybrid Apps : Half app half web 
		 3. Webviews Apps : 
		
		*/
		
			System.out.println(driver.getOrientation()); // Landscape or portrait
			
			System.out.println(driver.isDeviceLocked());  // check if device is locked ?
		
			driver.hideKeyboard();
			
			// How to go back/press button
			
			
			driver.findElementByAndroidUIAutomator("text(\"Views\")");
			
			
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_PREVIOUS);
			
				
			
			driver.findElementByAndroidUIAutomator("text(\"Views\")");
		
			driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
	}

}
