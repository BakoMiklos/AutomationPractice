package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMetods {
    public WebDriver driver;

    public PageMetods(WebDriver driver) {
        this.driver = driver;
    }

    public void ValidateTitlePage(String Title){
        Assert.assertEquals(Title,driver.getTitle());
    }

    public void GoToSpecificUrl(String Url){
        driver.navigate().to(Url);
    }
}
