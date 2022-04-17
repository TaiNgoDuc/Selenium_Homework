package Testcases;

import Common.Constant;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC14 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) {

        homePage.moveToRegisterTab();

        String email = GenerateData.generateRandomEmail(dataCsv[0].toString());
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);
        homePage.gotoLoginPage();
        loginPage.login(email, password);

        homePage.moveToBookTicketTab();

        String departDate = dataCsv[4].toString();
        String departFrom = dataCsv[5].toString();
        String arriveAt = dataCsv[6].toString();
        String seatType = dataCsv[7].toString();
        String ticketAmount = dataCsv[8].toString();
//        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
//        js.executeScript("arguments[0].scrollIntoView()", bookTicketPage.getBtnBookTicket());

        bookTicketPage.bookTicket(departDate, departFrom, arriveAt, seatType, ticketAmount);
    }
}
