package StepDefinitions;

import Pages.Registration;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationSteps {

    Registration rg = new Registration();
    @Given("navigate to para Bank website")
    public void navigateToParaBankWebsite() {

        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();

    }

    @When("click on register button and provide all information")
    public void clickingRegisterButtonAndProvidingAllInformation() {

        rg.clickFunction(rg.registerBtn);
        rg.sendKeysFunction(rg.firstName,"Rauf");
        rg.sendKeysFunction(rg.lastName,"Zamanli");
        rg.sendKeysFunction(rg.adress,"Ganja avenue 69");
        rg.sendKeysFunction(rg.city,"Baku");
        rg.sendKeysFunction(rg.state,"Khatai");
        rg.sendKeysFunction(rg.zipCode,"AZ1000");
        rg.sendKeysFunction(rg.phone,"994559473200");
        rg.sendKeysFunction(rg.SSN,"10051998");
        rg.sendKeysFunction(rg.username,"rafan444");
        rg.sendKeysFunction(rg.password,"rauf123456");
        rg.sendKeysFunction(rg.confirmedPswd,"rauf123456");
        rg.clickFunction(rg.registerBtn2);


    }

    @Then("user should be register successfully")
    public void userShouldRegisterSuccessfully() {

        rg.verifiedContainsTextFunction(rg.successRgstr,
        "Your account was created successfully. You are now logged in.");

    }

}
