package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterTest extends SharedData {
    public PageMethods pageMetods;
    public ElementMethods elementMethods;

    @Test
    public void TestAutomat() {

//        pageMetods = new PageMethods(driver);
//        elementMethods = new ElementMethods(driver);
//
//        pageMetods.ValidateTitlePage("Index");
//
//        WebElement SkipElement = driver.findElement(By.id("btn2"));
//        elementMethods.ClickElement(SkipElement);
//
//        WebElement FirstNameElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']"));
//        elementMethods.FillElement(FirstNameElement,"Bako");
//
//        WebElement LastNameElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']"));
//        elementMethods.FillElement(LastNameElement,"Miklos");
//
//        WebElement AddressElement = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@rows='3']"));
//        elementMethods.FillElement(AddressElement,"Str. Fabricii nr 33");
//
//        WebElement EmailElement = driver.findElement(By.xpath("//div[@id='eid']/input[@type='email']"));
//        elementMethods.FillElement(EmailElement,"Jointerul@gmail.com");
//
//        WebElement TelElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='tel']"));
//        elementMethods.FillElement(TelElement,"0747123456");
//
//        WebElement GendreElement = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label/input[@value='Male']"));
//        elementMethods.ClickElement(GendreElement);
//
//        WebElement HobbyElement = driver.findElement(By.id("checkbox2"));
//        elementMethods.ClickElement(HobbyElement);
//
//        WebElement SkilElement = driver.findElement(By.id("Skills"));
//        elementMethods.SelectTextElement(SkilElement,"Android");
//
//        WebElement CountryElement = driver.findElement(By.id("country"));
//        elementMethods.SelectTextElement(CountryElement,"India");
//
//        WebElement Yearelement = driver.findElement(By.id("yearbox"));
//        elementMethods.SelectValueElement(Yearelement,"1985");
//
//        WebElement MonthElement = driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 col-sm-3']/select[@placeholder='Month']"));
//        elementMethods.SelectTextElement(MonthElement,"July");
//
//        WebElement DayElement = driver.findElement(By.id("daybox"));
//        elementMethods.SelectValueElement(DayElement,"26");
//
//        WebElement LanguageElement = driver.findElement(By.id("msdd"));
//        elementMethods.ClickElement(LanguageElement);
//
//        WebElement PassswordElement = driver.findElement(By.id("firstpassword"));
//        elementMethods.FillElement(PassswordElement,"123456");
//
//        WebElement SecondPassswordElement = driver.findElement(By.id("secondpassword"));
//        elementMethods.FillElement(SecondPassswordElement,"123456");
//
//        List<WebElement> LanguageElements = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
//        for (Integer Index=0;Index<LanguageElements.size();Index ++){
//            if (LanguageElements.get(Index).getText().equals("Arabic") || LanguageElements.get(Index).getText().equals("Danish")){
//                LanguageElements.get(Index).click();
//            }
//        }
//
//        elementMethods.ClickElement(GendreElement);
//
//        WebElement ImageElement = driver.findElement(By.id("imagesrc"));
//        ImageElement.sendKeys("C:\\Automation\\ComenziGit.txt");

    }
}
