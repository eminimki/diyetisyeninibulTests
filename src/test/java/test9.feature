Feature:9-Şifre ve şifre tekrar kısmında şifreler eşleşmelidir. Eşleşmiyorsa "şifreler aynı değil" uyarısı verir.
  Scenario Outline: succesfully login with valid confirm and fail login with invalid confirm
    Given open login page
    And type email "emin@eminimki.com"
    And type credit card "123456789012345" info
    And type SKT "1125"
    And type CVV "333"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    And type password with valid password "123456"
    And type password confirm "<Confirm>"
    When click on submit button
    Then check login status with url "http://localhost:8080/select" and expected "<expected>"
    Examples:
      | Confirm | expected |
      | 123456  |TEST PASSED|
      | 1234567  |TEST FAILED|



