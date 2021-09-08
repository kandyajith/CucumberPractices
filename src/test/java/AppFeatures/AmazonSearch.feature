Feature: Amazon Search

  Scenario: Search a Product MacBook
    Given I have a search field on Amazon page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with "Apple  MacBook Pro" should be displayed

  Scenario: Search a Product Iphone
    Given I have a search field on Amazon page
    When I search for a product with name "Iphone" and price 1200
    Then Product with "Iphone" should be displayed
