import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling_Demo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AndroidElement elementView = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		elementView.click();
		
		// Scrolling to Webview  
		// Scrollable is only available if element's property is scrollable (find using UI automator)
		
/*		
 * We can also use code below
 * 
 * String uiSelector = "new UiSelector().textMatches(\"" + text
                + "\")";

		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

		driver.findElementByAndroidUIAutomator(command);
		
		*/
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
		AndroidElement elementWebView  = driver.findElementByAndroidUIAutomator("text(\"WebView\")");
		elementWebView.click();
      	
		
		
		
		
		
		
		
	}

}
