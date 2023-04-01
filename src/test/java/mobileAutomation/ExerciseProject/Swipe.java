package mobileAutomation.ExerciseProject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends Utils{

	@Test(priority=1)
	public void SwipeAction()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement firstImage = (WebElement) driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
		
		Assert.assertEquals(firstImage.getAttribute("focusable"), "true");
		
		swipeOnElement(firstImage,"left");
		
		Assert.assertEquals(firstImage.getAttribute("focusable"), "false");



		


		
	
}
}
