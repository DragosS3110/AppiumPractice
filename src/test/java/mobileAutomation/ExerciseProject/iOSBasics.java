package mobileAutomation.ExerciseProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class iOSBasics extends UtilsiOS{

	@Test(priority=1)
	public void AccessPreferences()
	{

		
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		
		WebElement result = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='0'])[1]"));
		WebElement defaultMinus = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='Decrement'])[1]"));
		WebElement defaultPlus = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='Increment'])[1]"));

		Assert.assertEquals(result.getAttribute("name"), "0");
		Assert.assertEquals(defaultMinus.getAttribute("enabled"),"false");

		for(int i=1;i<=10;i++) {
			
		defaultPlus.click();
		if(i==10) {
		Assert.assertEquals(result.getAttribute("name"), "10");
		Assert.assertEquals(defaultPlus.getAttribute("enabled"),"false");

		}
		}

}
}