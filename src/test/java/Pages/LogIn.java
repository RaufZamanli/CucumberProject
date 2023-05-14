package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends Parent{

    public LogIn(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[name='username']")
    public WebElement username;

    @FindBy(css = "[name='password']")
    public WebElement password;

    @FindBy(css = "[value='Log In']")
    public WebElement logInBtn;

    @FindBy(css = "[class='smallText']")
    public WebElement visibleName;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errorMessage;

}
