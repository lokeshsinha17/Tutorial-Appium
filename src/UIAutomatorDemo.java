import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorDemo extends base
{


	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// driver.findElementByAndroidUIAutomator("attribute(\"value\")");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
		
		// To validate a property like clickable or not or checkable or not can be checked as below
		
		// driver.findElementByAndroidUIAutomator("new UiSelector.property(value)");
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		
		
		//driver.closeApp();
		

	}

}
