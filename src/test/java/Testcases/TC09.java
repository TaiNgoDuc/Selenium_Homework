package Testcases;

import Common.Constant;
import PageObjects.ChangePasswordPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBase {


    @Test
    public void TC01() {
        HomePage homePage = new HomePage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        loginPage.moveToChangePasswordTab();

        String actualMsg =  changePasswordPage.changePasswordPage(Constant.PASSWORD, Constant.WRONG_PASSWORD, Constant.WRONG_CONFIRM_PASSWORD).getWrongPassword();
        String expectedMsg = "The password confirmation does not match the new password.";

        Assert.assertEquals(actualMsg, expectedMsg);

    }
}
