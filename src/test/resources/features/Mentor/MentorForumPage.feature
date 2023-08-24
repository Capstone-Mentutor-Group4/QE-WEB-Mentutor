Feature: Mentor can reply comment by Mentee on Forum Page.
  As a Mentor i want reply comment by Mentee on Forum Page.

  Background: Mentor already login on Homepage
    Given Mentor Already Login
    When Mentor got the pop up message login successful
    Then Mentor will direct to homementor page
    And Mentor click Forum Button on homementor page
    And Mentor direct to Class Forum Page

  @Mentor @SubmitComment @ValidComment #WEB-MNTR_021
  Scenario Outline: Mentor can reply comment by Mentee with valid comment
    When Mentor input comment "<comment>" on Forum Page
    Then Mentor click send comment
    Examples:
      | comment                |
      | Ada yang bisa dibantu? |

  @Mentor @SubmitComment @InvalidComment #WEB-MNTR_022
  Scenario Outline: Mentor can reply comment by Mentee with any type data (numeric, special char.)
    When Mentor input comment "<comment>" on Forum Page
    Then Mentor click send comment
    Examples:
      | comment                         |
      | !@#$%^&*()_+~ !@#$%^&*()_+~     |
      | 1234567890 1234567890 123456789 |

