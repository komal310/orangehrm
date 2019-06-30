@E2E
Feature: Scenarios for Admin
  Scenario:To verify weather i am able to add skill under qualification

    Given I am on login page of "https://opensource-demo.orangehrmlive.com" of OrangeHRM website
    When I enter "Admin"on usernametext
    And I enter the "admin123"on passtext
    And I click on loginBtn
    Given I click on Admin btn
    Given I click on Qualifications DropDown
    Given I click on "Skills" DropDown
    When I click on AddBtn
    Then I enter "C# Skills" in NameField
    And I enter "abc" in DescriptionFied
    And I click on SaveBtn
    And verify weather skills "C# Skills" is getting added



