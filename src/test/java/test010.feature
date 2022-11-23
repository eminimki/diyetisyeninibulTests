@RegressionTest
Feature: 10-Şifre en az 6 karakterden oluşmalıdır.
  Scenario Outline: password has min 6 characters
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "<Password>"
    And type password confirm "<Password>"
    And type credit card "1234567890123456" info
    And type SKT "1125"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | Password | expected |
      | ABC    |  FAILED|
      | 1234A    |  FAILED|
      | 123456    |  PASSED|
      | 123A45678B90C |  PASSED|