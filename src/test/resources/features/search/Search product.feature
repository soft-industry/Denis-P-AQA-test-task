Feature: Search for the product

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/test/{product} for getting the products.
### Available products: "apple", "mango", "tofu", "water"
### Prepare Positive and negative scenarios

  Scenario: Search for the product
    When he searches item "tofu" in the shop
    Then he sees the results displayed for "tofu"

  Scenario: Search for the product with invalid data
    When he searches item "123456789" in the shop
    Then he does not see the results without crashes


  Scenario: Search for the product with SQL injection
    When he searches item "tofu'); DROP TABLE Products; --" in the shop
    Then he does not see the results without crashes