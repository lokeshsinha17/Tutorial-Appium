import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDropDemo extends base_for_DifferentApp {

	public static void main(String[] args) throws MalformedURLException {
		

		
		
		
			// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver=capabilities();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     
		     driver.findElementByXPath("//android.widget.TextView[@index='1']").click();;
		     
		     //Locate 3rd element(Chick Corea) from list to drag.
		     
		     
		     
		     
		     
		     WebElement ele1 = driver.findElementByXPath("//android.widget.TextView[@text='Joshua Redman']/preceding::*");
		     
		     
		     
		     ///preceding-sibling::ImageView
		     
		     //Locate 6th element to drop dragged element.
		     WebElement ele2 = driver.findElementByXPath("//android.widget.TextView[@text='Kurt Rosenwinkel']/preceding-sibling::ImageView");
		    
		     //Perform drag and drop operation using TouchAction class.
		     //Created object of TouchAction class.
		     
		     TouchAction action = new TouchAction((MobileDriver)driver);

		     	action.longPress(longPressOptions().withElement(element(ele1))).moveTo(element(ele2)).release().perform();
		     	
		    
				
				// or can write   
				//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
				     
		     /*System.out.println("It Is dragging element.");
		     //It will hold tap on 3rd element and move to 6th position and then release tap.
		    //
		       
		     System.out.println("Element has been droped at destination successfully.");*/
		    }
		    
		    
		   
     
		
		
		
		/*
		 
		  
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		AndroidElement elementViews = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		elementViews.click();
		
		AndroidElement elementDranAndDrop= driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		elementDranAndDrop.click();
		
		TouchAction t = new TouchAction(driver);
		
		//long press (on source)-> Move(to destination) -> Realease 
		
		//AndroidElement source= driver.findElementByAndroidUIAutomator("index(\"1\")");
		AndroidElement source= driver.findElementsByClassName("android.view.View").get(0);
		
		AndroidElement destination  = driver.findElementsByClassName("android.view.View").get(1);
		
		 AndroidElement destination= driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		AndroidElement source= driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		
		
		
		
		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		
		// or can write   
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		
		
		
		*/
		
		
		
		
		
	}


