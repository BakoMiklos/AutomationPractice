package Pages;

import Help.ElementMethods;
import Help.FrameMethods;
import Help.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FramePage {
    public WebDriver driver;
    public PageMethods pageMetods;
    public ElementMethods elementMethods;
    public FrameMethods frameMethods;

    //1 constructor
    public FramePage(WebDriver driver){
        this.driver = driver;
        pageMetods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        frameMethods = new FrameMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".nav-tabs li a")
    public List<WebElement> frameOptions;
    @FindBy(css = "input[type='text']")
    public WebElement inputElement;

    public void singleFrameProces(String value){
        frameOptions.get(0).click();
        frameMethods.SwitchFrameById("singleframe");
        elementMethods.FillElement(inputElement,value);
        frameMethods.SwitchDefaultFrame();
    }

    public void multipleFrameProces(String value){
        frameOptions.get(1).click();

        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        elementMethods.FillElement(inputElement,value);
    }
}
