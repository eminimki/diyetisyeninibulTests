@RegressionTest
Feature: 4-Diyetisyenler girip menüyü değiştirebilirler. Her diyetisyen kendi ekranının menüsünü değiştirir.
  Scenario Template: dietician can edit  himself meals
    Given open login page
    And click on dietician button
    And type dietician email "<dietician email>"
    And type dietician password "<dietician password>"
    And click dietician login button
    And change breakfast "<Breakfast>"
    And change lunch "<Lunch>"
    And change dinner "<Dinner>"
    When click on edit button
    Then check edit meals confirm message "Bilgiler güncellendi"
    Examples:
      | dietician email | dietician password | Breakfast | Lunch | Dinner |
      | diyetisyen1     | 123456             | Diet1 breakfast| Diet1 lunch| Diet1 dinner|
      | diyetisyen2     | deneme123             | Diet2 kahvalti| Diet1 ogle yemegi| Diet1 aksam|



