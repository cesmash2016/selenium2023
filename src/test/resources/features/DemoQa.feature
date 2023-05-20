Feature: verify demoqa checkboxes
  Scenario: User should be able to expand all checkboxes 
    and check public and private 
    Given I navigate to "https://demoqa.com/checkbox"
    When I expand all the checkboxes
    And I check public and private
    Then I should see a text called"You have selected :publicprivate"

