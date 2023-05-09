package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.impl.SimpleLogger;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver(){

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");                    //sonuclarda cikan bonigarcia kirmizi yazili iki satiri yok etmek icin
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if(driver == null) {

            WebDriverManager.chromedriver().setup();     //cucumberda tüm driver cesitleri otomatik olarak geliyor
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }

    public static void bekle(int saniye){
        try{
            Thread.sleep(saniye * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

