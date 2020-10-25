Feature: Create new subscriber in admin portal

  @tag1
  Scenario: create new subscriber
    Given select subscriber and click on the create new subscriber
    When Enter the subscriber details and click next
    And select snaps and click on get packages button
   
    When select packages and click next
    And verify subscription tab and enter subscription details then click next button
     
    When verify subscriber user screen launched and click the add user button
    And enter subscriber details and click on save button then next
    When verify Finalize tab and browse file by clicking browse for file
    Then select customer paid button and click the finalize button
     
    
