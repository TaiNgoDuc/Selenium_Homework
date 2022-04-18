package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends TestBase {

    @Test
    public void TC01() {
        HomePage homePage = new HomePage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        String actualMsg = loginPage.login(null, Constant.PASSWORD).getErrorMessage();

        Log.info("Login to Railway website");

        String expectedMsg = "Invalid username or password. Please try again.";

        Assert.assertEquals(actualMsg, expectedMsg);
    }
}
