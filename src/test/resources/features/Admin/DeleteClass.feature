Feature: Delete Class Mentutor
  as an admin i want to delete class

  @DeleteClass
  Scenario: Delete Class Mentutor
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option button
    And Admin click delete button
    Then Admin direct to delete class pop Up
    When Admin click Yes button Delete Class
    Then Admin got the pop Success deleted class

  @DeleteClass
  Scenario: Cancel Delete Class Mentutor
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option button
    And Admin click delete button
    Then Admin direct to delete class pop Up
    When Admin click Cancel Button
    Then Admin will direct to homeadmin page