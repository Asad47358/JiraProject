Feature: API Test Case

  Background:
    Given a JWT bearer token is generated

  @api
  Scenario: Create employee
    Given a request is prepared to creating the created employee "Spider","Man","SM","M","2024-11-10","Single","Actor"
    When a POST call is made to create the employee
    Then the status code for this request is 201
    Then the employee id "Employee.employee_id" is stored and values are validated
  @apii
  Scenario: Update Employee
    Given a request is prepared to update the employee "ID","X-Man","Wolf","X","1991-11-10","single","Actor"
    When a PUT call is made to update the employee
    Then the status code for this requested is 200
    Then the employee lastname "Employee.emp_lastname" is stored and values are validated
