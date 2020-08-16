Feature: As a user I want a login page so that i will
      be able to login
         
     Scenario: Valid users should be able to login 
     Given I am on hr site
     When I  enter username and password 
     And I click on sign in button 
      Then Dashboard page should display 