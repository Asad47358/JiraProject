package APIsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.APIconstants;
import utils.APIpaylaodConstants;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APItestCaseStep {


    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    RequestSpecification request;
    Response response;
    public static String token;
    public static String employee_id;
    public static String employee_lastname;

//////////////////////////-Create-/////////////////////////////////////

    @Given("a JWT bearer token is generated")
    public void a_jwt_bearer_token_is_generated() {
        request = given().
                header(APIconstants.Header_ContentType_Key,APIconstants.Header_ContentType_Value).
                body("{\n" +
                        "  \"email\": \"Spider00@gmail.com\",\n" +
                        "  \"password\": \"S1234\"\n" +
                        "}");
        response = request.when().post(APIconstants.GenerateToken);

        token = "Bearer "+response.jsonPath().getString("token");
        System.out.println(token);
    }
    @Given("a request is prepared to creating the created employee {string},{string},{string},{string},{string},{string},{string}")
    public void a_request_is_prepared_to_creating_the_created_employee(String firstname, String lastname, String middlename, String gender, String birthday, String status, String jobtitle) {

        request=given()
                    .header(APIconstants.Header_ContentType_Key,APIconstants.Header_ContentType_Value)
                    .header(APIconstants.Header_Authorization_Key,token)
                    .body(APIpaylaodConstants.CreatEmpPayload(firstname,lastname,middlename,gender,birthday,status,jobtitle));
    }
    @When("a POST call is made to create the employee")
    public void a_post_call_is_made_to_create_the_employee() {
            response = request.when().post(APIconstants.CreatEmployee);
            response.prettyPrint();
    }
    @Then("the status code for this request is {int}")
    public void the_status_code_for_this_request_is(Integer int1) {
            response.then().assertThat().statusCode(int1);

    }
    @Then("the employee id {string} is stored and values are validated")
    public void the_employee_id_is_stored_and_values_are_validated(String empPath) {
            employee_id = response.jsonPath().getString(empPath);
        System.out.println("The employee ID is --> "+employee_id);
        response.then().assertThat().body("Employee.emp_firstname",equalTo("Spider"));
    }

//////////////////////////-Update-/////////////////////////////////////

    @Given("a request is prepared to update the employee {string},{string},{string},{string},{string},{string},{string}")
    public void a_request_is_prepared_to_update_the_employee(String ID, String firstname, String middlename, String lastname, String birthday, String job_title, String status) {
        request = given().
                header(APIconstants.Header_ContentType_Key,APIconstants.Header_ContentType_Value).
                header(APIconstants.Header_Authorization_Key,token).
                body(APIpaylaodConstants.UpdateEmp
                        (ID,firstname,middlename,lastname,birthday,job_title,job_title,status));

    }
    @When("a PUT call is made to update the employee")
    public void a_put_call_is_made_to_update_the_employee() {
        response =request.when().put(APIconstants.UpdateEmployee);
            response.prettyPrint();
    }
    @Then("the status code for this requested is {int}")
    public void the_status_code_for_this_requested_is(Integer code) {
        response.then().assertThat().statusCode(code);

    }
    @Then("the employee lastname {string} is stored and values are validated")
    public void the_employee_lastname_is_stored_and_values_are_validated(String LastPath) {

        employee_lastname = response.jsonPath().getString(LastPath);
        System.out.println("This is last name updated "+employee_lastname);
        response.then().assertThat().body("Employee.emp_lastname",equalTo("Wolf"));

    }




}
