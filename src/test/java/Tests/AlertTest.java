package Tests;

import Base.Hooks;
import Base.SharedData;
import Pages.AlertPage;
import Pages.IndexPage;
import org.junit.Test;

public class AlertTest extends Hooks {
    public IndexPage indexPage;
    public AlertPage alertPage;


    @Test
    public void TestAutomat() {
        indexPage = new IndexPage(getDriver());
        alertPage = new AlertPage(getDriver());

        indexPage.ValidateIndexPage();
        indexPage.clickSkipSignIn();
        alertPage.goToAlertPage();
        alertPage.clickOkButtonElement();
        alertPage.clickCancelButtonElement();
        alertPage.textBoxElement(testValues.get("alertTextBox"));



    }
}
