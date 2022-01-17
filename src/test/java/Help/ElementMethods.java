package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementMethods {
    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickElement(WebElement Element){
        Element.click();
    }

    public void FillElement(WebElement Element,String Value){
        Element.sendKeys(Value);
    }

    public void ValidateElementMessage(WebElement Element,String Value){
        Assert.assertEquals("The text from element is not correct",Value,Element.getText());
    }

    public void SelectTextElement(WebElement Element,String Value){
        Select SkilSelect = new Select(Element);
        SkilSelect.selectByVisibleText(Value);
    }

    public void SelectValueElement(WebElement Element,String Value){
        Select SkilSelect = new Select(Element);
        SkilSelect.selectByValue(Value);
    }

    public void HoverElement(WebElement Element){
        Actions SwitchToAction = new Actions(driver);
        SwitchToAction.moveToElement(Element).perform();
    }
}
