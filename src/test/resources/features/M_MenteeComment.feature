Feature: Add Status and Mentee Mentutor
  as a Mentee i want to add status comment

  @TestRun @Mentee @Comment
  Scenario: Add status mentee on forum
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Forum button
    Then Mentee direct to forum page
    When Mentee input status "Saya Suka matematika"
    And Mentee click send button
    Then Mente got the pop up Successful

  @TestRun @Mentee @Comment
  Scenario: Add status mentee with numeric status on forum
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Forum button
    Then Mentee direct to forum page
    When Mentee input status "1236548"
    And Mentee click send button

  @TestRun @Mentee @Comment
  Scenario: Add status mentee with special character status on forum
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Forum button
    Then Mentee direct to forum page
    When Mentee input status "@@$$%%$@#$%"
    And Mentee click send button

  @TestRun @Mentee @Comment
  Scenario: Add status mentee with empty status on forum
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Forum button
    Then Mentee direct to forum page
    When Mentee input status " "
    And Mentee click send button

  @TestRun @Mentee @Comment
  Scenario: Add comment mentee on status another mentee
    Given Mentee already login
    Then Mentee direct to homementee page
    When Mentee click Forum button
    Then Mentee direct to forum page
    When Mentee input comment "Saya juga sulit mengerjakan kasus A"
    And Mentee click send comment button

