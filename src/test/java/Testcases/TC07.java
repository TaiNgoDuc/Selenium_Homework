package Testcases;

import PageObjects.GenerateData;
import PageObjects.HomePage;
import PageObjects.QAPage;
import PageObjects.RegisterPage;
import org.testng.annotations.Test;

public class TC07 extends TestBase {

    HomePage homePage = new HomePage();
    QAPage qaPage = new QAPage();
    RegisterPage registerPage = new RegisterPage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) {
        qaPage.open();
        qaPage.moveToRegisterTab();

        String email = GenerateData.generateRandomEmail(dataCsv[0].toString());
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);



    }
}
