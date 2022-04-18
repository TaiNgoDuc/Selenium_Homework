package Testcases;

import Common.Log;
import PageObjects.GenerateData;
import PageObjects.HomePage;
import PageObjects.QAPage;
import PageObjects.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10 extends TestBase {

    QAPage qaPage = new QAPage();
    RegisterPage registerPage = new RegisterPage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) {
        qaPage.open();
        qaPage.moveToRegisterTab();

        Log.info("Go to Register page");

        String email = dataCsv[0].toString();
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);

        String actualMsg = registerPage.setErrorRegister();
        String expectedMsg = "This email address is already in use.";

        Assert.assertEquals(actualMsg, expectedMsg);

        Log.info("Register account of Railway website");


    }
}
