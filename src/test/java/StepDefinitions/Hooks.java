package StepDefinitions;

import Utilities.GenelWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Test senaryosu basladi.");
    }
    @After
    public void after(){
        GenelWebDriver.quitDriver();
    }

}
