Feature: Mentor can check any function on Mentor Task Page.
  As a Mentor i want create task on Taskpage

  Background: Mentor already login on Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page

  @Mentor @Taskpage @Positive-Case #WEB-MNTR_008
  Scenario Outline: Mentor create New Task with valid data on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor got pop up Task Created OK
    Examples:
      | title    | desc             | date       | file     | images    |
      | Capstone | Overwork Project | 2023-08-22 | tes1.pdf | test1.PNG |

  @Mentor @Taskpage @InvalidData @Negative-Case #WEB-MNTR_009
  Scenario Outline: Mentor create New Task with empty title on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor see error Text Title Required on Taskpage
    Examples:
      | title | desc             | date       | file     | images    |
      |       | Overwork Project | 2023-08-22 | tes1.pdf | test1.PNG |

  @Mentor @Taskpage @InvalidData @Negative-Case #WEB-MNTR_010
  Scenario Outline: Mentor create New Task with empty description on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor see error Text Description Required on Taskpage
    Examples:
      | title    | desc | date       | file     | images    |
      | Capstone |      | 2023-08-22 | tes1.pdf | test1.PNG |

  @Mentor @Taskpage @InvalidData @Negative-Case #WEB-MNTR_011
  Scenario Outline: Mentor create New Task with empty due_date on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor see error Text Due_date Required on Taskpage
    Examples:
      | title    | desc             | date | file     | images    |
      | Capstone | Overwork Project |      | tes1.pdf | test1.PNG |

  @Mentor @Taskpage @Negative-Case #WEB-MNTR_012 #BUG-DIFFERENT ERROR MESSAGE - POPUP INVALID INPUT CLIENT
  Scenario Outline: Mentor create New Task with empty file on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor see error Text File Required on Taskpage
    Examples:
      | title    | desc             | date       | file | images    |
      | Capstone | Overwork Project | 2023-08-22 |      | test1.PNG |

  @Mentor @Taskpage @Negative-Case #WEB-MNTR_013 #BUG-DIFFERENT ERROR MESSAGE - POPUP INVALID INPUT CLIENT
  Scenario Outline: Mentor create New Task with empty images on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor see error Text Images Required on Taskpage
    Examples:
      | title    | desc             | date       | file     | images |
      | Capstone | Overwork Project | 2023-08-22 | tes1.pdf |        |

  @Mentor @Taskpage @Negative-Case #WEB-MNTR_014
  Scenario Outline: Mentor create New Task with invalid format on Taskpage
    When Mentor click View All task button
    Then Mentor direct to Taskpage
    And Mentor input data "<title>" as title, "<desc>" as description, "<date>" as due date, "<file>" as attachment, and "<images>" as images
    And Mentor click Add button for create new task
    And Mentor got pop up Invalid Input Client on Taskpage
    Examples:
      | title    | desc             | date       | file      | images    |
      | Capstone | Overwork Project | 2023-08-22 | tes1.pdf  | tes1.pdf  |
      | Capstone | Overwork Project | 2023-08-22 | test1.PNG | test1.PNG |













