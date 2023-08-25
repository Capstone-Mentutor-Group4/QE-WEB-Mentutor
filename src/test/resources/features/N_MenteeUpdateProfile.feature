Feature: Update Profile Mentee
  as a Mentee i want to update profile

  @TestRun @Mentee @UpdateMentee
  Scenario: Update profile with valid data
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Profile button
    Then Mentee direct to profile page
    When Mentee click update button
    And Mentee input valid data "Fahrul Rozi", "fahrul123@gmail.com", "Fahrul123$"
    And Mentee click submit button profile
    Then Mentee got the pop up Success Update Profile

#    Bug
  @TestRun @Mentee @UpdateMentee
  Scenario: Update profile with empty name parameter
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Profile button
    Then Mentee direct to profile page
    When Mentee click update button
    And Mentee input valid data "", "fahrul123@gmail.com", "Fahrul123$"
    And Mentee click submit button profile
    Then Mentee got the pop up

#    Bug
  @TestRun @Mentee @UpdateMentee
  Scenario: Update profile with empty email parameter
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Profile button
    Then Mentee direct to profile page
    When Mentee click update button
    And Mentee input valid data "Fahrul Rozi", "", "Fahrul123$"
    And Mentee click submit button profile
    Then Mentee got the pop up

    #Bug
  @TestRun @Mentee @UpdateMentee
  Scenario: Update profile with empty data
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Profile button
    Then Mentee direct to profile page
    When Mentee click update button
    And Mentee input valid data "", "", ""
    And Mentee click submit button profile
    Then Mentee got the pop up