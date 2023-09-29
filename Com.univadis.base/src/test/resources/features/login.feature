Feature: As a user of application I want to validate login functionality

  Scenario: Validate login fuctionality with valid credentials
    Given User has launched url
    And User has logged in with following crediantials
      | valid Username             | valid Password |
      | testautomation102@demo.com | automation124  |
    And user has clicked on login button
    Then user should land on Dashboard

  Scenario: Validate login fuctionality with valid credentials
    Given User has launched url
   And User has logged in with following crediantials
      | Invalid Username         | Invalid Password |
      | testautomation@demo1.com | automation124    |
    And user has clicked on login button
    Then user should verify "Accounts" on dashboard
