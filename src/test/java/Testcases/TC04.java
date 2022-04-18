package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC04 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    @Test
    public void TC01() {
        homePage.moveToBookTicketTab();

        Log.info("Go to Book ticket page");

        LoginPage loginPage = bookTicketPage.gotoLoginPage();

        Log.info("Go to Login page");

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login1(Constant.USERNAME, Constant.PASSWORD);

        Log.info("Login to Railway website");


    }
}
