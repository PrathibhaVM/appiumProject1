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

public class StepdefnCheckboxRadio {
	
	Page page ;
	public AppiumDriver driver ;
	
	@When("^I open the app and click on Views and then Holo or Old Theme option$")
	public void i_open_the_app_and_click_on_Views_and_then_Holo_or_Old_Theme_option() throws Throwable {
		driver = BaseClass.baseDriver;
		page = new Page(driver);
		page.viewsOption.click();
		 Thread.sleep(1000);
		 page.Controls.click();
		 Thread.sleep(1000);
		 page.HoloOldTheme.click();	
		 Thread.sleep(1000);
	}
	@When("^I check Checkbox One selected or not and then I check the Checkbox$")
	public void i_check_Checkbox_One_selected_or_not_and_then_I_check_the_Checkbox() throws Throwable {
		boolean a = page.Checkbox1.isSelected();
		System.out.println(" Is Checkbox 1 is enabled : " +a);
		if (a==false) {
			page.CheckboxID1.click();
			System.out.println(" checkbox1 is now selected");
		}
	}

	@When("^I check Checkbox Two selected or not and then I check the Checkbox$")
	public void i_check_Checkbox_Two_selected_or_not_and_then_I_check_the_Checkbox() throws Throwable {
		boolean b = page.Checkbox2.isSelected();
		System.out.println(" Is Checkbox 2 is enabled : " +b);
		if (b==false) {
			page.CheckboxID2.click();
			System.out.println(" checkbox2 is now selected");
		}
	}

	@When("^I check Radio button One selected or not and then I check the Radiobutton$")
	public void i_check_Radio_button_One_selected_or_not_and_then_I_check_the_Radiobutton() throws Throwable {
		boolean c = page.Radiobutton1.isSelected();
		System.out.println(" Is Radiobutton 1 is enabled : " +c);
		if (c==false) {
			page.Radiobutton1ID.click();
			System.out.println(" Radiobutton 1  is now selected");
		}
	}

	@When("^I check Radio button Two selected or not and then I check the Radiobutton One$")
	public void i_check_Radio_button_Two_selected_or_not_and_then_I_check_the_Radiobutton_One() throws Throwable {
		boolean d = page.Radiobutton2.isSelected();
		System.out.println(" Is Radiobutton 2 is enabled : " +d);
		if (d==false) {
			page.Radiobutton2ID.click();
			System.out.println(" Radiobutton 1 will be unselected now");
			System.out.println(" Radiobutton 2 is selected");
		}
		System.out.println("Vaidation successful");
		}
	

	@Then("^Radio button one gets deselected$")
	public void radio_button_one_gets_deselected() throws Throwable {
		boolean c = page.Radiobutton1.isSelected();
		System.out.println(" Is Radiobutton 1 is enabled : " +c);
		if (c==false) {
			System.out.println(" Radiobutton 1  is unchecked");
			System.out.println("Scenario successful");
		}
		driver.closeApp();
	}

}