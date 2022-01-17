package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    public WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void SwitchFrameById(String Value){
        driver.switchTo().frame(Value);
    }

    public void SwitchFrameByElement(WebElement Element){
        driver.switchTo().frame(Element);
    }

    public void SwitchDefaultFrame(){
        driver.switchTo().defaultContent();
    }
}
