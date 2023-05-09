package Pages;

import Utilities.GenelWebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GenelWebDriver.getDriver(),this);
    }

    @FindBy(id="mat-input-0")
    public WebElement username;

    @FindBy(id="mat-input-1")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(), 'Dashboard')])[2]")
    public WebElement dashboard;

    @FindBy(xpath= "//ms-add-button[contains(@tooltip, 'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(css="span.mat-slide-toggle-bar")
    public WebElement toggleSlideBar;

    @FindBy(css = "span.mat-slide-toggle-bar>input#mat-slide-toggle-13-input")
    public WebElement feesToggleButton;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement acceptCookies;

    @FindBy(xpath="//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'already')]")
    public WebElement alreadyMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "ms-text-field[placeholder*='FIELD.NAME']>input")
    private WebElement searchNameInput;

    @FindBy(css = "ms-search-button>div>button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "button[type='submit']")
    private WebElement dialogSubmitButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    WebElement myElement;
    LeftNavigationMenu LNM = new LeftNavigationMenu();

    public void findAndSendKeys(String strElement, String value){

        switch (strElement) {
            case "username" -> myElement = username;
            case "password" -> myElement = password;
            case "nameInput" -> myElement = nameInput;
            case "codeInput" -> myElement = codeInput;
            case "citizenshipShort" -> myElement = shortName;
            case "searchNameInput" -> myElement = searchNameInput;
            case "integrationCode" -> myElement = integrationCode;
            case "priorityCode" -> myElement = priorityCode;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton" -> myElement = loginButton;
            case "addButton" -> myElement = addButton;
            case "toggleStatesBar" -> myElement = toggleSlideBar;
            case "saveButton" -> myElement = saveButton;
            case "closeDialogButton" -> myElement = closeDialog;
            case "searchButton" -> myElement = searchButton;
            case "deleteButton" -> myElement = deleteButton;
            case "dialogSubmitButton" -> myElement = dialogSubmitButton;
            //case "feesToggleButton" -> myElement = feesToggleButton;       //Bu kodu ekleme sebebimiz, fee ekleme sayfasinda saveButtonun ek bir tiklama yapmayinca aktif hale gelmemesi. Baska cozum bulursan bunu silebilirsin
        }

        clickFunction(myElement);
    }

    public void checkIfContainsText(String strElement, String text){
        switch (strElement) {
            case "dashboard" -> myElement = dashboard;
            case "successMessage" -> myElement = successMessage;
            case "alreadyExistMessage" -> myElement = alreadyMessage;
        }

        verifyContainsText(myElement, text);
    }

    public void searchAndDelete (String searchText){

        findAndSendKeys("searchNameInput", searchText);
        findAndClick("searchButton");

        //WebDriverWait wait = new WebDriverWait(GenelWebDriver.driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.stalenessOf(deleteButton));

        waitUntilLoading();

        //GenelWebDriver.bekle(2);  //TODO: incelenecek. Önce böyle yapmistik, sonra ust satirdaki metodu yazdik calisti.
        findAndClick("deleteButton");

        //wait.until(ExpectedConditions.elementToBeClickable(dialogSubmitButton));
        findAndClick("dialogSubmitButton");

    }

}
