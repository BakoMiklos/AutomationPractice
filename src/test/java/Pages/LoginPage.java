package Pages;

import Help.ElementMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class LoginPage {

    public WebDriver driver;
    public PageMethods pageMetods;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        pageMetods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='E mail']")
    public WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordElement;
    @FindBy(id = "enterbtn")
    public WebElement enterElement;
    @FindBy(id = "errormsg")
    public WebElement messageElement;

    public void ValidateSignInPage(){
        pageMetods.ValidateTitlePage("SignIn");
    }

    public void loginInvalid(HashMap<String, String> values){
        elementMethods.FillElement(emailElement, values.get("email"));
        elementMethods.FillElement(passwordElement, values.get("password"));
        elementMethods.ClickElement(enterElement);
        elementMethods.ValidateElementMessage(messageElement, values.get("message"));
    }
}
