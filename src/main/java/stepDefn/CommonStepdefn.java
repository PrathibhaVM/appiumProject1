package stepDefn;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageClass.BaseClass;
import pageClass.Page;
import properties.CommonConstants;

public class CommonStepdefn {
	
	Page page ;
	CommonConstants cc;
	public AppiumDriver driver ;
	StepdefnTabs stepdefnTabs;
	StepDefnDateWidget stepDefnDateWidget;
	StepdefnName stepdefnName;
	StepdefnTimer stepdefnTimer;
	StepdefnCheckboxRadio stepdefnCheckboxRadio;
	
	
	@Given("^I have a phone with Apidemos app installed on it$")
	public void i_have_a_phone_with_Apidemos_app_installed_on_it() throws Throwable {
		String sFile = "C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\ApiDemos-debug (1).apk";
		DesiredCapabilities capabilityName = new DesiredCapabilities();
		capabilityName.setCapability("Device", "Android");
		capabilityName.setCapability(CapabilityType.BROWSER_NAME, "");//empty-doesn't open any browser
		capabilityName.setCapability(CapabilityType.VERSION, "11.0");
		capabilityName.setCapability("deviceName", "Pixel_XL_API_30");
		capabilityName.setCapability("platformName", "Android");
		capabilityName.setCapability("app-package", "io.appium.android.apis"); //package
		capabilityName.setCapability("app-activity", ".ApiDemos"); //activity
		capabilityName.setCapability("app", sFile);
		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilityName);
		Thread.sleep(3000);
		BaseClass.baseDriver = driver;
		page = new Page(driver);
		cc = new CommonConstants();
		stepdefnTabs = new StepdefnTabs();
		stepDefnDateWidget = new StepDefnDateWidget();
		stepdefnName = new StepdefnName();
		stepdefnTimer = new StepdefnTimer();
		stepdefnCheckboxRadio = new StepdefnCheckboxRadio();
	}

}
