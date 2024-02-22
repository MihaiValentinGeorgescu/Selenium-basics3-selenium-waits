package websiteNr3;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.time.Instant;

public class TestClassWebsiteNr3 extends CommonMethods {

    @FindBy(xpath = "//input[@id='button']")
    private WebElement refresh_button;

    @FindBy(xpath = "//input[@id='button']")
    private WebElement top_writing;

    @FindBy(xpath = "//input[@id='button']")
    private WebElement middle_writing;

    @FindBy(xpath = "//span[@id='embeddedrefreshdatevalue']")
    private WebElement bottom_writing;

    long currentTimeStamp = Instant.now().getEpochSecond();

    String refreshedTimestampText = bottom_writing.getText();

    long refreshedTimestamp = Long.parseLong(refreshedTimestampText);

    public void check_timestamp(){
        if ( refreshedTimestamp == currentTimeStamp ) {
            System.out.println("Timestamps match. Refresh functionality verified.");
        } else {
            System.out.println("Timestamps do not match. Refresh functionality may not be working correctly.");
        }
    }

    public void click_refresh_button(){
        click(refresh_button);
    }
}

