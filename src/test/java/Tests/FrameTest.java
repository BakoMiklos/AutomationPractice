package Tests;

import Base.Hooks;
import Base.SharedData;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class FrameTest extends Hooks {
    public IndexPage indexPage;
    public RegisterPage registerPage;
    public FramePage framePage;

    @Test
    public void TestAutomat() {

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        framePage = new FramePage(getDriver());
        indexPage.ValidateIndexPage();
        indexPage.clickSkipSignIn();
        registerPage.goToFramePage();
        framePage.singleFrameProces(testValues.get("message1"));
        framePage.multipleFrameProces(testValues.get("message2"));

    }
}
