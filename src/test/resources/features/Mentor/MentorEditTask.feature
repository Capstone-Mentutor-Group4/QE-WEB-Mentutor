Feature: Mentor can edit Task on Task Page.
  As a Mentor i want edit or delele task on Taskpage

  Background: Mentor already login on Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    And Mentor click icon Task Button
    And Mentor direct to Taskpage

  @Mentor @UpdateTask @Valid #WEB-MNTR_015 #BUG-CAN'T UPDATE WITH IMAGE/FILE DATA
  Scenario Outline: Mentor Update Task with valid data on Taskpage
    When Mentor click tri-dot icon button to show dropdown menu
    Then Mentor cick menu Edit
    And Mentor input update valid data "<title>" as title, "<desc>" as description, "<date>" as due date
    And Mentor click Submit edit task Button
    And Mentor got pop up Task Updated OK
    Examples:
      | title      | desc               | date       |
      | CapstoneOK | Si Paling Capstone | 2023-08-25 |

  @Mentor @UpdateTask @Invalid #WEB-MNTR_016 #BUG-CAN UPDATE TASK WITH INVALID DATA
  Scenario Outline: Mentor Update Task with invalid data on Taskpage
    When Mentor click tri-dot icon button to show dropdown menu
    Then Mentor cick menu Edit
    And Mentor input update valid data "<title>" as title, "<desc>" as description, "<date>" as due date
    And Mentor click Submit edit task Button
    And Mentor got pop up Task Updated OK
    Examples:
      | title      | desc               | date       |
      |            | Si Paling Capstone | 2023-08-25 |
      | CapstoneOK |                    | 2023-08-25 |
      | CapstoneOK | Si Paling Capstone |            |
      |            |                    |            |

  @Mentor @Delete #WEB-MNTR_017 #BUG - CAN'T AUTO REFRESH TASK
  Scenario: Mentor want Delete Task on Taskpage
    When Mentor click tri-dot icon button to show dropdown menu
    Then Mentor click menu Delete
    And Mentor got pop up Yes Delete confirmation
    And Mentor got pop up Task Delete OK

  @Mentor @Delete #WEB-MNTR_018
  Scenario: Mentor cancel Delete Task on Taskpage
    When Mentor click tri-dot icon button to show dropdown menu
    Then Mentor click menu Delete
    And Mentor got pop up Cancel Delete confirmation




