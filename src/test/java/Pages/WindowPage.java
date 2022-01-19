package Pages;

import Help.AlertMethods;
import Help.ElementMethods;
import Help.PageMethods;
import Help.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WindowPage {
    public WebDriver driver;
    public PageMethods pageMethods;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public WindowMethods windowMethods;
    public AlertPage alertPage;
    public IndexPage indexPage;

    public WindowPage(WebDriver driver) {
        this.driver = driver;

        pageMethods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        alertMethods = new AlertMethods(driver);
        windowMethods = new WindowMethods(driver);
        alertPage = new AlertPage(driver);
        indexPage = new IndexPage(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(text(),'Windows')]")
    public WebElement windowElement;
    @FindBy(xpath = "//div[@class='tabpane pullleft']/ul/li/a")
    public List<WebElement> windowOptionElement;
    @FindBy(xpath = "//div[@id='Tabbed']//button")
    public WebElement clickButtonElement;
    @FindBy(xpath = "//div[@id='Seperate']//button")
    public WebElement buttonWindowElement;
    @FindBy(xpath = "//div[@id='Multiple']//button")
    public WebElement buttonTabsElement;

    public void swichToSpecificWindow(Integer value){
        windowMethods.SwitchToSpecificWindow(value);
    }

    public void dealWithTab(){
        elementMethods.ClickElement(windowOptionElement.get(0));
        elementMethods.ClickElement(clickButtonElement);
        swichToSpecificWindow(1);
        closeCurrentWindow();
        swichToSpecificWindow(0);
    }

    public void dealWithWindow(){
        elementMethods.ClickElement(windowOptionElement.get(1));
        elementMethods.ClickElement(buttonWindowElement);
        swichToSpecificWindow(1);
        closeCurrentWindow();
        swichToSpecificWindow(0);
    }

    public void dealWithTabs(){
        elementMethods.ClickElement(windowOptionElement.get(2));
        elementMethods.ClickElement(buttonTabsElement);
        swichToSpecificWindow(2);
        closeCurrentWindow();
        swichToSpecificWindow(1);
        closeCurrentWindow();
        swichToSpecificWindow(0);
    }

    public void closeCurrentWindow(){
        windowMethods.CloseCurrentWindow();
    }
}
