package Testcases;

import PageObjects.QAPage;
import PageObjects.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 extends TestBase {

    QAPage qaPage = new QAPage();
    RegisterPage registerPage = new RegisterPage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) {
        qaPage.open();
        qaPage.moveToRegisterTab();

        String email = dataCsv[0].toString();

        registerPage.register(email, "", "", "");

        String actualMsg1 = registerPage.setErrorRegister();
        String expectedMsg1 = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg1, expectedMsg1);

        String actualMsg2 = registerPage.setInvalidPassword();
        String expectedMsg2 = "Invalid password length";

        Assert.assertEquals(actualMsg2, expectedMsg2);


        String actualMsg3 = registerPage.setInvalidID();
        String expectedMsg3 = "Invalid ID length";

        Assert.assertEquals(actualMsg3, expectedMsg3);

        System.out.print("Register with only email");

    }
}
