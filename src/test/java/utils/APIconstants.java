package utils;

import io.restassured.RestAssured;

public class APIconstants {

    public static final String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";

    public static final String CreatEmployee = baseURI+"/createEmployee.php";
    public static final String GenerateToken = baseURI+"/generateToken.php";
    public static final String GetOneEmployee = baseURI+"/getOneEmployee.php";
    public static final String UpdateEmployee = baseURI+"/updateEmployee.php";
    public static final String CreatUser = baseURI+"createUser.php";
    public static final String GetAllemployee = baseURI+"/getAllEmployees.php";
    public static final String Jobtitle = baseURI+"/jobTitle.php";
    public static final String EmployeeStatus = baseURI+"employeementStatus.php";
    public static final String DeelteEmployee = baseURI+"deleteEmployee.php";
    public static final String UpdatePatialEmp = baseURI+"/updatePartialEmplyeesDetails.php";

    public static final String Header_ContentType_Key = "Content-Type";
    public static final String Header_ContentType_Value = "application/json";
    public static final String Header_Authorization_Key = "Authorization";




}
