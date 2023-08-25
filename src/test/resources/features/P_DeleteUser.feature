Feature: Delete User Mentutor
  as an admin i want to delete user

  @TestRun @Delete
  Scenario: Delete User by Admin
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option button
    And Admin click delete button
    Then Admin direct to delete user pop Up
    When Admin click Yes Button
    Then Admin got the pop Success deleted user

  @TestRun @Delete
  Scenario: Cancel Delete User by Admin
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click option button
    And Admin click delete button
    Then Admin direct to delete user pop Up
    When Admin click Cancel Button
    Then Admin will direct to homeadmin page
