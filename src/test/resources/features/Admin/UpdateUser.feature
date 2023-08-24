Feature: Update User Mentutor
  as and admin i want to update user

  @UpdateUser
  Scenario: Update User with valid data
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option update button
    And Admin click edit update button
    Then Admin direct to edit profile user pop up
    When Admin input valid data user "Tigor" as name, "tigor123@gmail.com" as email, "Tigor123$" as password, and "Bahasa Arab" as class
    And Admin click submit update button
    Then Admin got the pop up Success Update

  @UpdateUser
  Scenario: Update User with invalid data
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option update button
    And Admin click edit update button
    Then Admin direct to edit profile user pop up
    When Admin input valid data user "123456789" as name, "tigor.com" as email, "tigurtigur" as password, and "Bahasa Arab" as class
    And Admin click submit update button
    Then Admin got the pop up Failed Update

#  Bug, dapat update tanpa mengisi nama
  @UpdateUser
  Scenario: Update User with empty name
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option update button
    And Admin click edit update button
    Then Admin direct to edit profile user pop up
    When Admin input valid data user "" as name, "tigor123@gmail.com" as email, "Tigor123$" as password, and "Bahasa Arab" as class
    And Admin click submit update button
    Then Admin got the pop up Failed Update

#    Bug dapat mengupdate saat email kosong
  @UpdateUser
  Scenario: Update User with empty email
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option update button
    And Admin click edit update button
    Then Admin direct to edit profile user pop up
    When Admin input valid data user "Tigor Rolando" as name, "" as email, "Tigor123$" as password, and "Bahasa Arab" as class
    And Admin click submit update button
    Then Admin got the pop up Failed Update