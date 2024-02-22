package tests;

import common.config.DriverFactory;
import common.constants.Constants;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import websiteNr1.TestClassWebsiteNr1;

public class WebsiteNrONETests extends DriverFactory {

    public TestClassWebsiteNr1 tests(){
        return new TestClassWebsiteNr1();
    }

    @Test(description = "sometrhing")
    public void goToWebSiteTest(){
        setUp(Constants.urlWebsiteNrONE);
    }

    @Test(description = "click category button")
    public void click_category(){
        tests().clickCategoryButton();
    }

    @Test(description = "click on the category button")
    @Parameters("category")
    public void click_category_button(String category){
        //tests().clickCategoryButton();
        tests().selectCategoryByText(category);
    }

    @Test(description = "click language button")
    public void click_language(){
        tests().clickLanguageButton();
    }

    @Test(description = "click and add language")
    @Parameters("language")
    public void click_add_language_button(String language){
        //tests().clickLanguageButton();
        tests().selectLanguageByText(language);
    }

    @Test(description = "click submit button")
    public  void click_submit_button(){
        tests().clickSubmitButton();
    }

}
