package utils;

import pages.EmpAllContactIngoPage;
import pages.EmployeeContactPage;
import pages.LoginPage;

public class PageIntializer {


    public static LoginPage loginPage;
    public static EmployeeContactPage employeeContactPage;
    public static EmpAllContactIngoPage empAllContactIngoPage;

    public static void intializePgae(){
        loginPage = new LoginPage();
        employeeContactPage = new EmployeeContactPage();
        empAllContactIngoPage = new EmpAllContactIngoPage();
    }


}
