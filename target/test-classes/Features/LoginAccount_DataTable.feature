Feature: Register functionality using DataTable

  Background: 
    Given user test Register funtionality using data table

  @DataTable
  Scenario: Register an account in  test Environment page using DataTable
    When User clicks on MyAccount
    And user enters below information
      | Name  | City    | State | Email          | Password          |
      | Sayed | Seattle | WA    | sayed@rewa.org | Washington@$12345 |
    Then user clicks registerButton
