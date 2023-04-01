package mobileAutomation.ExerciseProject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragDrop extends Utils{

	@Test(priority=1)
	public void DragAndDrop()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement firstDot = (WebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		WebElement secondDot = (WebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));

		dragAndDrop(firstDot,840,750);
		
		String result = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getAttribute("text");
		
		Assert.assertEquals(result, "Dropped!");



		


		
	
}
}
