package Testcases;

import Common.Constant;
import PageObjects.LoginPage;
import PageObjects.QAPage;
import org.testng.annotations.Test;

public class TC05 extends TestBase {

    @Test
    public void TC01() {
        QAPage qaPage = new QAPage();
        qaPage.open();

        for (int i = 0; i< 3; i++) {

            LoginPage loginPage = qaPage.gotoLoginPage();

            loginPage.login2(Constant.USERNAME, null);
        }

    }
}
