Feature: Assign Task Mentutor by Mentee
  as a user i want to assign task

  @TestRun @Assign
  Scenario: Assign Task with valid data
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Task button
    And Mentee click submit your task button
    Then Mentee direct to pop up Submit Your Task
    When Mentee submit task "tugas1.pdf"
    And Mentee click submit button
    Then Mentee got the pop Up task

  @TestRun @Assign
  Scenario: Assign Task with invalid extension data
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Task button
    And Mentee click submit your task button
    Then Mentee direct to pop up Submit Your Task
    When Mentee submit task "tugas7.mp4"
    And Mentee click submit button
    Then Mentee got the pop Up task

  @TestRun @Assign
  Scenario: Assign Task with empty data
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Task button
    And Mentee click submit your task button
    Then Mentee direct to pop up Submit Your Task
    When Mentee submit task ""
    And Mentee click submit button
    Then Mentee got the pop Up task