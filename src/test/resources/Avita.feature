@avita
Feature: Avita Tests

  Scenario: TC001- Sign Up Positive Scenario Test

    Given The User goes to test url
    And The User click on the Kayit Ol button in the header section
    And The User fill in the required information on the registration page
    And The User click on the Kayit Ol button bottom of the page
    Then The User verify that correctly sign up

  Scenario: TC002 - Login Positive Scenario Test
    Given The User goes to test url
    And The User click on the Giriş Yap button in the header section
    And The User fill in the required information on the login page
    And The User click on the Giris Yap button bottom of the page
    Then The User verify that correctly login

    Scenario: TC003 - Online Booking and Payment Process Test
      Given The User goes to test url
      And The User click on the Giriş Yap button in the header section
      And The User fill in the required information on the login page
      And The User click on the Giris Yap button bottom of the page
      And The User click on the Yeni Seans Al button in the Online Seanslar section
      And The User fills in the Profil Bilgileri section on the Yeni Seans Satin Al page
      And The User click on the Devam et button bottom of the page
      And The User fills in the Degerlendirme Sorulari section on the Yeni Seans Satin Al page
      And The User click on the Devam et button bottom of the page
      And The User fills in the Appointment Date and Time section on the Yeni Seans Satin Al page
      And The User click on the Devam et button bottom of the page
      And The User fills in the Payment and Billing information sections on the Yeni Seans Satin Al page
      And The User click on the Satin Almayi Tamamla button bottom of the page

