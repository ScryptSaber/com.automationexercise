@smoke @generalView
Feature: As a automationexercise.com user I should be able to view category products

  Background: Common step for scenario: home page landing
    Given the user is on the login page
    Then I should see Home Page

  @viewCategoryProducts
  Scenario: TestCase 18: View Category Products
    Then I should verify that categories are visible on left side bar
    When I scroll down
    And I click on 'Women' category
    When I click on any category link under 'Women' category, for example: Dress
    And I dismiss pop_ups
    Then I should verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    When I click on any sub-category link of 'Men' category,  on left side bar
    Then I should verify that user is navigated to that category page


  @viewCartBrandProducts
  Scenario: Test Case 19: View & Cart Brand Products
    When I click on 'Products' button
    And I dismiss pop_ups
    And I scroll down
    Then I should verify that Brands are visible on left side bar
    When I click on any brand name
    And I dismiss pop_ups
    Then I should verify that user is navigated to brand page and brand products are displayed
    When I click on any other brand link,on left side bar
    Then I should verify that user is navigated to that brand page and can see products
