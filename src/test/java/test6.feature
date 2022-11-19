Feature: 6-E-mail en fazla 30 karakterden oluşmalıdır.
  Scenario Outline: email has max 30 char
    Given open login page
    And type email "<e-mail>"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "1234567890123456" info
    And type SKT "1125"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | e-mail | expected |
      |emin@eminimki.com|TEST PASSED|
      |bumail30uznlugnda@eminimki.com|TEST PASSED|
      |buemail33uzunlugunda@eminimki.com|TEST FAILED|