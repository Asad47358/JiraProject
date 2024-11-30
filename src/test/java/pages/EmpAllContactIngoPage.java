package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmpAllContactIngoPage extends CommonMethods {


    @FindBy(id="btnSave")
    public WebElement editBotton;

    @FindBy(xpath="//input[@value='Save']")
    public WebElement save;

   @FindBy(id="contact_street1")
    public WebElement Address1;

   @FindBy(id="contact_street2")
    public WebElement Address2;

   @FindBy(id="contact_city")
    public WebElement City;

   @FindBy(id="contact_province")
    public WebElement State;

   @FindBy(id="contact_emp_zipcode")
    public WebElement zipcode;

   @FindBy(id="contact_country")
    public WebElement country;

   @FindBy(id="contact_emp_hm_telephone")
    public WebElement homephone;

   @FindBy(id="contact_emp_mobile")
    public WebElement mobile;

   @FindBy(id="contact_emp_work_telephone")
    public WebElement workphone;

   @FindBy(id="contact_emp_work_email")
    public WebElement email;

   @FindBy(id="contact_emp_oth_email")
    public WebElement otherEmail;

   public EmpAllContactIngoPage(){

       PageFactory.initElements(driver,this);
   }
}
