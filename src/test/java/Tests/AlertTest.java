package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest {
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

        WebElement AlertsElement = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
        AlertsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptionsElement = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li/a"));
        AlertOptionsElement.get(0).click();

        WebElement AlertOkButton = driver.findElement(By.xpath("//div[@id='OKTab']/button"));
        AlertOkButton.click();
        Alert OK = driver.switchTo().alert();
        OK.accept();

        AlertOptionsElement.get(1).click();

        WebElement CancelButtonElement = driver.findElement(By.xpath("//div[@id='CancelTab']/button"));
        CancelButtonElement.click();
        Alert Cancel = driver.switchTo().alert();
        Cancel.dismiss();

        AlertOptionsElement.get(2).click();

        WebElement TextBoxButton = driver.findElement(By.xpath("//div[@id='Textbox']/button"));
        TextBoxButton.click();
        Alert TextBox = driver.switchTo().alert();
        TextBox.sendKeys("Bun Venit");
        TextBox.accept();
    }
}
