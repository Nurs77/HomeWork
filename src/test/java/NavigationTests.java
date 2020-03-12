import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import src.com.cbt.utilities.BrowserFactory;

public class NavigationTests {
    static WebDriver driver;
    public static void main(String[] args) {
chrome();
fireFox();
edge();
    }
    public static void chrome(){

        driver = BrowserFactory.getDrive("chrome");

        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        if (googleTitle.equals(driver.getTitle())) {
            System.out.println("Google Test Passed");
        } else {
            System.out.println("Google Test FAILED");
        }
        driver.navigate().forward();

        if (etsyTitle.equals(driver.getTitle())) {
            System.out.println("ETSY TEST PASSED");
        } else {
            System.out.println("ETSY TEST FAILED");
        }

        driver.quit();

    }
    public static void fireFox(){

        driver = BrowserFactory.getDrive("firefox");

        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        if (googleTitle.equals(driver.getTitle())) {
            System.out.println("Google Test Passed");
        } else {
            System.out.println("Google Test FAILED");
        }
        driver.navigate().forward();

        if (etsyTitle.equals(driver.getTitle())) {
            System.out.println("ETSY TEST PASSED");
        } else {
            System.out.println("ETSY TEST FAILED");
        }

        driver.quit();

    }
    public static void edge(){

        driver = BrowserFactory.getDrive("edge");

        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        if (googleTitle.equals(driver.getTitle())) {
            System.out.println("Google Test Passed");
        } else {
            System.out.println("Google Test FAILED");
        }
        driver.navigate().forward();

        if (etsyTitle.equals(driver.getTitle())) {
            System.out.println("ETSY TEST PASSED");
        } else {
            System.out.println("ETSY TEST FAILED");
        }

        driver.quit();

    }
    }

