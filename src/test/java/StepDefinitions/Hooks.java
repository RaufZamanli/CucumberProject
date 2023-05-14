package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void after(){

        System.out.println("Scenario finished");
        GWD.quitDriver();
    }
}
