package mobileAutomation.ExerciseProject;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class OtherTests extends Utils{

	@Test(priority=4)
	public void AccessPreferences()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Media")).click();


		
	}
}
