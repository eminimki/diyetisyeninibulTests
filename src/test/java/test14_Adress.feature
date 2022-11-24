@RegressionTest
Feature: 14-Adres bölümü en az 20 karakter içermelidir.
  Scenario Outline: address has least 20 characters.
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "1234567890123456" info
    And type SKT "1122"
    And type CVV "1234"
    And type adress "<Adress>"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | Adress | expected |
      | adres 19 uzunlugnda| FAILED|
      | adres 20 uzunlugunda| PASSED|
      | bu adres 23 uzunlugunda| PASSED|


