@appointment
Feature: Appointment Feature
  User can create and book appointment

  @negative
  Scenario: User create appointment before login
    Given Open the website
		When User open appointment page before login
		Then User can’t create appointment and User redirect to login page
		
	@negative
  Scenario: User make appointment with empty date
    Given Open the website
		And User login and success
		When User create appointment with empty date
		Then User can’t create appointment and Show message date is required
		
	@positive
  Scenario: User create valid appointment
    Given Open the website
		And User login and success
		When User choose facility healthcare
		And User choose healthy program
		And User choose date appointment
		And User fill the comment
		And User create the appointment
		Then User success create appointment and User redirect to appointment confirmation page
		

