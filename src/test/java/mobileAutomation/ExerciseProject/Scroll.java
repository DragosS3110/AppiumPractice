package mobileAutomation.ExerciseProject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Scroll extends Utils{

	@Test(priority=1)
	public void ScrollAction()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
				
		//Scroll using UIAutomator (scroll to specific element based on text)
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))"));
		
		WebElement tabsBtn = driver.findElement(AppiumBy.accessibilityId("Tabs"));

		Assert.assertTrue(tabsBtn.isDisplayed());
		
		//scrollToEnd();

		


		
	
}
}
