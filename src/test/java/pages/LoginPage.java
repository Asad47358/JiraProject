package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userNamefield;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id="welcome")
    public WebElement dashboardPage;



    public LoginPage(){
        PageFactory.initElements(driver, this);
    }



}
