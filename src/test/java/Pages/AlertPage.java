package Pages;

import Help.AlertMethods;
import Help.ElementMethods;
import Help.FrameMethods;
import Help.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage {
    public WebDriver driver;
    public PageMethods pageMethods;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;


    public AlertPage(WebDriver driver) {
        this.driver = driver;

        pageMethods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        alertMethods = new AlertMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Alerts')]")
    public WebElement alertElement;
    @FindBy(xpath = "//ul[@class='nav nav-tabs nav-stacked']/li/a")
    public List<WebElement> alertOptionElement;
    @FindBy(xpath = "//div[@id='OKTab']/button")
    public WebElement alertOkButtonElement;
    @FindBy(xpath ="//div[@id='CancelTab']/button")
    public WebElement cancelButtonElement;
    @FindBy(xpath = "//div[@id='Textbox']/button")
    public WebElement textBoxButton;
    @FindBy(xpath = "//a[contains(text(),'Switch')]")
    public WebElement switchToElement;

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


