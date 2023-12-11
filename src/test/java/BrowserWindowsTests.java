import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.SocketHandler;

public class BrowserWindowsTests {
    public static void main(String[] args) {
        openNewWindowMessage();
    }

    public static void openTab() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
            String initialWindowHandle = driver.getWindowHandle();
            WebElement tabButton = driver.findElement(By.xpath("//div[@id='tabButtonWrapper']//button[@id='tabButton']"));
            tabButton.click();

            Thread.sleep(2000);
            Set<String> tabs = driver.getWindowHandles();

            if (tabs.size() > 1) {
                String tab = getNewTabHandle(driver, initialWindowHandle);
                Thread.sleep(2000);
                driver.switchTo().window(tab);
                WebElement h1Element = driver.findElement(By.xpath("//body[@style='background-color:#a9a9a9']//h1[@id='sampleHeading']"));

                System.out.println(h1Element.getText());
                System.out.println("s-a deschis un tab now la acest ulr: " + driver.getCurrentUrl());

            } else {
                System.out.println("nu a fost gasit nici-un tab");
            }
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void openNewWindow() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
            String initialWindowHandle = driver.getWindowHandle();
            WebElement tabButton = driver.findElement(By.xpath("//div[@id='windowButtonWrapper']//button[@id='windowButton']"));
            tabButton.click();

            Thread.sleep(2000);
            Set<String> tabs = driver.getWindowHandles();

            if (tabs.size() > 1) {
                String tab = getNewTabHandle(driver, initialWindowHandle);
                Thread.sleep(2000);
                driver.switchTo().window(tab);
                WebElement h1Element = driver.findElement(By.xpath("//body[@style='background-color:#a9a9a9']//h1[@id='sampleHeading']"));

                System.out.println(h1Element.getText());
                System.out.println("s-a deschis un tab now la acest ulr: " + driver.getCurrentUrl());

            } else {
                System.out.println("nu a fost gasit nici-un tab");
            }
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void openNewWindowMessage() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
            String initialWindowHandle = driver.getWindowHandle();
            WebElement tabButton = driver.findElement(By.xpath("//div[@id='msgWindowButtonWrapper']//button[@id='messageWindowButton']"));
            tabButton.click();

            Thread.sleep(2000);
            Set<String> tabs = driver.getWindowHandles();

            if (tabs.size() > 1) {
                String tab = getNewTabHandle(driver, initialWindowHandle);
                Thread.sleep(2000);
                driver.switchTo().window(tab);
                String popupText = driver.findElement(By.tagName("body")).getText();
                System.out.println("textul din pupup este: " + popupText);
                System.out.println("s-a deschis un tab now la acest ulr: " + driver.getCurrentUrl());

            } else {
                System.out.println("nu a fost gasit nici-un tab");
            }
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    private static String getNewTabHandle(WebDriver driver, String initialHandle) {
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(initialHandle)) {
                return handle;
            }
        }
        return null;
    }
}
