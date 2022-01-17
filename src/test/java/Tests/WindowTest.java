package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.PageMethods;
import Help.WindowMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WindowTest extends SharedData {
    public WindowMethods windowMetods;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    @Test
    public void TestAutomat() {
        windowMetods = new WindowMethods(driver);
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);


        pageMethods.ValidateTitlePage("Index");

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipElement);

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        elementMethods.HoverElement(SwitchToElement);

        WebElement WindowsElement = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
        elementMethods.ClickElement(WindowsElement);

        pageMethods.GoToSpecificUrl("http://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowOptionElement = driver.findElements(By.xpath("//div[@class='tabpane pullleft']/ul/li/a"));
        WindowOptionElement.get(0).click();

        WebElement ClickButtonElement = driver.findElement(By.xpath("//div[@id='Tabbed']//button"));
        elementMethods.ClickElement(ClickButtonElement);
        System.out.println("Titlul curent :"+driver.getTitle());

        windowMetods.SwitchToSpecificWindow(1);
        windowMetods.CloseCurrentWindow();
        windowMetods.SwitchToSpecificWindow(0);
        WindowOptionElement.get(1).click();

        WebElement ButtonWindowElement = driver.findElement(By.xpath("//div[@id='Seperate']//button"));
        elementMethods.ClickElement(ButtonWindowElement);

        windowMetods.SwitchToSpecificWindow(1);
        windowMetods.CloseCurrentWindow();
        windowMetods.SwitchToSpecificWindow(0);
        WindowOptionElement.get(2).click();

        WebElement ButtonTabsElement = driver.findElement(By.xpath("//div[@id='Multiple']//button"));
        ButtonTabsElement.click();
        windowMetods.SwitchToSpecificWindow(2);
        windowMetods.CloseCurrentWindow();
        windowMetods.SwitchToSpecificWindow(1);
        windowMetods.CloseCurrentWindow();
        windowMetods.SwitchToSpecificWindow(0);

    }

}
