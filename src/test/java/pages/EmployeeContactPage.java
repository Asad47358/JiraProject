package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeContactPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement PIMbutton;


    @FindBy(id="ohrmList_chkSelectRecord_101831")
    public WebElement checkBox;

    @FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]/a[@href]")
    public WebElement emp;

    @FindBy(xpath="//*[@id='sidenav']/li[2]/a")
    public WebElement ContactDetails;

   public EmployeeContactPage(){
       PageFactory.initElements(driver, this);
   }

}
