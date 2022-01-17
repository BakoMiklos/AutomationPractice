package Pages;

import Help.ElementMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public WebDriver driver;
    public PageMethods pageMetods;
    public ElementMethods elementMethods;

    //1 constructor
    public IndexPage(WebDriver driver){
        this.driver = driver;
        pageMetods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    //2 web elemente
    @FindBy(id = "btn1")
    public WebElement signInElement;
    @FindBy(id = "btn2")
    public  WebElement skipSignInELement;

    //3 metode
    public void clickSignIn(){
        elementMethods.ClickElement(signInElement);
    }

    public void clickSkipSignIn(){
        elementMethods.ClickElement(skipSignInELement);
    }

    public void ValidateIndexPage(){
        pageMetods.ValidateTitlePage("Index");
    }
}
