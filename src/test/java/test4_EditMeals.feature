@RegressionTest
Feature: 4-Diyetisyenler girip menüyü değiştirebilirler. Her diyetisyen kendi ekranının menüsünü değiştirir.
  Scenario Template: dietician can edit  himself meals
    Given open login page
    And click on dietician button
    And type dietician email "<dietician email>"
    And type dietician password "<dietician password>"
    And click dietician login button
    And change breakfast "<Breakfast>"
    And upload breakfast photo "<Breakfast Photo>"
    And change lunch "<Lunch>"
    And upload lunch photo "<Lunch Photo>"
    And change dinner "<Dinner>"
    And upload dinner photo "<Dinner Photo>"
    When click on edit button
    Then check edit meals confirm message "Bilgiler güncellendi"
    Examples:
      | dietician email | dietician password | Breakfast |Breakfast Photo | Lunch |Lunch Photo| Dinner |Dinner Photo|
      |diyetisyen1|123456|Diet1 breakfast|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\breakfast-photos\\1\\breakfast_1.png|Diet1 lunch|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\lunch-photos\\1\\lunch_1.png|Diet1 dinner|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\dinner-photos\\1\\dinner_1.png|
      |diyetisyen2|deneme123|Diet2 kahvalti|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\breakfast-photos\\2\\breakfast_2.png|Diet1 ogle yemegi|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\lunch-photos\\2\\lunch_2.png|Diet1 aksam|C:\\Users\\GENC\\Desktop\\diyetisyen\\surum6\\diyetisyeninibul\\dinner-photos\\2\\dinner_2.png|



