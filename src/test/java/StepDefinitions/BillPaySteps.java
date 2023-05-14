package StepDefinitions;

import Pages.BillPay;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BillPaySteps {

    BillPay bp = new BillPay();
    @And("click on Bill Pay button")
    public void clickOnBillPayButton() {
        bp.clickFunction(bp.billPaybtn);
    }

    @And("user entering all values in given menu")
    public void userEnteringAllValuesInGivenMenu(DataTable dt) {

        List<List<String>> values = dt.asLists(String.class);

        for (int i = 0; i < values.size(); i++) {
            WebElement element = bp.getWebElement(values.get(i).get(0));
            for (int j = 1; j < values.get(i).size(); j++) {
                bp.sendKeysFunction(element,values.get(i).get(j));
            }

        }
        bp.clickFunction(bp.paymentBtn);
    }

    @Then("payment should be successful")
    public void paymentShouldBeSuccessful() {

        bp.verifiedContainsTextFunction(bp.successPymnt,"Bill Payment Complete");
    }
}
