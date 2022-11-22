Feature: 5- CVV 4 rakamlıdır. Harf girilemez.
  Scenario Outline: CVV has 4 number is not char
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "1234567890123456" info
    And type SKT "1125"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    And type CVV "<CVV>"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
        | CVV | expected |
        |1    | FAILED|
        |12   | FAILED|
        |123  | FAILED|
        |1234 | PASSED|
        |12345| FAILED|
        |123A | FAILED|