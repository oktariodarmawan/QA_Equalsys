Feature: Login functionality

  Scenario: Positive test - User login with valid email and password
    Given User navigates to the login page
    And User enters the valid email
    And User enters the valid password
    When User click the Login button
    Then User gets the alert message

  Scenario: Negative test - User login with valid email and empty password
    Given User navigates to the login page
    And User enters the valid email
    And User enters empty password
    When User cannot click the Login button
    Then User gets the Required password message

  Scenario: Negative test - User login with empty email and empty password
    Given User navigates to the login page
    And User enters the empty email
    And User enters empty password
    When User cannot click the Login button
    Then User gets the required email message and required password message

  Scenario: Negative Test - User login with invalid email format and valid password
    Given User navigates to the login page
    And User enters the invalid email format
    And User enters valid password
    When User cannot click the Login button
    Then User gets the Required invalid email message