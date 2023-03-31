package mobileAutomation.ExerciseProject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class OtherTests extends Utils{

	@Test(priority=1)
	public void AccessPreferences()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
		
		
		WebElement bouncingCtn = (WebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/container"));

		bouncingCtn.click();
		
		for(int i=100;i<=1000;i=i+100) {
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement)bouncingCtn).getId(),"x",i,"y",i));}


		
	}
}
