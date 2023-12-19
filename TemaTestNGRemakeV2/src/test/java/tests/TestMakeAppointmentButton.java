package tests;

import common.base.CommonMethods;
import makeAppointment.MakeAppointment;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMakeAppointmentButton extends CommonMethods {

    public MakeAppointment makeAppointmentButton() {
        return new MakeAppointment();
    }

    @Test(description = "test Make Appointment button")
    @Parameters({"url"})
    public void makeAppointmentButtonTest(String url) {
        try {
            makeAppointmentButton().pressMakeAppointmentButton();
            if (makeAppointmentButton().verifyUrl(url) && makeAppointmentButton().textCheck()) {
                System.out.println("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
