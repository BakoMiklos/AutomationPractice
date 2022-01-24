package Tests;

import Base.Hooks;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;

    @Test
    public void TestAutomat() {

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());

        indexPage.ValidateIndexPage();
        indexPage.clickSkipSignIn();

        registerPage.registerProcess(testValues);
        registerPage.selectProcess(testValues);


    }
}
