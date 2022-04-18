package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends TestBase {

    @Test()
    public void TC01() {

        HomePage homePage = new HomePage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        Log.info("Login to Railway website");

        String actualMsg = loginPage.getWelcomeMessage();

//        System.out.print("Login with valid account");

        String expectedMsg = "Welcome " + Constant.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg);




    }
}

