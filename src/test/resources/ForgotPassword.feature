Feature: Forgot password functionality

  Scenario: Positive test - User use Forgot password with valid email
    Given User navigates to the forgot password page
    And User input valid email
    And User check the recaptha
    When User click submit button
    Then User get email is not registered message

  Scenario: Negative test - User use Forgot password with invalid email
    Given User navigates to the forgot password page
    And User input invalid email
    And User check the recaptha without email
    When User cannot click submit button
    Then User gets invalid email format message

  Scenario: Negative test - User use Forgot password with empty email
    Given User navigates to the forgot password page
    And User input empty email
    And User check the recaptha without email
    When User cannot click submit button
    Then User gets email is required message

  Scenario: Negative test - User use Forgot password with empty email and does not check the recaptha
    Given User navigates to the forgot password page
    And User input empty email
    And User does not check the recaptha
    When User cannot click submit button
    Then User gets email is required message

