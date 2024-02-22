package websiteNr2;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestClassWebsiteNr2 extends CommonMethods {

    @FindBy(xpath = "//button[@id='delaygotobasic']")
    private WebElement five_seconds_button;

    @FindBy(xpath = "//button[@id='delaygotobounce']")
    private WebElement two_seconds_button;

    @FindBy(xpath = "//button[@id='goback']")
    private WebElement go_back_button;

    public void click_5_sec_button(){
        click(five_seconds_button);
    }

    public void click_2_sec_button(){
        click(two_seconds_button);
    }

    public void click_back_button(){
        click(go_back_button);
    }

}
