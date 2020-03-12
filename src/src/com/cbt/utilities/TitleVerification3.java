package src.com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    static WebDriver driver;

    public static void main(String[] args) throws Exception{
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        driver = BrowserFactory.getDrive("chrome");
        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        verifyEquals(title1,url1);
        Thread.sleep(2000);
        driver.close();
        driver = BrowserFactory.getDrive("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        verifyEquals(title2, url2);
        Thread.sleep(2000);
        driver.close();

        driver = BrowserFactory.getDrive("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        String url3 = driver.getCurrentUrl();
        verifyEquals( title3,url3);
        Thread.sleep(2000);
        driver.quit();
    }
    public static void  verifyEquals(String arg1, String arg2){
        if(arg2.contains(arg1.toLowerCase())){
            System.out.println("test passed");
        }else{
            System.out.println("try again");
        }
    }
}