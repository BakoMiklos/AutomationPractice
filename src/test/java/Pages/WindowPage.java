package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Windows')]")
    private WebElement windowElement;
    @FindBy(xpath = "//div[@class='tabpane pullleft']/ul/li/a")
    private List<WebElement> windowOptionElement;
    @FindBy(xpath = "//div[@id='Tabbed']//button")
    private WebElement clickButtonElement;
    @FindBy(xpath = "//div[@id='Seperate']//button")
    private WebElement buttonWindowElement;
    @FindBy(xpath = "//div[@id='Multiple']//button")
    private WebElement buttonTabsElement;

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
