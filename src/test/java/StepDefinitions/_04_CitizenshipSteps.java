package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigationMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {

    LeftNavigationMenu LNM = new LeftNavigationMenu();
    DialogContent dc = new DialogContent();
    @And("Navigate to Citizenship Page")
    public void navigateToCitizenshipPage() {
        LNM.findAndClick("setup");
        LNM.findAndClick("parameters");
        LNM.findAndClick("citizenships");
    }

    @When("User a Citizenship name as {string} short name as {string}")
    public void userACitizenshipAsShortNameAs(String name, String shortName) {
        dc.findAndClick("addButton");
        dc.findAndSendKeys("nameInput", name);
        dc.findAndSendKeys("citizenshipShort", shortName);

        dc.findAndClick("saveButton");
    }

    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.checkIfContainsText("alreadyExistMessage", "already exists");
    }

    @And("Click on close button")
    public void clickOnCloseButton() {

        dc.findAndClick("closeDialogButton");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchName) {
        dc.searchAndDelete(searchName);
    }
}
