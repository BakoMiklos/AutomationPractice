package Base;

import PropertyUtility.PropertiesFile;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends SharedData {

    public HashMap<String, String> testValues;

    @Before
    public void setuUpTest(){
        String testName = this.getClass().getSimpleName();
        initiateDriver();
        PropertiesFile testData = new PropertiesFile("inputData/"+testName+"");
        testValues = testData.getAllKeyValues();
    }

    @After
    public void clearEnvironment(){
        quitBrowser();
    }
}
