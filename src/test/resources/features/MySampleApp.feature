Feature: Web_Personal_Information_Form

Scenario: Validating each fields by passing data
Given user launch sample app page
Then enter first name "Arjun" and last name "A"
Then enter date of birth "12121990"
Then click education level and select "Other"
Then click submit