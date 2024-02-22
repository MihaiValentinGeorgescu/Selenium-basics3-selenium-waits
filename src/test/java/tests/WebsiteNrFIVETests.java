package tests;

import common.config.DriverFactory;
import common.constants.Constants;
import org.testng.annotations.Test;
import websiteNr3.TestClassWebsiteNr3;
import websiteNr3.TestClassWebsiteNr5;

public class WebsiteNrFIVETests extends DriverFactory {

    public TestClassWebsiteNr5 tests(){
        return new TestClassWebsiteNr5();
    }

    @Test(description = "sometrhing")
    public void goToWebSiteTest(){
        setUp(Constants.urlWebsiteNrFIVE);
    }

    @Test(description = "start clicking buttons")
    public void click_buttons(){
        tests().click_start_button();
        tests().click_one_button();
        tests().click_two_button();
        tests().click_three_button();
    }
}
