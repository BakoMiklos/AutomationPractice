package Tests;

import Base.SharedData;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class FrameTest extends SharedData {
    public IndexPage indexPage;
    public RegisterPage registerPage;
    public FramePage framePage;

    @Test
    public void TestAutomat() {

        indexPage = new IndexPage(driver);
        registerPage = new RegisterPage(driver);
        framePage = new FramePage(driver);

        indexPage.ValidateIndexPage();
        indexPage.clickSkipSignIn();

        registerPage.goToFramePage();

        framePage.singleFrameProces("Salut");
        framePage.multipleFrameProces("Buna ziua");

    }
}
