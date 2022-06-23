Feature: Laoptop & NoteBooks

Background:
    Given User is on retail website
    When User click on Loptop and Notebook tab
   And User click on Show all Loptop and NoteBook option

  Scenario: Add and Remove a Mac book from Cart
    Given User is on retail website
    When User click on Loptop and Notebook tab
    And User click on Show all Loptop and NoteBook option
    And User click on MacBook item
    And User click add to Cart button
    Then User should a message 'Success: You have added MacBook toyour shopping cart!'
    And User should see 1 item(s)-602.00 showed to the cart
    And User click on cart option
    And User click on red X button to remove the item from cart
    Then item should be removed and cart should show 0 item(s)

  Scenario: Product Comparison
    Given User is on retail website
    When User click on Loptop and Notebook tab
    And User click on Show all Loptop and NoteBook option
    And User click on product comparison icon on 'MacBook'
    And User click on product comparison icon on 'MacBook Air'
    Then User should see message 'Success: You have added MacBook Air to your product comparison!'
    And User click on product comparison link
    Then User should see a product Comparison Chart

  Scenario: Adding an item to Wish list
    Given User is on retail website
    When User click on Loptop and Notebook tab
    And User click on Show all Loptop and NoteBook option
    And User click on 'MacBook Pro' item
    Then User should see '$2,000.00' price tag is present on UI
