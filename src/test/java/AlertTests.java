import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.logging.SocketHandler;

public class AlertTests {
    public static void main(String[] args) {
        secondAlertTest();
    }

    public static void firstAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

            WebElement firstButton = driver.findElement(By.id("alertexamples"));
            firstButton.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            Alert firstAlert = driver.switchTo().alert();

            System.out.println(firstAlert.getText());
            firstAlert.accept();

            WebElement paragraph = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class, 'inline-explanation')]")));

            if (paragraph.isDisplayed()) {
                System.out.println(paragraph.getText());
            }
            if (!isAlertOpen(driver)) {
                System.out.println("is alert open after clicked on it? " + isAlertOpen(driver));
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void secondAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

            WebElement firstButton = driver.findElement(By.id("confirmexamplel"));
            firstButton.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            Alert firstAlert = driver.switchTo().alert();

            System.out.println(firstAlert.getText());
            firstAlert.dismiss();

            WebElement paragraph = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='centered']//p[@id='confirmexplanation']")));
            if (paragraph.isDisplayed()) {
                System.out.println(paragraph.getText());
            }

            if (!isAlertOpen(driver)) {
                System.out.println("is alert open after clicked on it? " + isAlertOpen(driver));
            }
        }catch (NoSuchElementException e){
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void thirdAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
            WebElement firstButton = driver.findElement(By.id("promptexample"));
            firstButton.click();
            Alert firstAlert = driver.switchTo().alert();
            firstAlert.sendKeys("ceva");
            System.out.println(firstAlert.getText());
            firstAlert.accept();
            if (!isAlertOpen(driver)) {
                System.out.println("is alert open after clicked on it? " + isAlertOpen(driver));
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    public static boolean isAlertOpen(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
