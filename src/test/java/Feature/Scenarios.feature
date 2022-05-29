@tag
Feature: To Test The Login Functionality of XYZ Application

  @tag1
  Scenario: Test SuperUser Login
    Given User Is On Login Home Page
    When User Enters User "Superuser" and Password "1234"
    Then Homepage Is Populated
    And Devices Gets Displayed
    
  @tag2
  Scenario: Test StakableUser Login
    Given User Is On Login Home Page
    When User Enters User "Stackable" and Password "12345"
    Then Homepage Is Populated
    And Devices Gets Displayed
    
      @tag3
  Scenario Outline: Test StakableUser Login
    Given User Is On Login Home Page
    When User Enters Users <username> and Passwords <password>
    Then Homepage Is Populated
    And Devices Gets Displayed
    
    Examples:
| username | password |
| aaaaaa   | AAAAAA   |
| bbbbbb   | BBBBBB   |