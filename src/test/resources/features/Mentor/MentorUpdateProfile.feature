Feature: Mentors can change their data on the Mentor Profile page.
  As a mentor i want update my profile data

  Background: Mentor already login on Homepage
    Given Mentor Already Login
    When Mentor got the pop up message login successful
    Then Mentor will direct to homementor page
    And Mentor click Profile Button on homementor page
    And Mentor direct to My Profile Page

  @Mentor @Update-Profile @Valid-Data #WEB-MNTR_23 #BUG-CAN CREATE USER WITH VALID DATA WITHOUT IMAGES
  Scenario Outline: Mentor Update Profile with valid data on Mentor Profile page
    When Mentor click icon pencil for edit on Mentor Profile Page
    Then Mentor input update profile with valid data "<name>", "<email>", "<password>"
    And Mentor click Submit edit profile button
    And Mentor got pop up Success Update Profile OK
    Examples:
      | name           | email                | password    |
      | Khairul Lanang | khairul123@gmail.com | Khairul123$ |

  @Mentor @Update-Profile @Invalid-Data #WEB-MNTR_24 #BUG-CAN CREATE USER WITH INCOMPLETE DATA WITHOUT IMAGES
  Scenario Outline: Mentor Update Profile with invalid data on Mentor Profile page
    When Mentor click icon pencil for edit on Mentor Profile Page
    Then Mentor input update profile with valid data "<name>", "<email>", "<password>"
    And Mentor click Submit edit profile button
    And Mentor got pop up Success Update Profile OK
    Examples:
      | name           | email                | password    |
      |                | khairul123@gmail.com | Khairul123$ |
      | Khairul Lanang |                      | Khairul123$ |
      | Khairul Lanang | khairul123@gmail.com |             |