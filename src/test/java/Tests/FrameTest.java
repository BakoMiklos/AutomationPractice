package Tests;

import Base.SharedData;
import Help.FrameMetods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FrameTest extends SharedData {
    public FrameMetods frameMetods;

    @Test
    public void TestAutomat() {
        frameMetods = new FrameMetods(driver);

        Assert.assertEquals("Index", driver.getTitle());

        WebElement SkipElement = driver.findElement(By.id("btn2"));
        SkipElement.click();

        WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions SwitchToAction = new Actions(driver);
        SwitchToAction.moveToElement(SwitchToElement).perform();

        WebElement FrameElement = driver.findElement(By.xpath("//a[contains(text(),'Frames')]"));
        FrameElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        List<WebElement> FrameOptions = driver.findElements(By.cssSelector(".nav-tabs li a"));
        FrameOptions.get(0).click();

        frameMetods.SwitchFrameById("singleframe");

        WebElement InputSingle = driver.findElement(By.cssSelector("input[type='text']"));
        InputSingle.sendKeys("Salut");
        frameMetods.SwitchDefaultFrame();

        FrameOptions.get(1).click();

        frameMetods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMetods.SwitchFrameByElement(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        WebElement InputMultiple = driver.findElement(By.cssSelector("input[type='text']"));
        InputMultiple.sendKeys("Salut");

    }
}
