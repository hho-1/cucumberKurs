package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNavigationMenu;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTable {

    LeftNavigationMenu ln = new LeftNavigationMenu();
    DialogContent dc = new DialogContent();

    FormContent fc = new FormContent();

    @And("Click on the element in the left Navigation Menu")
    public void clickOnTheElementInTheLeftNavigationMenu(DataTable elements) {

        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++){
            ln.findAndClick(listElements.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (String listElement : listElements) {
            dc.findAndClick(listElement);
        }
    }

    @And("User sends the keys in Dialog Content")
    public void userSendsTheKeysInDialogContent(DataTable elements) {
        List<List <String>> listElements = elements.asLists(String.class);     //Bu listlerin listi oldugu icin bu sekilde

        for (int i = 0; i< listElements.size(); i++){
            dc.findAndSendKeys(listElements.get(i).get(0), listElements.get(i).get(1));   //Listin ilk elemanini bul, 2. elemani oraya gonder

        }
    }

    @And("User deletes item from Dialog")
    public void userDeletesItemFromDialog(DataTable elements) {
        List<String> listElements = elements.asList(String.class);

        for(String listElement : listElements){
            dc.searchAndDelete(listElement);
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (String listElement : listElements) {
            fc.findAndClick(listElement);
        }
    }

}
