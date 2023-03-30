package mobileAutomation.ExerciseProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Utils {
	
	public AndroidDriver driver;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("MainPhone");
		options.setApp("//Users//dragossomlea//eclipse-workspace//ExerciseProject//src//test//java//resources//ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

	public void tearDown() {
		driver.quit();
	}
	@SuppressWarnings("deprecation")
	public void defaultTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
