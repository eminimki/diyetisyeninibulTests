@SmokeTest
Feature: 2-3 saniye gözüken "Sipariş alınmıştır" ekranından sonra "teslim edildi" ekranı gelir. Kullanıcı burada verilen siparişi puanlar. "İleri" butonuna basıldıktan sonra kullanıcı “Diyetisyen seçme“ ekranına yönlendirilir.
  Background:
    Given open login page
    And type email "emin@eminimki.com"
    And type password with valid password "123456"
    And type password confirm "123456"
    And type credit card "1234567890123456" info
    And type SKT "1125"
    And type CVV "1234"
    And type adress "cok uzun bir adres girilmesi gerek min 20"
    And click on submit button
    And choose a dietician
    And choose a meal
    And confirm meal
    When check order information message "Siparişiniz alındı!" in complete test

    Scenario: after order information get order completed screen and next button navigate to select dietician menu page
      Then check order completed message "Siparişiniz teslim edildi"
      Then click on next button in completed page
      Then check navigate to select dietician menu page with url "http://localhost:8080/login" expected "PASSED"
