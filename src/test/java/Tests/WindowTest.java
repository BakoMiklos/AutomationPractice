package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class WindowTest {

    public WebDriver driver;

    @Test
    public void TestAutomat() {
        //setam chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //deschidem un browser chrome
        driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Index.html");
        //marim browserul
        driver.manage().window().maximize();

        Assert.assertEquals("Index", driver.getTitle());

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        SkipElement.click();

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions SwitchToAction = new Actions(driver);
        SwitchToAction.moveToElement(SwitchToElement).perform();

        WebElement WindowsElement = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
        WindowsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowOptionElement = driver.findElements(By.xpath("//div[@class='tabpane pullleft']/ul/li/a"));
        WindowOptionElement.get(0).click();

        WebElement ClickButtonElement = driver.findElement(By.xpath("//div[@id='Tabbed']//button"));
        ClickButtonElement.click();
        System.out.println("Titlul curent :"+driver.getTitle());

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println("Titlul curent :"+driver.getTitle());
        driver.close();
        driver.switchTo().window(Tabs.get(0));
        WindowOptionElement.get(1).click();

        WebElement ButtonWindowElement = driver.findElement(By.xpath("//div[@id='Seperate']//button"));
        ButtonWindowElement.click();
        ArrayList<String> Windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Windows.get(1));
        System.out.println("Titlul curent :"+driver.getTitle());
        driver.close();
        driver.switchTo().window(Windows.get(0));
        WindowOptionElement.get(2).click();

        WebElement ButtonTabsElement = driver.findElement(By.xpath("//div[@id='Multiple']//button"));
        ButtonTabsElement.click();
        ArrayList<String> MultipleTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(MultipleTabs.get(2));
        System.out.println("Titlul curent :"+driver.getTitle());
        driver.close();
        driver.switchTo().window(MultipleTabs.get(1));
        System.out.println("Titlul curent :"+driver.getTitle());
        driver.close();
        driver.switchTo().window(MultipleTabs.get(0));
        driver.quit();
    }

}
