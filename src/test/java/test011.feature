@RegressionTest
Feature: 11-SKT geçmiş bir tarih gösteremez.
  Scenario Outline: SKT cannot show a past date.
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "1234567890123456" info
    And type SKT "<SKT>"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | SKT | expected |
      |1111 | FAILED|
      |1122 | PASSED|
      |1222 | PASSED|
