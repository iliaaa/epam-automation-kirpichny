Feature: Exercise one
  In order to create firts cucumber test
  As a user
  I want to open Index page and check some info on Different Elelments page

  Scenario: Check info on Index page
    Given I open JDI GitHub site
    Then 'Home Page' page should be opened
    And I login as user Roman Iovlev and I see button Logout
    When I click on "Service" button in Header
    Then I click on "Different Elements" button in Service dropdown
    And I select checkbox 'water' and check log row
    And I select checkbox 'wind' and check log row
    And I select radio 'selen' and check log row
    And I select in dropdown 'yellow' and check log row