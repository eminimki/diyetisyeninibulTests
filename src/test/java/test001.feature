Feature: 1-Sipariş alındı bilgisi müşteri kayıt veya giriş yaptıktan sonra ekrana 3 saniyeliğine gelir.
  Scenario: After registration, the customer chooses a meal and receives the order receipt.
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
    When confirm meal
    Then check order information message "Siparişiniz alındı!"
    

