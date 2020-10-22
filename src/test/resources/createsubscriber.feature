Feature: Create new subscriber in admin portal

  @tag1
  Scenario: create new subscriber
    Given select subscriber and click on the create new subscriber
    When Enter the subscriber details and click next
    And select snaps industry, industry area
    And select snaps category, section and subsection
    And select taxomony and Labels
    Then click on the get packages button
    When verify packages displayed
    And select packages
    And click on the next button
    And verify subscription tab
    And enter subscription details
    Then click next button
    When verify subscriber user screen launched
    And click the add user button
    And enter subscriber details and click on save button
    Then click next button
    When browse file by clicking browse for file
    And select customer paid button
    Then click the finalize button
    
