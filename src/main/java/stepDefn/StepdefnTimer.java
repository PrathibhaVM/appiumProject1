package stepDefn;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageClass.BaseClass;
import pageClass.Page;

public class StepdefnTimer {
	
	Page page ;
	public AppiumDriver driver ;
	 String sRemove;
	 int i, j, k;
	 	
	 @Given("^I open the app and click on Views and then Chronometer option$")
		public void i_open_the_app_and_click_on_Views_and_then_Chronometer_option() throws Throwable {
		 driver = BaseClass.baseDriver;
			page = new Page(driver);
		 page.viewsOption.click();
			 Thread.sleep(1000);		 	
		page.ChronometerOption.click();
			 Thread.sleep(1000);
		}
		
	@When("^I click on Start button$")
	public void i_click_on_Start_button() throws Throwable {
	//START
		 String Timer0= driver.findElementByClassName("android.widget.Chronometer").getText();
		// System.out.println(Timer0);
		 sRemove = "Initial format: 00:";
		 Timer0 = Timer0.replace(sRemove,"");
		  i = Integer.parseInt(Timer0); //Initial time
		 System.out.println("Intial time is " +i+ "seconds");
		 driver.findElementByXPath("//*[@text='START']").click();	
		 Thread.sleep(5000);
	}

	@When("^I click on Stop button$")
	public void i_click_on_Stop_button() throws Throwable {
		driver.findElementByXPath("//*[@text='STOP']").click();
	}

	@Then("^Timer should be updated with time and stop$")
	public void timer_should_be_updated_with_time_and_stop() throws Throwable {
		 String Timer1= driver.findElementByClassName("android.widget.Chronometer").getText();
			// System.out.println(Timer1);
			 Timer1 = Timer1.replace(sRemove,"");
			 j = Integer.parseInt(Timer1); //After some time
			 System.out.println("Elapsed time is " +j+ " seconds");
			 if (i<j)
			 { 
				 System.out.println("Timer was on for " +j + " seconds");
			 }
			 else
			 { System.out.println("Timer did not start");}
			
			 Thread.sleep(3000);
	}

	@When("^I click on Reset button$")
	public void i_click_on_Reset_button() throws Throwable {
		 driver.findElementByXPath("//*[@text='RESET']").click();	
		 Thread.sleep(1000);
	}

	@Then("^time should change to zero$")
	public void time_should_change_to_zero() throws Throwable {
		String Timer2= driver.findElementByClassName("android.widget.Chronometer").getText();
		// System.out.println(Timer2);
		 Timer2 = Timer2.replace(sRemove,"");
		 k = Integer.parseInt(Timer2); // time after resetting
		 System.out.println("After resetting timer value is " +k+ " seconds");
		 if ( i==k)
		 {System.out.println("Scenario is scuccessfull");
		 driver.closeApp();}
		 else
		 { System.out.println("Scenario Failed");
		 driver.closeApp();}
	}

}
