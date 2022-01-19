package Tests;

import Base.Hooks;
import Base.SharedData;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends Hooks {
    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void TestAutomat(){
        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        indexPage.ValidateIndexPage();
        indexPage.clickSignIn();

        loginPage.ValidateSignInPage();
        loginPage.loginInvalid(testValues);
    }


}
