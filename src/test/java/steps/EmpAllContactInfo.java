package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class EmpAllContactInfo extends CommonMethods {

    @Given("user able to click edit button")
    public void user_able_to_click_edit_button() {
       click(EmpAllContactInfo.empAllContactIngoPage.editBotton);
    }
    @Given("address one  text box should displyed and emp can enter or update")
    public void address_one_text_box_should_displyed_and_emp_can_enter_or_update() {
        sendText("133 Street 5",empAllContactIngoPage.Address1);
    }
    @Then("address two test box should displyed and emp can enter or update")
    public void address_two_test_box_should_displyed_and_emp_can_enter_or_update() {

    }
    @Then("City textbox should displyed emp can enter or update")
    public void city_textbox_should_displyed_emp_can_enter_or_update() {

    }
    @Then("State textbox should displyed emp can enter or update")
    public void state_textbox_should_displyed_emp_can_enter_or_update() {

    }
    @Then("Zip Code textbox should displyed emp can enter or update")
    public void zip_code_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Country dropdown should displyed emp can enter or update")
    public void country_dropdown_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("home phone textbox should displyed emp can enter or update")
    public void home_phone_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Mobile phone textbox should displyed emp can enter or update")
    public void mobile_phone_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("workphone textbox should displyed emp can enter or update")
    public void workphone_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("work email textbox should displyed emp can enter or update")
    public void work_email_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("other email textbox should displyed emp can enter or update")
    public void other_email_textbox_should_displyed_emp_can_enter_or_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The contact info should save, chanage and submit successfuly")
    public void the_contact_info_should_save_chanage_and_submit_successfuly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
