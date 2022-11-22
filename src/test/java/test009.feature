Feature:9-Şifre ve şifre tekrar kısmında şifreler eşleşmelidir. Eşleşmiyorsa giriş başarısız olur.
  Scenario Outline: succesfully login with valid confirm and fail login with invalid confirm
    Given open login page
    And type email "emin@eminimki.com"
    And type credit card "1234567890123456" info
    And type SKT "1125"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    And type password with valid password "123456"
    And type password confirm "<Confirm>"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | Confirm | expected |
      | 123456  | PASSED|
      | 1234567 | FAILED|



