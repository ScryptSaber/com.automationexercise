
@smoke
  Feature: As a automationexercise.com user I should be able to remove products from cart
    @removeFromCart
    Scenario: TestCase 17: Remove Products From Cart
      Given the user is on the login page
      Then I should see Home Page
      When I scroll down
      When I hover over product
      When I click 'Add to cart' button in Home Page
      When I click ' View Cart' button in Home Page
      Then I should verify hat cart page is displayed
      When I click 'X' button corresponding to particular product
      Then I should verify that product is removed from the cart