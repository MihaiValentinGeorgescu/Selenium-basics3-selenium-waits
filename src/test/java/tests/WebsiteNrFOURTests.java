package tests;

import common.config.DriverFactory;
import common.constants.Constants;
import org.testng.annotations.Test;
import websiteNr2.TestClassWebsiteNr2;
import websiteNr3.TestClassWebsiteNr4;

public class WebsiteNrFOURTests extends DriverFactory {

    public TestClassWebsiteNr4 tests(){
        return new TestClassWebsiteNr4();
    }

    @Test(description = "sometrhing")
    public void goToWebSiteTest(){
        setUp(Constants.urlWebsiteNrFOUR);
    }

    @Test(description = "start clicking buttons")
    public void click_buttons(){
        tests().click_start_button();
        tests().click_one_button();
        tests().click_two_button();
        tests().click_three_button();
    }
}
