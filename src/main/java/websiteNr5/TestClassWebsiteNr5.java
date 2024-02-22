package websiteNr3;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TestClassWebsiteNr5 extends CommonMethods {

    @FindBy(xpath = "//button[@id='button00']")
    private WebElement start_Button;

    @FindBy(xpath = "//button[@id='button01']")
    private WebElement one_Button;

    @FindBy(xpath = "//button[@id='button02']")
    private WebElement two_Button;

    @FindBy(xpath = "//button[@id='button03']")
    private WebElement three_Button;

    public void click_start_button(){
        click(start_Button);
    }

    public void click_one_button(){
        click(one_Button);
    }

    public void click_two_button(){
        click(two_Button);
    }

    public void click_three_button(){
        click(three_Button);
    }

}
