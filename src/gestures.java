import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;






public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		
 	 // driver.findElementByAndroidUIAutomator("attribute(\"value\")");
	

		AndroidElement elementView = driver.findElementByAndroidUIAutomator("text(\"Views\")"); 
		
		
			
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		//Click is more of press and hold 
		//for Tap TouchActions is used.  
		
		TouchAction t  = new TouchAction(driver);
		
		// Touch actions should complete with perform
		
		t.tap(tapOptions().withElement(element(elementView))).perform();
		
		
		AndroidElement elementExpandableLists = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")"); 
		t.tap(tapOptions().withElement(element(elementExpandableLists))).perform();

		AndroidElement elementCustomAdapter = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
		t.tap(tapOptions().withElement(element(elementCustomAdapter))).perform();
		
		AndroidElement elementPeopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		
		// Long press and release 
		t.longPress((longPressOptions().withElement(element(elementPeopleNames)).withDuration(ofSeconds(2)))).release().perform();
		
		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
	}

}
