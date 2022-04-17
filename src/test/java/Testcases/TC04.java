package Testcases;

import Common.Constant;
import PageObjects.*;
import org.testng.annotations.Test;

public class TC04 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    @Test
    public void TC01() {
        homePage.moveToBookTicketTab();

        LoginPage loginPage = bookTicketPage.gotoLoginPage();

        loginPage.login1(Constant.USERNAME, Constant.PASSWORD);





    }
}
