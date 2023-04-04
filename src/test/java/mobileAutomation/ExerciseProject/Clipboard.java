package mobileAutomation.ExerciseProject;

import io.appium.java_client.android.Activity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Clipboard extends Utils{

	@Test(priority=1)
	public void Activities() throws InterruptedException
	{

		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		//driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		
		driver.startActivity(activity);
		
		WebElement wifiSettings = (WebElement)driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"));
		
		Assert.assertEquals(wifiSettings.getAttribute("enabled"), "false");
		
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		Assert.assertEquals(wifiSettings.getAttribute("enabled"), "true");
		
		wifiSettings.click();
		
		
		//Clipboard
		driver.setClipboardText("Hipsdontlie");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

		//Pressing keys
		
		//driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		
		
	}
}
