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

        WebElement FirstNameElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']"));
        FirstNameElement.click();
        String FirstNameValue = "Bako";
        FirstNameElement.sendKeys(FirstNameValue);

        WebElement LastNameElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']"));
        LastNameElement.click();
        String LastNameValue = "Miklos";
        LastNameElement.sendKeys(LastNameValue);

        WebElement AddressElement = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@rows='3']"));
        AddressElement.click();
        String AddressValue = "Str. Fabricii nr 33";
        AddressElement.sendKeys(AddressValue);

        WebElement EmailElement = driver.findElement(By.xpath("//div[@id='eid']/input[@type='email']"));
        EmailElement.click();
        String EmailValue = "Jointerul@gmail.com";
        EmailElement.sendKeys(EmailValue);

        WebElement TelElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='tel']"));
        TelElement.click();
        String TelValue = "0745123456";
        TelElement.sendKeys(TelValue);

        WebElement GendreElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label/input[@value='Male']"));
        GendreElement.click();

        WebElement HobbyElement = driver.findElement(By.id("checkbox2"));
        HobbyElement.click();

        WebElement SkilElement = driver.findElement(By.id("Skills"));
        Select SkilSelect = new Select(SkilElement);
        SkilSelect.selectByVisibleText("Android");

        WebElement CountryElement = driver.findElement(By.id("country"));
        Select CountrySelect = new Select(CountryElement);
        CountrySelect.selectByValue("India");

        WebElement Yearelement = driver.findElement(By.id("yearbox"));
        Select YearSelect = new Select(Yearelement);
        YearSelect.selectByValue("1985");

        WebElement MonthElement = driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 col-sm-3']/select[@placeholder='Month']"));
        Select MonthSelect = new Select(MonthElement);
        MonthSelect.selectByValue("July");

        WebElement DayElement = driver.findElement(By.id("daybox"));
        Select DaySelect = new Select(DayElement);
        DaySelect.selectByValue("26");

        WebElement LanguageElement = driver.findElement(By.id("msdd"));
        LanguageElement.click();

        WebElement PassswordElement = driver.findElement(By.id("firstpassword"));
        String PasswordValue = "123456";
        PassswordElement.sendKeys(PasswordValue);

        WebElement SecondPassswordElement = driver.findElement(By.id("secondpassword"));
        String SecondPasswordValue = "123456";
        SecondPassswordElement.sendKeys(SecondPasswordValue);

        List<WebElement> LanguageElements = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        for (Integer Index=0;Index<LanguageElements.size();Index ++){
            if (LanguageElements.get(Index).getText().equals("Arabic") || LanguageElements.get(Index).getText().equals("Danish")){
                LanguageElements.get(Index).click();
            }
        }

        GendreElement.click();

        WebElement ImageElement = driver.findElement(By.id("imagesrc"));
        ImageElement.sendKeys("C:\\Automation\\ComenziGit.txt");
    }
}
