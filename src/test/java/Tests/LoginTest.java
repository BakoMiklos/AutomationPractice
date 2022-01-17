package Tests;

import Base.SharedData;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends SharedData {
    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void TestAutomat(){
        indexPage = new IndexPage(driver);
        loginPage = new LoginPage(driver);

        indexPage.ValidateIndexPage();
        indexPage.clickSignIn();

        loginPage.ValidateSignInPage();
        loginPage.loginInvalid("proba@proba.test","Proba123#","Invalid User Name or PassWord");
    }


}
