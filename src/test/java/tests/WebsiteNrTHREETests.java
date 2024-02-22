package tests;

import common.config.DriverFactory;
import common.constants.Constants;
import org.testng.annotations.Test;
import websiteNr2.TestClassWebsiteNr2;
import websiteNr3.TestClassWebsiteNr3;

public class WebsiteNrTHREETests extends DriverFactory {

    public TestClassWebsiteNr3 tests(){
        return new TestClassWebsiteNr3();
    }

    @Test(description = "sometrhing")
    public void goToWebSiteTest(){
        setUp(Constants.urlWebsiteNrTHREE);
    }

    @Test(description = "check timestamp")
    public void check_timestamp_validation(){
        tests().check_timestamp();
    }
}
