Feature: Mentor can submit Score Task on Detail Task Page.
  As a Mentor i want submit score on submitted task by Mentee

  Background: Mentor already login on Homepage
    Given Mentor Already Login
    When Mentor got the pop up message login successful
    Then Mentor will direct to homementor page
    And Mentor click see Submitted Task
    And Mentor direct to Detail Taskpage

  @Mentor @SubmitScore @Valid #WEB-MNTR_019
  Scenario Outline: Mentor input Score Submitted Task with valid score data
    When Mentor click pencil icon button
    Then Mentor will input score "<score>" on submitted task
    And Mentor click submit score task
    And Mentor got pop up Success Submit Score Task OK
    Examples:
      | score |
      | 95    |

  @Mentor @SubmitScore @Invalid #WEB-MNTR_020
  Scenario Outline: Mentor input Score Submitted Task with invalid score data
    When Mentor click pencil icon button
    Then Mentor will input score "<score>" on submitted task
    And Mentor click submit score task
    And Mentor got pop up Invalid Submit Score
    Examples:
      | score   |
      | 0       |
      | 1000    |
      | Seratus |


