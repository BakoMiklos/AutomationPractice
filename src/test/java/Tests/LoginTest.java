package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends SharedData {
    public PageMethods pageMetods;
    public ElementMethods elementMethods;

    @Test
    public void TestAutomat(){
        pageMetods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);

        pageMetods.ValidateTitlePage("Index");

        WebElement SignInElement = driver.findElement(By.id("btn1"));
        elementMethods.ClickElement(SignInElement);

        pageMetods.ValidateTitlePage("SignIn");

        WebElement EmailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String EmailValue = "bakomiklos@yahoo.com";
        elementMethods.FillElement(EmailElement,EmailValue);

        WebElement PasswordElement = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String PasswordValue = "123456";
        elementMethods.FillElement(PasswordElement,PasswordValue);

        WebElement EnterElement = driver.findElement(By.id("enterbtn"));
        elementMethods.ClickElement(EnterElement);

        WebElement ErrorMessageElement = driver.findElement(By.id("errormsg"));
        elementMethods.ValidateElementMessage(ErrorMessageElement,"Invalid User Name or PassWord");

        //asta i un comment
//        driver.quit();

    }


}
