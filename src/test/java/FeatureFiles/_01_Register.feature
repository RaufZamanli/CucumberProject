
  # Para Bank sitesinde bir hesap açınız
   # Hesabın açıldığını “Your account was created successfully. You are now logged in.”
   #mesajını doğrulayınız.

Feature:  Register Functionality

  Scenario: Registration

    Given navigate to para Bank website
    When click on register button and provide all information
    Then user should be register successfully