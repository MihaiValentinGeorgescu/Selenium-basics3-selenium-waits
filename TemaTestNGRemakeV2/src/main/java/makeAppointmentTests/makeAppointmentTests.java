package makeAppointmentTests;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class makeAppointmentTests extends CommonMethods {

    @FindBy(xpath = "//div[@class='input-group date']//span[@class='glyphicon glyphicon-calendar']")
    private WebElement chalendar;

    @FindBy(xpath = "//div[@class='input-group']//input[@placeholder='Username']")
    private WebElement demoUserName;

    @FindBy(xpath = "//div[@class='input-group']//input[@placeholder='Password']")
    private WebElement demoPassword;

    @FindBy(xpath = "//div[@class='col-sm-offset-5 col-sm-4']//button[@id='btn-book-appointment']")
    private WebElement buttonBookAppointment;

    @FindBy(xpath = "//div[@class='col-sm-4']//label[@class='radio-inline']//input[@name='programs']")
    private List<WebElement> healthCareProgramCheckboxes;

    @FindBy(xpath = "//div[@class='col-sm-4']//select[@id='combo_facility']")
    private Select facilityDropDown;

    @FindBy(xpath = "//div[@class='col-sm-offset-5 col-sm-4']//label[@for='chk_hospotal_readmission']")
    private WebElement hospitalReadmissionCheckButton;

    @FindBy(xpath = "//div[@class='col-sm-4']//textarea[@id='txt_comment']")
    private WebElement commentTextArea;

    public void fillUserName(String username){
        click(demoUserName);
        addText(username, demoUserName);
    }

    public void fillPassword(String password){
        click(demoPassword);
        addText(password, demoPassword);
    }

}
