package mobileAutomation.ExerciseProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class UtilsiOS {

	public IOSDriver driver;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//service.start();
		
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhone 13");
		options.setApp("//Users//dragossomlea//Library//Developer//Xcode//DerivedData//UIKitCatalog-dxjqjxfvviimzngkuwmktyguzpjl//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
		options.setPlatformVersion("15.2");
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
	}

	public void tearDown() {
		driver.quit();
	}
	@SuppressWarnings("deprecation")
	public void defaultTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
