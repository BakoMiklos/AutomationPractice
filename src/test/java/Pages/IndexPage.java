package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver){
        super(driver);
    }

    //2 web elemente
    @FindBy(id = "btn1")
    private WebElement signInElement;
    @FindBy(id = "btn2")
    private  WebElement skipSignInELement;

    //3 metode
    public void clickSignIn(){
        elementMethods.ClickElement(signInElement);
    }

    public void clickSkipSignIn(){
        elementMethods.ClickElement(skipSignInELement);
    }

    public void ValidateIndexPage(){
        pageMethods.ValidateTitlePage("Index");
    }
}
