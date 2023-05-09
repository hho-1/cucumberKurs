package Pages;

import Utilities.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent{

    public void sendKeysFunction (WebElement element, String value){

        waitUntilVisible(element);
        //scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible (WebElement element){

        WebDriverWait wait = new WebDriverWait(GenelWebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) GenelWebDriver.getDriver();
        js.executeScript("arguments[].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(GenelWebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickFunction(WebElement element){

        waitUntilClickable(element);
        //scrollToElement(element);
        element.click();

    }

    public void verifyContainsText(WebElement element, String text){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void waitUntilLoading(){
        WebDriverWait wait = new WebDriverWait(GenelWebDriver.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        //Bu webelement search butonuna tikladiktan sonraki anlik yükleme isleminde sayfadan gecen gecici elemanlar
        // Bunu sifir yapana kadar devam et demis olduk
        //Fuse-progress-bar'in child'lari sifir olana kadar bekle dedik
    }
}
