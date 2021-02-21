Feature:  Password verification (ubiquitous term) functionality
  Background: We need Password verifications functionality for the purposes of password verification.  If any one of the rules doesn't match, fail the validation.

  Scenario:
    Given A valid password
    When The user provides it
    Then The verification should return "OK"
      And We store the password

  Scenario:
    Given An invalid password
    When The user provides it
    Then The verification should return "FAIL"



