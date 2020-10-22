
@tag
Feature: create new subscriber for admin portal
  

  @tag1
  Scenario: create new subscriber
    Given select subscriber and click on the create new subscriber
    When  Enter the subscriber details and click next
    And select snaps industry, industry area
    And select snaps category, section and subsection
    And select taxomony and Labels
    Then click on the get packages button
    
   # Scenario: Select packages and subscription
    When verify packages displayed
    When select packages
    And click on the next button
    When verify subscription tab
    And enter subscription details
    Then click next button

  	#Scenario: select subscriber user details
  	When verify subscriber user screen launched 
  	When click the add user button
  	And enter subscriber details and click on save button
  	Then click next button
  	
  	#Scenario: verify finalize tab
  	When browse file by clicking browse for file
  	And select customer paid button
  	Then click the finalize button
