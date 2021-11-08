package pageClass;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page {

	
	public Page( AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		//Add Elements-Assignment1
		@FindBy(xpath="//*[@text='Views']")
		public MobileElement viewsOption;
		
		@FindBy(xpath="//*[@text='Chronometer']")
		public MobileElement ChronometerOption;
		
		
		//Add Elements-Assignment2
		@FindBy(xpath="//*[@text='6. Holo or Old Theme']")
		public MobileElement HoloOldTheme;
		
		@FindBy(xpath="//*[@text='Controls']")
		public MobileElement Controls;
		
		@FindBy(xpath="//*[@text='Checkbox 1']")
		public MobileElement Checkbox1;
		
		@FindBy(xpath="//*[@text='Checkbox 2']")
		public MobileElement Checkbox2;
		
		@FindBy(xpath="//*[@text='RadioButton 1']")
		public MobileElement Radiobutton1;
		
		@FindBy(xpath="//*[@text='RadioButton 2']")
		public MobileElement Radiobutton2;
		
		@FindBy(id="io.appium.android.apis:id/check1")
		public MobileElement CheckboxID1;
		
		@FindBy(id="io.appium.android.apis:id/check2")
		public MobileElement CheckboxID2;
		
		@FindBy(id ="io.appium.android.apis:id/radio1")
		public MobileElement Radiobutton1ID;
		
		@FindBy(id ="io.appium.android.apis:id/radio2")
		public MobileElement Radiobutton2ID;
		
	 //Add Elements-Assignment3
		
		@FindBy(xpath ="//*[@text='Date Widgets']")
		public MobileElement DateWidgets;
		
		@FindBy(xpath ="//*[@text='1. Dialog']")
		public MobileElement Dialog;
		
		@FindBy(id ="io.appium.android.apis:id/dateDisplay")
		public MobileElement DateDisplay;
		
		@FindBy(xpath ="//*[@text='CHANGE THE DATE']")
		public MobileElement ChangeTheDate;
		
		@FindBy(xpath ="//*[@text='OK']")
		public MobileElement OKbutton;
		
		//Add Elements-Assignment4
		
		@FindBy(xpath ="//*[@text='Expandable Lists']")
		public MobileElement ExpandableList;
		
		@FindBy(xpath ="//*[@text='1. Custom Adapter']")
		public MobileElement CustomAdapter;
		
		//Add Elements-Assignment5
		
		@FindBy(xpath ="//*[@text='Tabs']")
		public MobileElement Tabs;
		
		@FindBy(xpath ="//*[@text='2. Content By Factory']")
		public MobileElement ContentByFactory;
}

