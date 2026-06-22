Feature: Para Bank Login Functionality

  Background:
    Given The user navigates to the Para Bank home page

  # Case 1: Geçerli kullanıcı bilgileriyle giriş, doğrulama ve çıkış yapılması
  Scenario: Successful Login and Logout (Case 1)
    When The user fills out the registration form with valid details
    And The user clicks on the REGISTER button
    Then User should see logout.
    When User clicks Logout

  # Case 2: Geçersiz kullanıcı bilgileriyle kayıt/giriş denemeleri
  Scenario Outline: Invalid Login Tests with Various Combinations (Case 2)
    # 1. Adım: Her döngüde Examples'tan gelen kullanıcı adı ve şifreyi kayıt formuna yazar
    When The user fills out the registration form with username "<username>" and password "<password>"
    # 2. Adım: Kayıt Ol butonuna basar
    And The user clicks on the REGISTER button
    # 3. Adım: Hata mesajını doğrular
    Then User should see "<result>"

    Examples:
      | username      | password   | result                             | comment                              |
      |               | 123456test | Username is required.              | Kom1: Username yok.                  |
      |               |            | Username and password is required. | Kom2: Hem Username Hem Password yok. |
      | fakerUsername |            | Password is required.              | Kom3: Password yok.                  |

    #burda login olunamadığı için,registerda username ve password yerine boşluk bırakılarak ,register olunması engellendi.