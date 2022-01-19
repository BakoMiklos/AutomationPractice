package Tests;

import Base.Hooks;
import Base.SharedData;
import Help.ElementMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import org.junit.Test;

public class WindowTest extends Hooks {

    public IndexPage indexPage;
    public WindowPage windowPage;
    public RegisterPage registerPage;

    @Test
    public void TestAutomat() {

        indexPage = new IndexPage(getDriver());
        windowPage = new WindowPage(getDriver());
        registerPage = new RegisterPage(getDriver());

        indexPage.ValidateIndexPage();
        indexPage.clickSkipSignIn();

        registerPage.goToWindowPage();

        windowPage.dealWithTab();
        windowPage.dealWithWindow();
        windowPage.dealWithTabs();
    }

}
