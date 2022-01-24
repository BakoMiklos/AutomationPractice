package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Alerts')]")
    private WebElement alertElement;
    @FindBy(xpath = "//ul[@class='nav nav-tabs nav-stacked']/li/a")
    private List<WebElement> alertOptionElement;
    @FindBy(xpath = "//div[@id='OKTab']/button")
    private WebElement alertOkButtonElement;
    @FindBy(xpath ="//div[@id='CancelTab']/button")
    private WebElement cancelButtonElement;
    @FindBy(xpath = "//div[@id='Textbox']/button")
    private WebElement textBoxButton;
    @FindBy(xpath = "//a[contains(text(),'Switch')]")
    private WebElement switchToElement;

    public void goToAlertPage(){
        elementMethods.HoverElement(switchToElement);
        elementMethods.ClickElement(alertElement);
        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
    }

    public void clickOkButtonElement(){
        elementMethods.ClickElement(alertOkButtonElement);
        alertMethods.AcceptAlert();
        elementMethods.ClickElement(alertOptionElement.get(1));
    }

    public void clickCancelButtonElement(){
        elementMethods.ClickElement(cancelButtonElement);
        alertMethods.CancelAlert();
        elementMethods.ClickElement(alertOptionElement.get(2));
    }

    public void textBoxElement(String value){
        elementMethods.ClickElement(textBoxButton);
        alertMethods.FillAcceptAlert(value);
    }
}


