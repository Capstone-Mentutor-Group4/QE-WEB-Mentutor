Feature:Login Mentutor
  as a user i want to login Mentutor

  @login
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

    @login
  Scenario Outline: Login Admin with invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                    | password |
      | JajangNurjaman@gmail.com | Jajang123$    |

  @login
  Scenario Outline: Login Mentor with valid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message login successful
    And User will direct to homementor page
    When User click logout button
    Then User will logout from Mentutor
    And User direct to Login Page
    Examples:
      | email               | password   |
      | jansen123@gmail.com | Jansen123$|

  @login
  Scenario Outline: Login Mentor invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                    | password   |
      | JajangNurjaman@gmail.com | Jajang123$ |

    @login
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
      | email               | password   |
      | fahrul123@gmail.com | Fahrul123$ |

  @login
  Scenario Outline: Login Mentee invalid data
    Given User already on Login Page Mentutor
    When User input email "<email>" and password "<password>"
    And User click button login
    Then User got the pop up message invalid email or password
    Examples:
      | email                    | password   |
      | JajangNurjaman@gmail.com | Jajang123$ |