package stepDefn;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageClass.BaseClass;
import pageClass.Page;
import properties.CommonConstants;

public class StepdefnName {

	Page page ;
	CommonConstants cc;
	public AppiumDriver driver ;
	
	@When("^I open the app and click on Views and then Expandable List$")
	public void i_open_the_app_and_click_on_Views_and_then_Expandable_List() throws Throwable {
		driver = BaseClass.baseDriver;
		page = new Page(driver);
		 Thread.sleep(1000);
		page.viewsOption.click();
		 Thread.sleep(1000);
		 page.ExpandableList.click();
		 Thread.sleep(1000);
	}

	@Then("^I click on Custom Adapter$")
	public void i_click_on_Custom_Adapter() throws Throwable {
		Thread.sleep(2000);
		page.CustomAdapter.click();
		 Thread.sleep(1000);
	}

	@Then("^I validate the lists displayed on the screen$")
	public void i_validate_the_lists_displayed_on_the_screen() throws Throwable {
		
		Assert.assertTrue(driver.findElementByXPath("//*[@text= '" +cc.TEXT_PEOPLE_NAMES+ "']").isDisplayed());
		Assert.assertTrue(driver.findElementByXPath("//*[@text='" +cc.TEXT_DOG_NAMES + "']").isDisplayed());
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" +cc.TEXT_CAT_NAMES + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" +cc.TEXT_FISH_NAMES + "']" ).isDisplayed());
		 Thread.sleep(1000);
	}

	@Then("^I expand each section and validate values present under each$")
	public void i_expand_each_section_and_validate_values_present_under_each() throws Throwable {
		driver.findElementByXPath("//*[@text='" + cc.TEXT_PEOPLE_NAMES + "']").click();
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_PEOPLE_NAME1 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_PEOPLE_NAME2 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_PEOPLE_NAME3 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_PEOPLE_NAME4 + "']").isDisplayed());
		 
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_DOG_NAMES + "']").click();
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_DOG_NAME1 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_DOG_NAME2 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_DOG_NAME3 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_DOG_NAME4 + "']").isDisplayed());
		 
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_CAT_NAMES + "']").click();
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_CAT_NAME1 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_CAT_NAME2 + "']").isDisplayed());
		 
		 driver.findElementByXPath("//*[@text='" + cc.TEXT_FISH_NAMES + "']").click();
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_FISH_NAME1 + "']").isDisplayed());
		 Assert.assertTrue(driver.findElementByXPath("//*[@text='" + cc.TEXT_FISH_NAME2 + "']").isDisplayed());
		 System.out.println("Validation successful");
		 driver.closeApp();
	}
}
