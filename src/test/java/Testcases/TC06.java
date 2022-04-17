package Testcases;

import Common.Constant;
import PageObjects.ContactPage;
import PageObjects.LoginPage;
import PageObjects.QAPage;
import org.testng.annotations.Test;

public class TC06 extends TestBase {


    @Test
    public void TC01() {
        QAPage qaPage = new QAPage();
        qaPage.open();

        LoginPage loginPage = qaPage.gotoLoginPage();

        loginPage.login2(Constant.USERNAME, Constant.PASSWORD);

        loginPage.moveToContactTab();

        ContactPage contactPage = new ContactPage();
        contactPage.logoutPage();

    }
}
