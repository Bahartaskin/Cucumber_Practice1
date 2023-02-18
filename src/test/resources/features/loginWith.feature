Feature: Login with email and password

  User Story:
  As a user, I should be able to login with correct credentials.

  Background: for the scenarios in the feature file, user is expected to be on home page first.
    Given user is on the home page


    Scenario: Login user with correct email and password
      When user click on Signup Login button
      And user see that Login to your account text visible
      And user enters correct email address and password
      When user click login button
      And user see that Logged in as username is visible
      When user click logout button
      Then user see that Login to your account text visible



