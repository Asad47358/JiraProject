package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPageStep extends CommonMethods {

    @Given("user able to enter user name")
    public void user_able_to_enter_user_name() {
        sendText(ConfigReader.read("userName"), loginPage.userNamefield);
    }
    @Then("user able to enter password")
    public void user_able_to_enter_password() {
      sendText(ConfigReader.read("password"), loginPage.passwordField);
    }
    @Then("user able to click login button")
    public void user_able_to_click_login_button() {
       click(loginPage.loginBtn);
    }
    @Then("user is navigate to dashboard page")
    public void user_is_navigate_to_dashboard_page() {
        String actualMsg = loginPage.dashboardPage.getText();
        Assert.assertEquals("Welcome Admin",actualMsg);
    }






}
