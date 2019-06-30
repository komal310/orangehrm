@E2E
Feature: To verify login page is working or not

Scenario Outline:  login with valid username & password
Given I am on login page of "https://opensource-demo.orangehrmlive.com" of OrangeHRM website
When I enter "<username>"on usernametext
And I enter the "<password>"on passtext
And I click on loginBtn

Examples:
  | username | password |
  | Admin    | admin123 |

  Scenario Outline:  login with invalid username & password
    Given I am on login page of "https://opensource-demo.orangehrmlive.com" of OrangeHRM website
    When I enter "<username>"on usernametext
    And I enter the "<password>"on passtext
    And I click on loginBtn
    And I verify that error message is displayed "Invalid credentials" after login

    Examples:
      | username | password |
      | Admi    | admin12 |

