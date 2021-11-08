package stepDefn;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import pageClass.BaseClass;
import pageClass.Page;
import properties.CommonConstants;

public class StepdefnTabs {
	Page page ;
	CommonConstants cc;
	public AppiumDriver driver ;	

	@When("^I open the app and click on Views$")
	public void i_open_the_app_and_click_on_Views() throws Throwable {
		// Create object for driver and Views Page class
        driver = BaseClass.baseDriver;
		page = new Page(driver);
		page.viewsOption.click();
		 Thread.sleep(1000);
	}

	@When("^I scroll down till Tabs option$")
	public void i_scroll_down_till_Tabs_option() throws Throwable {
		TouchAction touch=new TouchAction(driver);
		 for (int i=1; i<=2; i++) {
		 touch.press(point(505,2261))
			.waitAction(waitOptions(Duration.ofSeconds(5)))
			.moveTo(point(6,200))
			.release()
			.perform();
		 }
	}

	@When("^I click on tabs option and then Content by Factory$")
	public void i_click_on_tabs_option_and_then_Content_by_Factory() throws Throwable {	
		page.Tabs.click();
		 Thread.sleep(1000);
		 page.ContentByFactory.click();
		 Thread.sleep(1000);
	}

	@Then("^I validate three tabs$")
	public void i_validate_three_tabs() throws Throwable {
		Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB1 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB2 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB3 + "']").isDisplayed());
	}

	@Then("^I click on each tab and validate the text present inside each tab$")
	public void i_click_on_each_tab_and_validate_the_text_present_inside_each_tab() throws Throwable {
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB1 + "']").click();
		 Thread.sleep(500);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB1_CONTENT + "']").isDisplayed());
		 
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB2 + "']").click();
		 Thread.sleep(500);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB2_CONTENT + "']").isDisplayed());
		 
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB3 + "']").click();
		 Thread.sleep(500);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_TAB3_CONTENT + "']").isDisplayed());
		 System.out.println("Validation successful");
		 driver.closeApp();
	}
}
