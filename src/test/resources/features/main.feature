Feature: Main

  Background:
    Given user opens the login page
    When he enters the credentials
    Then able to login

  @Wip
  Scenario: Searching computer
    Given Go to searchbar
    When Write "bilgisayar"
    And User should see product list page
    And Select any product
    And User click Add to Basket





