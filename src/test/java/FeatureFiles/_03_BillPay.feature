Feature: Bill Pay Functionality

  Background: Before Scenario

    Given navigate to para Bank website
    When entering username and password value to login
    Then user should login successfully


  Scenario Outline: Bill Pay

    And click on Bill Pay button
    And user entering all values in given menu
      | payeeName     | <payeeName>     |
      | address       | <address>       |
      | city          | <city>          |
      | state         | <state>         |
      | zipCode       | <zipCode>       |
      | phone         | <phone>         |
      | account       | <account>       |
      | verifyAccount | <verifyAccount> |
      | amount        | <amount>        |

    Then payment should be successful

    Examples:
      | payeeName | address   | city    | state     | zipCode | phone        | account | verifyAccount | amount |
      | MAqa      | Gnj. str  | Baku    | Sabuncu   | AZ1000  | 994559473200 | 14676   | 14676         | 85     |
      | Yalcin    | Gnj. str2 | Sumgait | Hovsan    | AZ1001  | 994559473266 | 14676   | 14676         | 45     |
      | Orxan     | Gnj. str  | Baku    | Narimanov | AZ1000  | 994559473200 | 14676   | 14676         | 120    |