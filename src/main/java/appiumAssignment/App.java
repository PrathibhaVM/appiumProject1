package appiumAssignment;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class App {
	
	public static void main (String[] args ) throws InterruptedException, MalformedURLException {
		 String sFile = "C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\ApiDemos-debug (1).apk";
		
		//1.create sample project, 2.capability name version, 3.which device will be working on,4.to work on native browser we can keep as null
		//5.capability version6.setting device name7.platform.8.app package and activity9.Mapping with appium server
		
		//include Desired capabilities
		DesiredCapabilities capabilityName = new DesiredCapabilities();
		//specify on which we can execute 
		capabilityName.setCapability("Device", "Android");
		//mention the browser name
		capabilityName.setCapability(CapabilityType.BROWSER_NAME, "");//empty-doesn't open any browser
		//set OS version
		capabilityName.setCapability(CapabilityType.VERSION, "11.0");
		//set device name
		capabilityName.setCapability("deviceName", "Pixel_XL_API_30");
		//device Platform name
		capabilityName.setCapability("platformName", "Android");
		//package and activity capabilities to add
		capabilityName.setCapability("app-package", "io.appium.android.apis"); //package
		capabilityName.setCapability("app-activity", ".ApiDemos"); //activity
		//app capability
		capabilityName.setCapability("app", sFile);
		AppiumDriver driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilityName);
		Thread.sleep(3000);
				
	}

}
