#Author: manikandan@your.domain.com
@tv
Feature: Tv Purchase

  Background: 
    Given user launces the flipkart appctn
    And user login by enter valid credentials
@one @dim
  Scenario: Tv purchase
    When user search the Tv
    And user click on the Tv name
    Then user click on add tocart
@hardcode
  Scenario: Tv purchase by using one dim list
    When user searching the Tv by one dim list
      | SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV | Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV | SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV |
    And user click on the Tv name
    Then user click on add tocart
