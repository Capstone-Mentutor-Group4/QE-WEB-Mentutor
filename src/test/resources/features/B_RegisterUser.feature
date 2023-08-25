Feature: Register User
  as an admin i want to register new user

#  BUG  dropdown need more time to load
  @TestRun @Admin @RegisterUser
  Scenario: Register Mentor with valid data
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Member button
    Then Admin direct to inputmember page
    When Admin input data new user "Bahari Tampan" as name, "bahari123@gmail.com" as email, "mentee" as role, "Matematika" as class, "Bahari123$" as password
    And Admin click add button

#BUG bisa menambahkan user dengan email yang sudah terdaftar
  @TestRun @Admin @RegisterUser
  Scenario: Register Mentor with Registered Email
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Member button
    Then Admin direct to inputmember page
    When Admin input data new user "Bahari Tampan" as name, "jansen123@gmail.com" as email, "mentee" as role, "Matematika" as class, "Bahari123$" as password
    And Admin click add button

  @TestRun @Admin @RegisterUser
  Scenario: Register Mentor with Empty data
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Member button
    Then Admin direct to inputmember page
    When Admin input data new user "" as name, "" as email, "" as role, "" as class, "" as password
    And Admin click add button

#  Bug dapat menambahkan user walaupun invalid email
  @TestRun @Admin @RegisterUser
  Scenario: Register Mentor with Invalid Email
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Member button
    Then Admin direct to inputmember page
    When Admin input data new user "Bahari Tampan" as name, "xoxoxo123.com" as email, "mentee" as role, "Matematika" as class, "Bahari123$" as password
    And Admin click add button
