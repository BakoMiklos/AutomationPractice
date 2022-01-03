package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public WebDriver driver;

    @Test
    public void TestAutomat(){
        //setam chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //deschidem un browser chrome
        driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Index.html");
        //marim browserul
        driver.manage().window().maximize();

        Assert.assertEquals("Index",driver.getTitle());

        WebElement SignInElement = driver.findElement(By.id("btn1"));
        SignInElement.click();

        Assert.assertEquals("SignIn",driver.getTitle());

        WebElement EmailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String EmailValue = "bakomiklos@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        WebElement PasswordElement = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String PasswordValue = "123456";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterElement = driver.findElement(By.id("enterbtn"));
        EnterElement.click();

        WebElement ErrorMessageElement = driver.findElement(By.id("errormsg"));
        Assert.assertEquals("Invalid User Name or PassWord",ErrorMessageElement.getText());

        //asta i un comment
        driver.quit();

    }


}
