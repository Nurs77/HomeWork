package src.com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    static WebDriver driver;
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        driver = BrowserFactory.getDrive("chrome");
        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        String url3 = driver.getCurrentUrl();
        if(title1.equals(title2)&&title1.equals(title3)&&title2.equals(title3)){
            System.out.println("TITLE TEST PASSED");
        }else{
            System.out.println("TITLE TEST FAILED");
        }
        if(url1.startsWith("http://practice.cybertekschool.com")&&url2.startsWith("http://practice.cybertekschool.com")
                &&url3.startsWith("http://practice.cybertekschool.com")){
            System.out.println("URL TEST PASSED");
        }else {
            System.out.println("URL TEST FAILED");
        }




        driver.quit();
    }
}
