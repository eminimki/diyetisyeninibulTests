@SmokeTest
Feature: 3-Diyetisyenlerin yıldız sayısı onları değerlendiren müşterilerin verdikleri yıldız sayısının ortalamasıdır.
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

      Scenario Outline: 2 customer rate a dietician
        And choose a dietician
        And choose a meal
        And confirm meal
        And check order information message "Siparişiniz alındı!" in complete test
        And check order completed message "Siparişiniz teslim edildi"
        And type rating "<rate>" for dietician
        And click rate save button
        Examples:
          | rate |
          |   1  |
          |   5  |

      Scenario: check dietician awarage rating
        Then check dietician awarage rating "3"

