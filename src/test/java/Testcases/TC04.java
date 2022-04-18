package Testcases;

import Common.Constant;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC04 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    @Test
    public void TC01() {
        homePage.moveToBookTicketTab();

        LoginPage loginPage = bookTicketPage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login1(Constant.USERNAME, Constant.PASSWORD);

        System.out.print("Login with valid account from BookTicket Page");


    }
}
