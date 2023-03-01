package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import io.cucumber.java.en.When;

public class _06_EntranceExamSteps {
    @When("User deletes {string} from the Form")
    public void userDeletesFromTheForm(String textToDelete) {

        FormContent fc = new FormContent();

        fc.searchAndDelete(textToDelete);
    }
}
