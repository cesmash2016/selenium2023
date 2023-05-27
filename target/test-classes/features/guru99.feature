Feature: Verify the payment checkout

  Scenario: User should able to add item and checkout successfully

    Given I navigate to "https://demo.guru99.com/payment-gateway/purchasetoy.php"
    When I add quantity
    Then I click on buy now
    Then I add payment information
    Then I click on pay
    Then I should see the text "Payment successfull!"
    And I quit the browser

