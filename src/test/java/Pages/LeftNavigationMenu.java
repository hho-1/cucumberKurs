package Pages;

import Utilities.GenelWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavigationMenu extends Parent{

    //@FindBy(css="button.mat-focus-indicator.navbar-toggle-button.mat-icon-button.mat-button-base.ng-star-inserted")
    //public WebElement leftMenuButton;

    public LeftNavigationMenu() {
        PageFactory.initElements(GenelWebDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement leftSetupButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenshipsButton;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalitiesButton;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement feesButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton1;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetupButton;


    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsButton2;



    WebElement myElement;

    public void findAndClick(String strElement){
        switch (strElement) {

            case "setup" -> myElement = leftSetupButton;
            case "parameters" -> myElement = parametersButton;
            case "countries" -> myElement = countriesButton;
            case "citizenships" -> myElement = citizenshipsButton;
            case "nationalities" -> myElement = nationalitiesButton;
            case "fees" -> myElement = feesButton;
            case "entranceExamsButton1" -> myElement = entranceExamsButton1;
            case "entranceExamsSetupButton" -> myElement = entranceExamsSetupButton;
            case "entranceExamsButton2" -> myElement = entranceExamsButton2;

        }

        clickFunction(myElement);
    }
}
