@RegressionTest
Feature: 7-Kart Numarası 16 rakamdan oluşur. Fazla rakam girilemez.
  Scenario Outline: Credit Card number has 16 int. is not less than or higher
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "<Credit Card Number>" info
    And type SKT "1125"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | Credit Card Number | expected |
      | 123456789012345 | FAILED|
      | 1234567890123456 | PASSED|
      | 12345678901234567 | FAILED|

