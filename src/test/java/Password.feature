Feature:  Password verification (ubiquitous term) functionality
  Background: We need Password verifications functionality for the purposes of password verification.  If any one of the rules doesn't match, fail the validation.

  Scenario:
    Given a valid password
    When the user provides it
    Then the verification should return "OK"
      And we store the password

  Scenario:
    Given an invalid password
    When the user provides it
    Then the verification should return "FAIL"

  Scenario:
    Given a password
      And the password is more than 8 characters
      And the password has at least 1 number
      And the password is not null
      And the password contains a lowercase letter
      And the password contains a uppercase letter
    When the user provides it
    Then it is a "valid" password