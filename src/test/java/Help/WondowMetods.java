package Help;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class WondowMetods {
    public WebDriver driver;

    public WondowMetods(WebDriver driver) {
        this.driver = driver;
    }

    public void SwitchToSpecificWindow(Integer Index){
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(Index));
        System.out.println("Titlul curent :"+driver.getTitle());
    }

    public void CloseCurrentWindow(){
        driver.close();
    }
}
