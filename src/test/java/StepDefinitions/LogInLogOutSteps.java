package StepDefinitions;

import Pages.LogIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInLogOutSteps {

    LogIn tr = new LogIn();

    @When("enter username and password value to login")
    public void enteringUsernameAndPasswordValueToLogin() {
        tr.sendKeysFunction(tr.username,"rafan444");
        tr.sendKeysFunction(tr.password,"rauf123456");
        tr.clickFunction(tr.logInBtn);

    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
        tr.verifiedContainsTextFunction(tr.visibleName,"Rauf Zamanli");
    }


    @When("enter username and invalid password value to login")
    public void enteringUsernameAndInvalidPasswordValueToLogin() {
        tr.sendKeysFunction(tr.username,"rafan444");
        tr.sendKeysFunction(tr.password,"asdasd561");
        tr.clickFunction(tr.logInBtn);

    }

    @Then("user should not login successfully")
    public void userShouldNotLoginSuccessfully() {

        tr.verifiedContainsTextFunction(tr.errorMessage,"Error!");
    }

    @When("enter invalid username and password value to login")
    public void enteringInvalidUsernameAndPasswordValueToLogin() {

        tr.sendKeysFunction(tr.username,"rauf6587");
        tr.sendKeysFunction(tr.password,"rauf123456");
        tr.clickFunction(tr.logInBtn);
    }
}
