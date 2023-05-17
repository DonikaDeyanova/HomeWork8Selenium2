Feature: Shop Pragmatic BackEnd
  As a admin,
  I want to login on the page and click to the "Customers" menu and to the "Design" menu, to see if they are expanded.
  I want to check if the sub menus in the "Design" menu are gonna be open correctly.

  @regression
  Scenario: Login to the page
    Given User is on the login page of the admin area
    When User enters valid username and password
    And Clicks on the login button
    Then User is successfully logged in to the admin page

  @regression
  Scenario: Check the "Customers" menu
    Given User is successfully logged in to the admin page
    When User clicks on the "Customers" menu
    Then The options in the "Customers" menu are expanded

  @regression
  Scenario: Check the "Design" menu
    Given User is successfully logged in to the admin page
    When User clicks on the "Design" menu
    Then The options in the "Design" menu are expanded

  @regression
  Scenario: Check the menus in the "Design" menu
    Given User is successfully logged in to the admin page
    When User clicks on the "Design" menu
    When Clicks on all options in the "Design" menu
    Then All sub menus in the "Design" menu are successfully loaded
