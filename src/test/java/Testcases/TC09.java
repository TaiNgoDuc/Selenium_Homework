package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.ChangePasswordPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBase {


    @Test
    public void TC01() {
        HomePage homePage = new HomePage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        homePage.open();

        Log.info("Go to Railway website");

        LoginPage loginPage = homePage.gotoLoginPage();

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        Log.info("Login to Railway website");

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.moveToChangePasswordTab();

        Log.info("Go to Change Password page");

        String actualMsg =  changePasswordPage.changePasswordPage(Constant.PASSWORD, Constant.WRONG_PASSWORD, Constant.WRONG_CONFIRM_PASSWORD).getWrongPassword();
        String expectedMsg = "The password confirmation does not match the new password.";

        Assert.assertEquals(actualMsg, expectedMsg);

    }
}
