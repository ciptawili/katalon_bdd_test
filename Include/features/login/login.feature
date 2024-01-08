@tag
Feature: login feature
  User can login in healthcare website

  @positive
  Scenario: User login with valid data
    Given Open the website
    And Open the login menu
    When User login with valid username and password
    Then User success login and redirect to page appointment page
    
  @negative
  Scenario Outline: User login with invalid data
    Given Open the website
    And Open the login menu
    When User login with username <username> and password <password>
    Then User failed login And Show message error
    
    Examples:
    |	username	| password	|
    | test123		| ThisIsNotAPassword					|
    | John Doe	| 12345			|
    |						|						|
    | test123		| b					|
    | a					| 					|
    | 					| b					|
    
  @positive
  Scenario: User can logout from the application
    Given Open the website
    And User login and success
    When User logout from application
    Then User success logout from the application and redirect to homepage application
