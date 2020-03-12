package src.com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    static WebDriver driver;
    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList("https://amazon.com", "https://wayfair.com/", "https://walmart.com, " +
                "https://westelm.com/");
        driver = BrowserFactory.getDrive("chrome");
        driver.get("https://amazon.com");
        verifyEquals(driver.getCurrentUrl(),driver.getTitle());
Thread.sleep(2000);
        driver.get("https://wayfair.com/");
        verifyEquals(driver.getCurrentUrl(),driver.getTitle());
        Thread.sleep(2000);
        driver.get("https://walmart.com");
        Thread.sleep(2000);
        verifyEquals(driver.getCurrentUrl(),driver.getTitle());
        Thread.sleep(2000);
        driver.get("https://westelm.com");
        Thread.sleep(2000);
        verifyEquals(driver.getCurrentUrl(),driver.getTitle());
        driver.quit();
    }

        public static void  verifyEquals(String arg1, String arg2){
            if(arg1.contains(arg2.toLowerCase())){
                System.out.println("test passed");
            }else{
                System.out.println("try again");
            }
        }

}
