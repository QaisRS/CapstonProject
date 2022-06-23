Feature: Desktops Tab

 Scenario: User verify all items are present in Desktops tab
    Given User is on retail website
    When User click on Desktop tab
    And User click on show all desktops
    Then User should see all items are present in desktop page

  Scenario: User add HP LP 3065 from Desktops tab to the cart
    Given User is on retail website
    When User click on Desktop tab
    And User click on show all desktops
    And User click add to cart option on HP LP3065 item
    And User select quantity 1
    And User click add to cart button
    Then User should see a message 'Success: you have added HP LP 3065 to your shopping cart!'

  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    Given User is on retail website
    When User click on Desktop tab
    And User click on show all desktops
    And User click ADD TO CART option on Canon EOS 5D item
    And User select color from dropdown Red
    And User click add to cart button
    Then User should see message 'Success: You have added Canon EOS 5D to your shopping cart!'

  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    Given User is on retail website
    When User click on Desktop tab
    And User click on show all desktops
    And User click on Canon EOS 5D item
    And User click on write a review link
    And User fill the review information with below informatio
      | YourName | YourReview | Rating      |
      | name     | review     | Bad or good |
    And User click on ContinueButton
    Then User should see a message with 'Thank you for your review . It has been submitted to the webmaster for approval.'
