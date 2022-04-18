package Testcases;

import Common.Constant;
import Common.Log;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC16 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) throws InterruptedException {

        homePage.moveToQATab();

        Log.info("Go to QA page");

        qaPage.moveToRegisterTab();

        Log.info("Go to Register page");

        String email = GenerateData.generateRandomEmail(dataCsv[0].toString());
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);

        Log.info("Register account");

        homePage.gotoLoginPage();

        Log.info("Go to Login page");

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login(email, password);

        Log.info("Login with created information");

        homePage.moveToBookTicketTab();

        Log.info("Go to Book Ticket page");

        String departDate = dataCsv[4].toString();
        String departFrom = dataCsv[5].toString();
        String arriveAt = dataCsv[6].toString();
        String seatType = dataCsv[7].toString();
        String ticketAmount = dataCsv[8].toString();

        bookTicketPage.bookTicket(departDate, departFrom, arriveAt, seatType, ticketAmount);

        Log.info("Book a ticket with csv's data");

        bookTicketPage.moveToMyTicketTab();

        Log.info("Go to My Ticket page");

        myTicketPage.pressBtnCancel();

        Log.info("Cancel ticket");

        Thread.sleep(3);

    }

}
