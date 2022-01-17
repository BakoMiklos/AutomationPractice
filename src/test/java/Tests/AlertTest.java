package Tests;

import Base.SharedData;
import Help.AlertMethods;
import Help.ElementMethods;
import Help.PageMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertTest extends SharedData {
    public ElementMethods elementMethods;
    public PageMethods pageMetods;
    public AlertMethods alertMethods;

    @Test
    public void TestAutomat() {
        elementMethods = new ElementMethods(driver);
        pageMetods = new PageMethods(driver);
        alertMethods = new AlertMethods(driver);

        pageMetods.ValidateTitlePage("Index");

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipElement);

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        elementMethods.HoverElement(SwitchToElement);

        WebElement AlertsElement = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
        elementMethods.ClickElement(AlertsElement);

        pageMetods.GoToSpecificUrl("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptionsElement = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li/a"));
        elementMethods.ClickElement(AlertOptionsElement.get(0));

        WebElement AlertOkButton = driver.findElement(By.xpath("//div[@id='OKTab']/button"));
        elementMethods.ClickElement(AlertOkButton);
        alertMethods.AcceptAlert();

        AlertOptionsElement.get(1).click();

        WebElement CancelButtonElement = driver.findElement(By.xpath("//div[@id='CancelTab']/button"));
        CancelButtonElement.click();
        alertMethods.CancelAlert();

        AlertOptionsElement.get(2).click();

        WebElement TextBoxButton = driver.findElement(By.xpath("//div[@id='Textbox']/button"));
        TextBoxButton.click();
        alertMethods.FillAcceptAlert("Salut");

    }
}
