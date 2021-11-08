Feature: Testing different features in Apidemos app
  Scenario: Start, stop and reset the time in timer and validate the time
    Given I have a phone with Apidemos app installed on it
    And I open the app and click on Views and then Chronometer option
    When I click on Start button
    And I click on Stop button
    Then Timer should be updated with time and stop
    When I click on Reset button
    Then time should change to zero
    
  Scenario: Theme check box selection and radio button
    Given I have a phone with Apidemos app installed on it
    When I open the app and click on Views and then Holo or Old Theme option
    And I check Checkbox One selected or not and then I check the Checkbox
    And I check Checkbox Two selected or not and then I check the Checkbox
    And I check Radio button One selected or not and then I check the Radiobutton
    And I check Radio button Two selected or not and then I check the Radiobutton One
    Then Radio button one gets deselected
  
  Scenario: Change the date to future date
  Given I have a phone with Apidemos app installed on it
  When I open the app and click on Views and then Date Widget option
  And I click on dialog option
  Then I check the date on the screen
  And I click on Change the Date
  Then I select Future date and click OK
  Then I validate Future date on the screen
  
  Scenario: Validate the Expandable list
  Given I have a phone with Apidemos app installed on it
  When I open the app and click on Views and then Expandable List
  Then I click on Custom Adapter
  Then I validate the lists displayed on the screen
  And I expand each section and validate values present under each
  
  Scenario: Validate the  tabs
  Given I have a phone with Apidemos app installed on it
  When I open the app and click on Views
  And I scroll down till Tabs option
  And I click on tabs option and then Content by Factory
  Then I validate three tabs
  And I click on each tab and validate the text present inside each tab
  
  
  
    