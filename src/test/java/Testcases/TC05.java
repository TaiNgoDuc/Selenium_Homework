package Testcases;

import Common.Constant;
import PageObjects.LoginPage;
import PageObjects.QAPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC05 extends TestBase {

    @Test
    public void TC01() {
        QAPage qaPage = new QAPage();
        qaPage.open();

        for (int i = 0; i< 3; i++) {

            LoginPage loginPage = qaPage.gotoLoginPage();

            JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
            js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

            loginPage.login2(Constant.USERNAME, null);
        }

        System.out.print("Login with valid username and blank password field for several time");

    }
}
