package StepDefinitions;

import Pages.DialogPage;
import Pages.ParentPage;
import Pages.RegisterPage;
import Utilities.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_LoginSteps {
    DialogPage dp = new DialogPage();
    RegisterPage rp = new RegisterPage();
    ParentPage pp = new ParentPage();


    @When("User enters {string}")
    public void userEnters(String userName) {
        pp.mySendKeys(dp.userName, userName);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String passWord) {
        pp.mySendKeys(dp.passWord, passWord);

    }

    @When("User clicks Login")
    public void userClicksLogin() {
        pp.myClick(dp.loginButton);

    }

    @Then("User should see {string}")
    public void userShouldSee(String message) {
        Assert.assertEquals(rp.registerAssert.getText(),message);

    }
}
