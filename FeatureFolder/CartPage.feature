Feature: Testing Flipkart Features

  @EndToEnd
  Scenario: Testing Cart page features
    Given User Launches the browser and navigate to Flipkart website
    And User made search for product
    When User select the required product from result page
    And User entered the required specification and added the product to cart
    And User verify the product from card and placed the order
    And User enter the creditials and address fields
    And User removed the product from cart
    Then User verify the outcome and closed the browser
