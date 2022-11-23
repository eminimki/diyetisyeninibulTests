@RegressionTest
Feature: 13- Admin diyetisyen ekleyebilir/düzenleyebilir/ silebilir
  Background: login admin page
    Given open login page
    And click on admin button
    Scenario: Admin can add dietician
      And click on new dietician button
      And type dietician name "Add Test Name"
      And type dietician last name "Add Test Last Name"
      And type dietician bio "Add Test Bio Text"
      And type dietician rating "3"
      When click on dietician add button
      Then check add dietician confirm message "Bilgiler Kaydedildi"

    Scenario: Admin can edit dieticians
      And click on dietician edit button in admin page
      And change dietician name "Edit Test Name"
      And change dietician last name "Edit Test Last Name"
      And change dietician bio "Edit Test Bio Text"
      And change dietician rating "4"
      When click on dietician edit button in edit page
      Then check edit dietician confirm message "Bilgiler güncellendi"

    Scenario: Admin can delete dietician
      When click on dietician delete button
      Then check dietician delete confirm message "Diyetisyen silindi"




