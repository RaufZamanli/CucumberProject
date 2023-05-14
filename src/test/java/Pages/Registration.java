package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends Parent{


    public  Registration(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtn;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement adress;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement SSN;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmedPswd;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement successRgstr;

    @FindBy(css = "input[value='Register']")
    public WebElement registerBtn2;




}
