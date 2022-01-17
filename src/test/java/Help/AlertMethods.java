package Help;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {
    public WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void AcceptAlert(){
        Alert OK = driver.switchTo().alert();
        OK.accept();
    }

    public void CancelAlert(){
        Alert OK = driver.switchTo().alert();
        OK.dismiss();
    }

    public void FillAcceptAlert(String Value){
        Alert OK = driver.switchTo().alert();
        OK.sendKeys(Value);
        OK.accept();
    }
}
