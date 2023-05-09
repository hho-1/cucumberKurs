package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigationMenu;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Utilities.GenelWebDriver.driver;

public class _02_CountrySteps {

    DialogContent dc = new DialogContent();
    LeftNavigationMenu LNM = new LeftNavigationMenu();


    @And("Navigate to Country Page")
    public void navigateToCountryPage() {
        //dc.findAndClick("leftMenu");
        LNM.findAndClick("setup");
        LNM.findAndClick("parameters");
        LNM.findAndClick("countries");
    }

    @When("Create a country")
    public void createACountry() {
        dc.findAndClick("addButton");
        dc.findAndSendKeys("nameInput", "Sahsimistan12");
        dc.findAndSendKeys("codeInput", "gdjfsa3h");
        dc.findAndClick("toggleStatesBar");

        dc.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.checkIfContainsText("successMessage", "success");
    }

    @When("Create a country as {string} code as {string}")
    public void createACountryAsCodeAs(String name, String code) {
        dc.findAndClick("countryAddButton");
        dc.findAndSendKeys("countryName", name);
        dc.findAndSendKeys("codeInput", code);
        dc.findAndClick("toggleStatesBar");

        dc.acceptCookies.click();

        dc.findAndClick("countrySaveButton");
    }
}
