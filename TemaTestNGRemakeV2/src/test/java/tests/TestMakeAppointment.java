package tests;

import common.config.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestMakeAppointment extends DriverFactory {

    public WebElement getDatePicker() {
        return driver.findElement(By.id("txt_visit_date"));
    }


}
