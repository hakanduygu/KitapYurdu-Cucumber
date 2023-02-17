Feature: Login and buying test
  Scenario: Login website, add product to cart, log out, login again and go to cart
    Given click login button
    And type email
    And type password
    And click submit button
    And go menu bar
    And click mostseller books
    And select random product
    And add product to cart
    And go profile bar
    And click logout button
    And click login button again
    And type email again
    And type password again
    And click submit button again
    And go cart bar
    When click cart button
    Then check same product added