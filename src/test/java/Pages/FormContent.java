package Pages;

import Utilities.GenelWebDriver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GenelWebDriver.getDriver(),this);
    }

    WebElement myElement;
    LeftNavigationMenu LNM = new LeftNavigationMenu();
    DialogContent dc = new DialogContent();

    FormContent fc;

    @FindBy(xpath= "//ms-add-button[contains(@tooltip, 'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//mat-form-field//input")
    public WebElement searchFormNameInput;

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//span[contains(text(), '2022-2023')])[2]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "//span[text()='Grade Level']")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;

    @FindBy(xpath="//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(css = "ms-search-button>div>button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "button[type='submit']")
    private WebElement dialogSubmitButton;



    public void findAndSendKeys(String strElement, String value){

        switch (strElement) {
            case "username" -> myElement = dc.username;
            case "searchFormNameInput" -> myElement = searchFormNameInput;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "addButton" -> myElement = addButton;
            case "academicPeriod" -> myElement = academicPeriod;
            case "academicPeriod1" -> myElement = academicPeriod1;
            case "gradeLevel" -> myElement = gradeLevel;
            case "gradeLevel2" -> myElement = gradeLevel2;
            case "saveButton" -> myElement = saveButton;
            case "searchButton" -> myElement = searchButton;
            case "deleteButton" -> myElement = deleteButton;
            case "dialogSubmitButton" -> myElement = dialogSubmitButton;

        }

        clickFunction(myElement);
    }

    public void checkIfContainsText(String strElement, String text){
        switch (strElement) {
            //case "dashboard" -> myElement = dashboard;

        }

        verifyContainsText(myElement, text);
    }

    public void searchAndDelete (String searchText){

        findAndSendKeys("searchFormNameInput", searchText);
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
