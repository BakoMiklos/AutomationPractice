package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest {
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

        //fac tema elementele de mai sus

        WebElement SkilElement = driver.findElement(By.id("Skills"));
        Select SkilSelect = new Select(SkilElement);
        SkilSelect.selectByVisibleText("Android");

        WebElement Yearelement = driver.findElement(By.id("yearbox"));
        Select YearSelect = new Select(Yearelement);
        YearSelect.selectByValue("1985");

        WebElement LanguageElement = driver.findElement(By.id("msdd"));
        LanguageElement.click();

        List<WebElement> LanguageElements = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        for (Integer Index=0;Index<LanguageElements.size();Index ++){
            if (LanguageElements.get(Index).getText().equals("English") || LanguageElements.get(Index).getText().equals("Dutch")){
                LanguageElements.get(Index).click();
            }
        }

        WebElement ImageElement = driver.findElement(By.id("imagesrc"));
        ImageElement.sendKeys("C:\\Automation\\ComenziGit.txt");
    }
}
