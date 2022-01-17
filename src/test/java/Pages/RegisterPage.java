package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void goToFramePage(){
        elementMethods.HoverElement(switchToElement);
        elementMethods.ClickElement(frameElement);
        driver.navigate().to("http://demo.automationtesting.in/Frames.html");
    }
}
