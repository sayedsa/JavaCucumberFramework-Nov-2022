Feature: feature to test login functionality
	@simple
  Scenario: Login functionality check
    Given user is on test Environment page
    When user clicks on myAccount
    And user enters userName '<username>' and passWord '<password>'
    And user clicks on login button
    Then user is navigated to the home page
