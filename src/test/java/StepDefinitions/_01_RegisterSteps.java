package StepDefinitions;

import Pages.DialogPage;
import Pages.ParentPage;
import Pages.RegisterPage;
import Utilities.GWD;
import com.github.javafaker.Faker;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_RegisterSteps {
    DialogPage dp = new DialogPage();
    RegisterPage rp = new RegisterPage();
    ParentPage pp = new ParentPage();


    @Given("Navigate To Website")
    public void navigateToWebsite() {
        // Write code here that turns the phrase above into concrete actions
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("User clicks Register")
    public void userClicksRegister() {

        // navigate to website nerede yapıyoruz ?
        pp.myClick(rp.registerLink);

    }

    public String firstName;
    public String lastName;
    public String password;
    public String userName;

    @When("User fills registration form")
    public void userFillsRegistrationForm() {
        Faker faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        password = faker.internet().password();
        userName = faker.name().username();

        pp.mySendKeys(rp.firstName, firstName);
        pp.mySendKeys(rp.lastName, lastName);
        pp.mySendKeys(rp.address, "turkiye");
        pp.mySendKeys(rp.city, "ist");
        pp.mySendKeys(rp.state, "beylik");
        pp.mySendKeys(rp.zip, "111");
        pp.mySendKeys(rp.phone, "123456789");
        pp.mySendKeys(rp.ssn, "555");
        pp.mySendKeys(rp.username, userName);
        pp.mySendKeys(rp.password, password);
        pp.mySendKeys(rp.confirmPassword, password);
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() {
        pp.myClick(rp.registerButton);
    }

    @Then("Account should be create")
    public void accountShouldBeCreate() {
       String regisAssert=rp.registerAssert.getText();
        Assert.assertEquals(regisAssert, "Your account was created successfully. You are now logged in.", "Hatalı register girişimi.");
    }


}
