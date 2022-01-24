package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".nav-tabs li a")
    private List<WebElement> frameOptions;
    @FindBy(css = "input[type='text']")
    private WebElement inputElement;

    public void singleFrameProces(String value){
        frameOptions.get(0).click();
        frameMethods.SwitchFrameById("singleframe");
        elementMethods.FillElement(inputElement, value);
        frameMethods.SwitchDefaultFrame();
    }

    public void multipleFrameProces(String value){
        frameOptions.get(1).click();

        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        elementMethods.FillElement(inputElement,value);
    }
}
