Feature: 12-Admin girişi "Diyetisyen Ekleme" ekranını görebilir.
  Scenario: navigate login page and click admin login button
    Given open login page
    When click on admin button
    Then check admin panel url "http://localhost:8080/admin"

