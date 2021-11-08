package stepDefn;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageClass.BaseClass;
import pageClass.Page;


public class StepDefnDateWidget {
	Page page ;
	public AppiumDriver driver ;
	String tRemove;
	 String dRemove;
	 int i , j;
	
	
	@When("^I open the app and click on Views and then Date Widget option$")
	public void i_open_the_app_and_click_on_Views_and_then_Date_Widget_option() throws Throwable {
		driver = BaseClass.baseDriver;
		page = new Page(driver);
		 Thread.sleep(1000);
		page.viewsOption.click();
		 Thread.sleep(1000);
		 page.DateWidgets.click();
		 Thread.sleep(1000);
	}

	@When("^I click on dialog option$")
	public void i_click_on_dialog_option() throws Throwable {
		page.Dialog.click();
		 Thread.sleep(1000);
	}

	@Then("^I check the date on the screen$")
	public void i_check_the_date_on_the_screen() throws Throwable {
		String currentDate= page.DateDisplay.getAttribute("text");
		 tRemove = " 01:02";
		 dRemove = "-2021";
		 currentDate = currentDate.replace(tRemove,"");
		 System.out.println("Current date is " +currentDate );
		 Thread.sleep(1000);
		 currentDate = currentDate.replace(dRemove,"");
		 currentDate = currentDate.substring(3);
		 i = Integer.parseInt(currentDate);
		// i=i+1;
		 System.out.println(i); 
	}

	@Then("^I click on Change the Date$")
	public void i_click_on_Change_the_Date() throws Throwable {
		 Thread.sleep(2000);
		page.ChangeTheDate.click();
		 Thread.sleep(500);
	}

	@Then("^I select Future date and click OK$")
	public void i_select_Future_date_and_click_OK() throws Throwable {
		List<MobileElement> listElement=(List<MobileElement>)driver.findElementsByXPath("//*[@class='android.view.View']");
		 breakloop:
		for(MobileElement eachElement:listElement) {
			if(eachElement.getAttribute("checked").contentEquals("true") ) {
				 Thread.sleep(1000);
				System.out.println("Current selected date is " +eachElement.getAttribute("content-desc"));
				i=i+1;
				String value= Integer.toString(i);
				driver.findElementByXPath("//*[@text='" + value + "']").click();
				Thread.sleep(1000);
				break breakloop;
			}
		}  Thread.sleep(1000);
		page.OKbutton.click();
		Thread.sleep(2000);
	}

	@Then("^I validate Future date on the screen$")
	public void i_validate_Future_date_on_the_screen() throws Throwable {
		String newDate=page.DateDisplay.getAttribute("text");
		 newDate = newDate.replace(tRemove,"");
		 System.out.println("New date is " +newDate );
		 Thread.sleep(1000);
		 newDate = newDate.replace(dRemove,"");
		 newDate = newDate.substring(3);
		 j = Integer.parseInt(newDate);
		 if(j == i)
		 {
			 Thread.sleep(1000);
			 System.out.println("Scenario successful");
		 }
		 else
		 {
			 System.out.println("Scenairo failed");
		 }
		 Thread.sleep(1000);
		 driver.closeApp();
	}

}
