package StepDefinitions;

import Pages.DialogContent;
import Utilities.GenelWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Utilities.GenelWebDriver.driver;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Given("Navigate to basqar")
    public void navigateToBasqar() {

        GenelWebDriver.getDriver().get("https://demo.mersys.io/");
        GenelWebDriver.getDriver().manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(dc.acceptCookies)).click();
    }

    @When("Enter username and password and click on login button")
    public void enterUsernameAndPasswordAndClickOnLoginButton() {

        //dc.username.sendKeys("richfield.edu");
        //dc.password.sendKeys("Richfield2020!");
        //dc.loginButton.click();

        dc.findAndSendKeys("username", "richfield.edu");
        dc.findAndSendKeys("password", "Richfield2020!");
        dc.findAndClick("loginButton");

    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {

        //dc.waitUntilVisible(dc.dashboard);
        //Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));

        dc.checkIfContainsText("dashboard", "dashboard");

    }
}
