Feature: Update Class Mentutor
  as an admin i want to update class

  @UpdateClass
  Scenario: Update Class with valid name and status
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    And Admin click option button
    And Admin click edit button
    Then Admin direct to edit class pop up
    When Admin input data name "Bahasa Inggris" and status "active"
    And Admin click submit button
    Then Admin got the pop up Success Updated

  @UpdateClass
  Scenario: Update Class with valid name and change status
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    And Admin click option button
    And Admin click edit button
    Then Admin direct to edit class pop up
    When Admin input data name "Bahasa Inggris" and status "non_active"
    And Admin click submit button
    Then Admin got the pop up Success Updated

  @UpdateClass
  Scenario: Update Class with invalid name and valid status
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    And Admin click option button
    And Admin click edit button
    Then Admin direct to edit class pop up
    When Admin input data name "123456789" and status "active"
    And Admin click submit button
    Then Admin got the pop up Failed Updated

  @UpdateClass
  Scenario: Update Class with invalid name and status
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    And Admin click option button
    And Admin click edit button
    Then Admin direct to edit class pop up
    When Admin input data name "123456789" and status "tidak aktif"
    And Admin click submit button
    Then Admin got the pop up Failed Updated

#  BUG, dapat mengupdate nama kelas jadi string kosong dengan respon success created
  @UpdateClass
  Scenario: Update Class with empty name and status
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    And Admin click option button
    And Admin click edit button
    Then Admin direct to edit class pop up
    When Admin input data name "" and status "active"
    And Admin click submit button
    Then Admin got the pop up Failed Updated



