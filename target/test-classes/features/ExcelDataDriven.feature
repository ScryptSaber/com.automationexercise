@excelDataDriven
Feature: Login Test Feature with Excel Data Driven

  Scenario Outline:: TestCase 16 Place Order: Register Before Checkout

    Given the user is on the login page
    Then I should see Home Page
    When I click 'Signup/Login' button
    When I fill "<email>""<password>" and click Login button
    Then I should verify ' Logged in as username' at top

    Examples:
      | email         | password
      | frank @22     | 1234     |
      | frwfwank @22f | 1234     |
      | franwfek @22  | 1234e    |
      | 10erd@dll     | qwerty   |


