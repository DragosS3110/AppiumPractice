package mobileAutomation.ExerciseProject;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iOSBasics extends UtilsiOS{

	@Test(priority=1)
	public void AccessPreferences()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
}
}