Feature: Register Class Mentutor
  as an admin i want to regist a class

  @TestRun @Admin @Class
  Scenario: Register class with valid name
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    When Admin input class name "Bahasa Kucing"
    And Admin click add class button
    Then Admin got the pop up message Success Created

  @TestRun @Admin @Class @NegatifTest
  Scenario: Register class with Registered name
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    When Admin input class name "Matematika"
    And Admin click add class button
    Then Admin got the pop up error message

  @TestRun @Admin @Class @NegativeTest
  Scenario: Register class with empty name
    Given Admin already login
    Then User got the pop up message login successful
    And Admin will direct to homeadmin page
    When Admin click Input Class button
    Then Admin direct to inputclass page
    When Admin input class name ""
    And Admin click add class button
    Then Admin got the error message
