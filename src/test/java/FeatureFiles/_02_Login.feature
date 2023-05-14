
  Feature: Login Functionality

    Scenario: Login with valid  credentials

      Given navigate to para Bank website
      When enter username and password value to login
      Then user should login successfully

    Scenario: Login with invalid  password
      Given navigate to para Bank website
      When enter username and invalid password value to login
      Then user should not login successfully

    Scenario: Login with invalid  username
      Given navigate to para Bank website
      When enter invalid username and password value to login
      Then user should not login successfully