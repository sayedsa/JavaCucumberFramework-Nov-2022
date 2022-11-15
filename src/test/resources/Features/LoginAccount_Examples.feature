Feature: feature to test login functionality 

  @Smoke
  Scenario Outline: Check login is successfull with following data
    When user is in test homepage 
    And user click on my account
    And user enter '<username>' and '<password>'
    And click on login button
    Then user is navigated to the home page

    Examples: 
      | username       | password         |
      | sayed@rewa.org | House@$123456789 |
