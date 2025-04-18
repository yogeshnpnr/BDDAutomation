Feature: Flipkart shopping flow

  Scenario: Login and add Samsung mobile to cart
    Given user launches the Flipkart app
    When user logs in with phone number and OTP
    And user searches for "Samsung mobile"
    And user adds first product to cart
    Then product should be added to cart successfully
