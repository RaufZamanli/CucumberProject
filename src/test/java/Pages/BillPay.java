package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPay extends Parent{

    public BillPay(){

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (linkText = "Bill Pay")
    public WebElement billPaybtn;

    @FindBy(css = "[name='payee.name']")
    public WebElement payeeName;

    @FindBy(css = "[name='payee.address.street']")
    public WebElement address;

    @FindBy(css = "[name='payee.address.city']")
    public WebElement city;

    @FindBy(css = "[name='payee.address.state']")
    public WebElement state;

    @FindBy(css = "[name='payee.address.zipCode']")
    public WebElement zipCode;

    @FindBy(css = "[name='payee.phoneNumber']")
    public WebElement phone;

    @FindBy(css = "[name='payee.accountNumber']")
    public WebElement account;

    @FindBy(css = "[name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(css = "[name='amount']")
    public WebElement amount;

    @FindBy(css = "[value='Send Payment']")
    public WebElement paymentBtn;

    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement successPymnt;


    public WebElement getWebElement(String button){

    switch (button){

        case "payeeName":return payeeName;
        case "address":return address;
        case "city":return city;
        case "state":return state;
        case "zipCode":return zipCode;
        case "phone":return phone;
        case "account":return account;
        case "verifyAccount":return verifyAccount;
        case "amount":return amount;
     }

     return null;
    }

}
