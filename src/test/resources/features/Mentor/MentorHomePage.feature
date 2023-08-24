Feature: Mentor can go to any page from Mentor Home Page
  As a Mentor i want check any feature on website Mentutor

  @Mentor @Homepage #WEB-MNTR_001
  Scenario: Mentor can click View All Task from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click View All task button
    Then Mentor direct to Taskpage

  @Mentor @Homepage #WEB-MNTR_002
  Scenario: Mentor can go to Taskpage from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click icon Task Button
    Then Mentor direct to Taskpage

  @Mentor @Homepage #WEB-MNTR_003
  Scenario: Mentor can go to Detail Taskpage from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click see Submitted Task
    Then Mentor direct to Detail Taskpage

  @Mentor @Homepage #WEB-MNTR_004
  Scenario: Mentor can go to Class Forum from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click Forum Button on homementor page
    Then Mentor direct to Class Forum Page

  @Mentor @Homepage #WEB-MNTR_005 #BUG PROFILE USER NOT DISPLAY
  Scenario: Mentor can go to My Profile Page from Homepage when click user profile button
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click User Profile Button on homementor page
    Then Mentor direct to My Profile Page User Mentor

  @Mentor @Homepage #WEB-MNTR_006
  Scenario: Mentor can go to My Profile Page from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click Profile Button on homementor page
    Then Mentor direct to My Profile Page

  @Mentor @Homepage #WEB-MNTR_007
  Scenario: Mentor can Logout from Homepage
    Given Mentor Already Login
    Then Mentor got the pop up message login successful
    And Mentor will direct to homementor page
    When Mentor click Logout Button on homementor page
    Then Mentor got pop up message for logout
    And Mentor got the pop up message logout successful
    And Mentor will direct to Mentutor Login Page


