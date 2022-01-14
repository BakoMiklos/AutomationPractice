package Tests;

import Base.SharedData;
import Help.ElementMetods;
import Help.PageMetods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends SharedData {
    public PageMetods pageMetods;
    public ElementMetods elementMetods;

    @Test
    public void TestAutomat(){
        pageMetods = new PageMetods(driver);
        elementMetods = new ElementMetods(driver);

        pageMetods.ValidateTitlePage("Index");

        WebElement SignInElement = driver.findElement(By.id("btn1"));
        elementMetods.ClickElement(SignInElement);

        pageMetods.ValidateTitlePage("SignIn");

        WebElement EmailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String EmailValue = "bakomiklos@yahoo.com";
        elementMetods.FillElement(EmailElement,EmailValue);

        WebElement PasswordElement = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String PasswordValue = "123456";
        elementMetods.FillElement(PasswordElement,PasswordValue);

        WebElement EnterElement = driver.findElement(By.id("enterbtn"));
        elementMetods.ClickElement(EnterElement);

        WebElement ErrorMessageElement = driver.findElement(By.id("errormsg"));
        elementMetods.ValidateElementMessage(ErrorMessageElement,"Invalid User Name or PassWord");

        //asta i un comment
//        driver.quit();

    }


}
