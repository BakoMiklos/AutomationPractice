package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement messageElement;

    public void ValidateSignInPage(){
        pageMethods.ValidateTitlePage("SignIn");
    }

    public void loginInvalid(HashMap<String, String> values){
        elementMethods.FillElement(emailElement, values.get("email"));
        elementMethods.FillElement(passwordElement, values.get("password"));
        elementMethods.ClickElement(enterElement);
        elementMethods.ValidateElementMessage(messageElement, values.get("message"));
    }
}
