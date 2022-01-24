package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Switch')]")
    private WebElement switchToElement;
    @FindBy(xpath = "//a[contains(text(),'Frames')]")
    private WebElement frameElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']")
    private WebElement firstNameElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']")
    private WebElement lastNameElement;
    @FindBy(xpath = "//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@rows='3']")
    private WebElement adressElement;
    @FindBy(xpath = "//div[@id='eid']/input[@type='email']")
    private WebElement emailElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='tel']")
    private WebElement telElement;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/label/input[@value='Male']")
    private WebElement gendreElement;
    @FindBy(id = "checkbox2")
    private WebElement hobbyElement;
    @FindBy(id = "Skills")
    private WebElement skillElement;
    @FindBy(id = "country")
    private WebElement countryElement;
    @FindBy(id = "yearbox")
    private WebElement yearElement;
    @FindBy(xpath = "//div[@class='col-md-3 col-xs-3 col-sm-3']/select[@placeholder='Month']")
    private WebElement monthElement;
    @FindBy(id = "daybox")
    private WebElement dayElement;
    @FindBy(id = "msdd")
    private WebElement languageElement;
    @FindBy(id = "firstpassword")
    private WebElement firstPasswElement;
    @FindBy(id = "secondpassword")
    private WebElement secondPasswElement;
    @FindBy(xpath = "//a[contains(text(),'Windows')]")
    private WebElement windowElement;
    @FindBy(id = "imagesrc")
    private WebElement imageElement;
    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a")
    private List<WebElement> languageOptions;


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
        elementMethods.FillElement(adressElement,values.get("adress"));
        elementMethods.FillElement(emailElement,values.get("email"));
        elementMethods.FillElement(telElement,values.get("tel"));
        elementMethods.ClickElement(gendreElement);
        elementMethods.ClickElement(hobbyElement);

    }

    public void  selectProcess(HashMap<String , String> values){
        elementMethods.SelectTextElement(skillElement,values.get("skills"));
        elementMethods.SelectTextElement(countryElement,values.get("country"));
        elementMethods.SelectValueElement(yearElement,values.get("yearbox"));
        elementMethods.SelectValueElement(monthElement,values.get("month"));
        elementMethods.SelectValueElement(dayElement,values.get("day"));
        elementMethods.ClickElement(languageElement);
        elementMethods.FillElement(firstPasswElement,values.get("firstPassw"));
        elementMethods.FillElement(secondPasswElement,values.get("secondPassw"));

        //iau valoarea si o tai dupa virgula
        List<String> languages = prepareLanguageList(values.get("languages"));
        //chem metoda care selecteaza mai multe limbi
        selectLanguage(languages);

        elementMethods.FillElement(imageElement, values.get("imagesrc"));
        elementMethods.ClickElement(gendreElement);
    }

    public void selectLanguage(String value){
        for (Integer Index=0;Index<languageOptions.size();Index ++){
            if (languageOptions.get(Index).getText().equals(value)){
                languageOptions.get(Index).click();
            }
        }
    }

    public void selectLanguage(List<String> values){
        for (Integer Index=0;Index<languageOptions.size();Index ++){
            if (values.contains(languageOptions.get(Index).getText())){
                languageOptions.get(Index).click();
            }
        }
    }

    public List<String> prepareLanguageList(String value){
        List<String> values = new ArrayList<>();
        String[] splitValue = value.split(",");
        for (int index=0;index< splitValue.length;index++){
            values.add(splitValue[index]);
        }
        return values;
    }

}
