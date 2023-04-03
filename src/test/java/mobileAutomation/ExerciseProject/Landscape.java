package mobileAutomation.ExerciseProject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.DeviceRotation;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Landscape extends Utils{

	@Test(priority=1)
	public void AccessPreferences() throws InterruptedException
	{

		
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
		
		
		WebElement bouncingCtn = (WebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/container"));

		bouncingCtn.click();
		
        toLandscape();
		
		Thread.sleep(2000);
		
		driver.navigate().back();

		driver.findElement(AppiumBy.accessibilityId("Cloning")).click();

        toPortrait();

		
	}
}
