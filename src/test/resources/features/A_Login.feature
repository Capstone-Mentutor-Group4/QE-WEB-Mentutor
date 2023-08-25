Feature:Login Mentutor
  As a user i want to login Website Mentutor

  @TestRun @Login @Positive-Case #LOGIN-ADMIN #WEB-LG_001
  Scenario Outline: Login Admin with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homeadmin page
    When User click logout button
    Then User will logout from Mentutor
    And User direct to Login Page
    Examples:
      | email                     | password  |
      | admin1.mentutor@gmail.com | Admin123$ |

  @TestRun @Login @Negative-Case #LOGIN-ADMIN #WEB-LG_002
  Scenario Outline: Login Admin with invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                    | password   |
      | JajangNurjaman@gmail.com | Jajang123$ |

  @TestRun @Login @Positive-Case #LOGIN-MENTOR #WEB-LG_003
  Scenario Outline: Login Mentor with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homementor page
    Examples:
      | email                | password    |
      | khairul123@gmail.com | Khairul123$ |

  @TestRun @Login @Negative-Case #LOGIN-UNREGISTER #WEB-LG_004
  Scenario Outline: Login Mentor invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                  | password      |
      | bukanuser123@gmail.com | BukanUser123$ |

  @TestRun @Login @Positive-Case #LOGIN-MENTEE #WEB-LG_005
  Scenario Outline: Login Mentee with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homementee page
    When User click logout button
    Then User will logout from Mentutor
    And User direct to Login Page
    Examples:
      | email              | password  |
      | wahid1st@gmail.com | Wahid123$ |

  @TestRun @Login @Negative-Case #LOGIN-UNREGISTER #WEB-LG_006
  Scenario Outline: Login Mentee invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                    | password   |
      | JajangNurjaman@gmail.com | Jajang123$ |

  @TestRun @Login @Mentor @Negative-Case #LOGIN-NO PASSWORD #WEB-LG_007
  Scenario Outline: Login Mentor incomplete data no password
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User see error need password on login page
    Examples:
      | email                | password |
      | khairul123@gmail.com |          |

  @TestRun @Login @Mentor @Negative-Case #LOGIN-NO EMAIL #WEB-LG_008
  Scenario Outline: Login Mentor incomplete data no email
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User see error need email on login page
    Examples:
      | email | password    |
      |       | Khairul123$ |