package makeAppointment;

import common.base.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeAppointment extends CommonMethods{

    @FindBy(xpath = "//div[@class='text-vertical-center']//a[@id='btn-make-appointment']")
    private WebElement makeAppointmentButton;

    @FindBy(xpath = "//div[@class='col-sm-12 text-center']//p[@class='lead']")
    private WebElement loginText;
    private String url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";

    public void pressMakeAppointmentButton(){
        click(makeAppointmentButton);
    }

    public boolean textCheck(){
        if(loginText.isDisplayed()){
            return true;
        }
        return false;
    }

    public boolean verifyUrl(String url){
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals(url)){
            return true;
        }
        return false;
    }

}
