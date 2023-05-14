
  # Para Bank sitesinde bir hesap açınız
   # Hesabın açıldığını “Your account was created successfully. You are now logged in.”
   #mesajını doğrulayınız.

Feature:  Register Functionality

  Scenario: Registration

    Given navigate to para Bank website
    When clicking register button and providing all information
    Then user should register successfully