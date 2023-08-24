Feature:Login Mentutor
  As a user i want to login Website Mentutor

  @Login @Positive-Case #LOGIN-ADMIN #WEB-LG_001
  Scenario Outline: Login Admin with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homeadmin page
    Examples:
      | email                     | password  |
      | admin1.mentutor@gmail.com | Admin123$ |

  @Login @Positive-Case #LOGIN-MENTOR #WEB-LG_002
  Scenario Outline: Login Mentor with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homementor page
    Examples:
      | email                | password    |
      | khairul123@gmail.com | Khairul123$ |

  @Login @Positive-Case #LOGIN-MENTEE #WEB-LG_003
  Scenario Outline: Login Mentee with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homementee page
    Examples:
      | email                 | password    |
      | mayanda123$@gmail.com | Mayanda123$ |

  @Login @Negative-Case #LOGIN-UNREGISTER #WEB-LG_004
  Scenario Outline: Login User invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                  | password      |
      | bukanuser123@gmail.com | BukanUser123$ |

  @Login @Mentor @Negative-Case #LOGIN-NO PASSWORD #WEB-LG_007
  Scenario Outline: Login Mentor incomplete data no password
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User see error need password on login page
    Examples:
      | email                | password |
      | khairul123@gmail.com |          |

  @Login @Mentor @Negative-Case #LOGIN-NO EMAIL #WEB-LG_008
  Scenario Outline: Login Mentor incomplete data no email
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User see error need email on login page
    Examples:
      | email | password    |
      |       | Khairul123$ |
