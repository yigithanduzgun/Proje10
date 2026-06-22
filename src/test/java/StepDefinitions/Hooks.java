package StepDefinitions;


import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After // after senaryo
    public void after(Scenario senaryo)
    {

        GWD.quitDriver();
    }
}
