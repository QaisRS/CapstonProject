Feature: Home Page

  Scenario: User verify currency values change
    Given User is on Retail website
    When User click on currency
    And User chose Euro from Dropdown
    Then Currency value should change to Euro

  Scenario: User empty Shopping cart message displays
    Given User is on Retail website
    When User click on shopping cart
    Then 'Your shopping cart is empty!' message should display
