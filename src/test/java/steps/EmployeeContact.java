package steps;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.CommonMethods;

public class EmployeeContact extends CommonMethods {


    @Given("user able to click PIM tab on dashboard page")
    public void user_able_to_click_pim_tab_on_dashboard_page() {
        click(EmployeeContact.employeeContactPage.PIMbutton);
    }
    @Then("user able to chech the box")
    public void user_able_to_chech_the_box() {
        click(EmployeeContact.employeeContactPage.checkBox);
    }
    @Then("user able to check one of Emp ID")
    public void user_able_to_check_one_of_emp_id() {
        click(EmployeeContact.employeeContactPage.emp);
    }
    @Then("user able to click on contact information")
    public void user_able_to_click_on_contact_information() {
        click(EmployeeContact.employeeContactPage.ContactDetails);

    }
}
