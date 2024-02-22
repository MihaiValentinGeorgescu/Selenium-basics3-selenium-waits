package common.base;

//import com.sun.tools.classfile.ConstantPool;
import common.config.DriverFactory;
import common.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    public WebDriver driver;

    public CommonMethods(){
        driver = DriverFactory.driver;
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement locator){
        clickable(locator).click();
    }

    public WebDriverWait waitPage(){
        return new WebDriverWait(driver, Constants.WEB_DRIVER_WAIT_DURATION);
    }

    public WebElement clickable(WebElement locator){
        waitPage().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }



}
