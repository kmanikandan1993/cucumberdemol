#Author: manikandan@your.domain.com
@mobile
Feature: Title of your feature

  Background: 
    Given user launches flipkart application
    And user login by entering crendentials
@one
  Scenario: Mobile purchase
    When user search mobile
    And user click on the mobile name
    Then user click on add to cart
@hardcode
  Scenario: Mobile purchase by one dim list
    When user search mobile by one dim list
      | APPLE | realme | SAMSUNG |
    And user click on the mobile name
    Then user click on add to cart

 