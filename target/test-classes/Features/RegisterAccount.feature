Feature: Register functionality

  Background: 
    Given User is on TEST Environment page

  @Register
  Scenario: Register an account in  test Environment page
    When User clicks on MyAccount
    And User enters his name '<Sayed>'
    And User enters cityname  '<Seattle WA>'
    And User enters address '< Washington>'
    And User enters email address '<sayed@rewa.org>'
    And User enters password '<Washington@$12345>'
    Then User click registerButton
















