package Tests;

import Base.SharedData;
import Help.AlertMetods;
import Help.ElementMetods;
import Help.PageMetods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends SharedData {
    public ElementMetods elementMetods;
    public PageMetods pageMetods;
    public AlertMetods alertMetods;

    @Test
    public void TestAutomat() {
        elementMetods = new ElementMetods(driver);
        pageMetods = new PageMetods(driver);
        alertMetods = new AlertMetods(driver);

        Assert.assertEquals("Index", driver.getTitle());

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        SkipElement.click();

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        elementMetods.HoverElement(SwitchToElement);

        WebElement AlertsElement = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
        AlertsElement.click();

        pageMetods.GoToSpecificUrl("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptionsElement = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li/a"));
        AlertOptionsElement.get(0).click();

        WebElement AlertOkButton = driver.findElement(By.xpath("//div[@id='OKTab']/button"));
        AlertOkButton.click();
        alertMetods.AcceptAlert();

        AlertOptionsElement.get(1).click();

        WebElement CancelButtonElement = driver.findElement(By.xpath("//div[@id='CancelTab']/button"));
        CancelButtonElement.click();
        alertMetods.CancelAlert();

        AlertOptionsElement.get(2).click();

        WebElement TextBoxButton = driver.findElement(By.xpath("//div[@id='Textbox']/button"));
        TextBoxButton.click();
        alertMetods.FillAcceptAlert("Salut");

    }
}
