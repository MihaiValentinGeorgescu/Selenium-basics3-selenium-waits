package homeButtonTests;

import common.base.CommonMethods;
import org.bson.types.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homeButtonTests extends CommonMethods {

    @FindBy(xpath = "//li[@class='sidebar-brand']//a[@href='./']")
    private WebElement homeButton;

    @FindBy(xpath = "//a[@id='menu-toggle']")
    private WebElement burger;

    @FindBy(xpath = "//div[@class='text-vertical-center']//h1")
    private WebElement homeText;

    public void clickBurger() {
        click(burger);
    }

    public void clickHomeButton() {
        click(homeButton);
    }

    public boolean verifyPage(String url) {
        if (driver.getCurrentUrl() == url) {
            return true;
        }
        return false;
    }

    public boolean verifyText() {
        if (homeText.isDisplayed()) {
            return true;
        }
        return false;
    }

}
