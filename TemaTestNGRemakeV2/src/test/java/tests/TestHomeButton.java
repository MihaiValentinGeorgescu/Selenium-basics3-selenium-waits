package tests;

import common.base.CommonMethods;
import homeButtonTests.homeButtonTests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHomeButton extends CommonMethods {

    public homeButtonTests butonMeniuHome() {
        return new homeButtonTests();
    }

    @Test(description = "test home button")
    @Parameters({"url"})
    public void makeAppointmentButtonTest(String url) {
        try {
            butonMeniuHome().clickBurger();
            butonMeniuHome().clickHomeButton();
            if (butonMeniuHome().verifyPage(url) && butonMeniuHome().verifyText()) {
                System.out.println("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


}
