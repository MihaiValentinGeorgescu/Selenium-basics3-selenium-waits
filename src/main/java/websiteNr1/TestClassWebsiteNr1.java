package websiteNr1;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestClassWebsiteNr1 extends CommonMethods {

    @FindBy(xpath = "//select[@id='combo1']")
    private WebElement category_button;

    @FindBy(xpath = "//select[@id='combo2']")
    private WebElement language_button;

    @FindBy(xpath = "//input[@class='styled-click-button']")
    private WebElement code_in_it_button;

    public void clickSubmitButton(){
        click(code_in_it_button);
    }

    public void clickCategoryButton(){
        click(category_button);
    }

    public void clickLanguageButton(){
        click(language_button);
    }

    public void selectOptionByText(WebElement dropdown, String optionText) {
        // Create a Select object
        Select selectDropdown = new Select(dropdown);

        // Get all the options in the dropdown
        List<WebElement> options = selectDropdown.getOptions();

        // Iterate through each option
        for (WebElement option : options) {
            // Check if the option text matches the desired text
            if (option.getText().equals(optionText)) {
                // Select the option if it matches
                option.click();
                break; // Exit the loop once the option is selected
            }
        }
    }

    public void selectCategoryByText(String optionText) {
        //clickCategoryButton();
        selectOptionByText(category_button, optionText);
    }

    public void selectLanguageOptionByText(WebElement dropdown, String optionText){
        Select selectDropdown = new Select(dropdown);
        List<WebElement> options = selectDropdown.getOptions();

        for(WebElement option : options){
            if(option.getText().equals(optionText)){
                option.click();
                break;
            }
        }
    }

    public void selectLanguageByText(String optionText){
        //clickLanguageButton();
        selectLanguageOptionByText(language_button, optionText);
    }
}
