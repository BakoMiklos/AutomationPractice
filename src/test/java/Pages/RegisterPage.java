package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class RegisterPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Switch')]")
    public WebElement switchToElement;
    @FindBy(xpath = "//a[contains(text(),'Frames')]")
    public WebElement frameElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']")
    public WebElement firstNameElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']")
    public WebElement lastNameElement;
    @FindBy(xpath = "//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@rows='3']")
    public WebElement adressElement;
    @FindBy(xpath = "//div[@id='eid']/input[@type='email']")
    public WebElement emailElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='tel']")
    public WebElement telElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/label/input[@value='Male']")
    public WebElement gendreElement;
    @FindBy(id = "checkbox2")
    public WebElement hobbyElement;
    @FindBy(id = "Skills")
    public WebElement skillElement;
    @FindBy(id = "country")
    public WebElement countryElement;
    @FindBy(id = "yearbox")
    public WebElement yearElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-xs-3 col-sm-3']/select[@placeholder='Month']")
    public WebElement monthElement;
    @FindBy(id = "daybox")
    public WebElement dayElement;
    @FindBy(id = "msdd")
    public WebElement languageElement;
    @FindBy(id = "firstpassword")
    public WebElement firstPasswElement;
    @FindBy(id = "secondpassword")
    public WebElement secondPasswElement;
    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a")
    public WebElement chooseLanguageElement;
    @FindBy(id = "imagesrc")
    public WebElement imageElement;
    @FindBy(xpath = "//a[contains(text(),'Windows')]")
    public WebElement windowElement;



    public void goToFramePage(){
        elementMethods.HoverElement(switchToElement);
        elementMethods.ClickElement(frameElement);
        driver.navigate().to("http://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowPage(){
        elementMethods.HoverElement(switchToElement);
        elementMethods.ClickElement(windowElement);
        driver.navigate().to("http://demo.automationtesting.in/Windows.html");
    }

    public void registerProcess(HashMap<String, String> values){
        elementMethods.FillElement(firstNameElement,values.get("firstName"));
        elementMethods.FillElement(lastNameElement,values.get("lastName"));
    }

}
