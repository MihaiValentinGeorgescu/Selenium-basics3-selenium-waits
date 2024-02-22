package tests;

import common.config.DriverFactory;
import common.constants.Constants;
import org.testng.annotations.Test;
import websiteNr1.TestClassWebsiteNr1;
import websiteNr2.TestClassWebsiteNr2;

public class WebsiteNrTWOTests extends DriverFactory {

    public TestClassWebsiteNr2 tests(){
        return new TestClassWebsiteNr2();
    }

    @Test(description = "sometrhing")
    public void goToWebSiteTest(){
        setUp(Constants.urlWebsiteNrTWO);
    }

    @Test(description = "5 seconds redirect")
    public void five_seconds_redirect(){
        tests().click_5_sec_button();
    }

    @Test(description = "go back")
    public void go_back(){
        tests().click_back_button();
    }

    @Test(description = "two seconds  redirect")
    public void two_seconds_redirect(){
        tests().click_2_sec_button();
    }

    @Test(description = "go back again")
    public void go_back_again(){
        tests().click_back_button();
    }
}
