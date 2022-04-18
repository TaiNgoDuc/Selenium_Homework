package Testcases;

import Common.Constant;
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

        LoginPage loginPage = qaPage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login2(Constant.USERNAME, Constant.PASSWORD);

        System.out.print("Login with valid account");

        loginPage.moveToContactTab();

        ContactPage contactPage = new ContactPage();
        contactPage.logoutPage();

        System.out.print("Logout account");

    }
}
