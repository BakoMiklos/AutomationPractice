package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.FrameMethods;
import Help.PageMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FrameTest extends SharedData {
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public FrameMethods frameMethods;

    @Test
    public void TestAutomat() {
        frameMethods = new FrameMethods(driver);
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);

        pageMethods.ValidateTitlePage("Index");

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipElement);

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        elementMethods.HoverElement(SwitchToElement);

        WebElement FrameElement = driver.findElement(By.xpath("//a[contains(text(),'Frames')]"));
        elementMethods.ClickElement(FrameElement);

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        List<WebElement> FrameOptions = driver.findElements(By.cssSelector(".nav-tabs li a"));
        FrameOptions.get(0).click();

        frameMethods.SwitchFrameById("singleframe");

        WebElement InputSingle = driver.findElement(By.cssSelector("input[type='text']"));
        elementMethods.FillElement(InputSingle,"Salutare");
        frameMethods.SwitchDefaultFrame();

        FrameOptions.get(1).click();

        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        WebElement InputMultiple = driver.findElement(By.cssSelector("input[type='text']"));
        elementMethods.FillElement(InputMultiple,"Salut");

    }
}
