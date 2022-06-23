
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'qrsaleh@gmail.com' and password 'Siamjan12asad'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
@Retail
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID  | Payment Method | payee Name |
      | TEK     | tekschool.us | 123456 | Cheque         | TEK User   |
    And User click on Continue button
    Then User should see a success message 
@notRun
  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstName | lastName | email               | telephone  |
      | Fazel     | Aria     | test.test@gamil.com | 5109801616 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated'
@NOTrun
  Scenario: Edit your account informatio
    When User click on edit your account information link
    And User modify below information
      | firstName | lastName | mail | telephone |
    And User click on continue button
    Then User should see a message 'Success: Your Account Has Been Successfully
