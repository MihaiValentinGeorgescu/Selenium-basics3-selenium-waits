import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLform {
    public static void main(String[] args) {
        System.out.println();
    }

    public static void functieCompletareFormular(){
        ChromeDriver driver = null;
        try{
            driver = new ChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
        } finally {
            if(driver != null){
                driver.quit();
            }
        }
    }
}
