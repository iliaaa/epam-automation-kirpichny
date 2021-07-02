Feature: Exercise three
  In order to create third cucumber test
  As a user
  I want to open User Table page and activate checkbox and check log window

  Scenario: User Table Page test
    Given I open JDI GitHub site
    And I login as user Roman Iovlev and I see button Logout
    When I click on "Service" button in Header
    And I click on "User Table" button in Service dropdown
    When I select 'vip' checkbox for Sergey Ivan
    Then 1 log row has "Vip:" condition changed to "true" text in log section