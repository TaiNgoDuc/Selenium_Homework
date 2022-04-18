package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.ContactPage;
import PageObjects.LoginPage;
import PageObjects.QAPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC06 extends TestBase {


    @Test
    public void TC01() {
        QAPage qaPage = new QAPage();
        qaPage.open();

        Log.info("Go to QA page");

        LoginPage loginPage = qaPage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login2(Constant.USERNAME, Constant.PASSWORD);

        Log.info("Login to Railway website");

        loginPage.moveToContactTab();

        Log.info("Go to Contact page");

        ContactPage contactPage = new ContactPage();
        contactPage.logoutPage();

        Log.info("Logout Page");

    }
}
