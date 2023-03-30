package mobileAutomation.ExerciseProject;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AssertionTest extends Utils{

	@Test(priority=5)
	public void OnOffTrigger() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
		
		WebElement toggleBtn = (WebElement) driver.findElement(AppiumBy.accessibilityId("Toggle"));
		
		Assert.assertEquals(toggleBtn.getText(), "OFF");
		toggleBtn.click();
		Assert.assertEquals( toggleBtn.getText(), "ON");
	}
}
