package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedData {
    private WebDriver driver;

    public void initiateDriver(){
        //setam chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //deschidem un browser chrome
        driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Index.html");
        //marim browserul
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser(){
        driver.quit();
    }
}
