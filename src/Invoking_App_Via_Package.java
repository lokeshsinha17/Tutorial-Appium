import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Invoking_App_Via_Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// invoke app without apk file path
		
		File f = new File("src");// go to src folder 
		// there is some app in my mobile say paytm and i dont want to provide apk file path
		
		
		//File fs = new File(f,"ApiDemos-debug.apk"); //search for apk file
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		
		/*cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android5.1");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
				
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap); // connectkikon to appium server string and desired capability
		*/
		
		
	}

}
