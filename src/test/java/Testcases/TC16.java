package Testcases;

import Common.Constant;
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

        qaPage.moveToRegisterTab();

        String email = GenerateData.generateRandomEmail(dataCsv[0].toString());
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);
        homePage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());
        loginPage.login(email, password);

        homePage.moveToBookTicketTab();

        String departDate = dataCsv[4].toString();
        String departFrom = dataCsv[5].toString();
        String arriveAt = dataCsv[6].toString();
        String seatType = dataCsv[7].toString();
        String ticketAmount = dataCsv[8].toString();

        bookTicketPage.bookTicket(departDate, departFrom, arriveAt, seatType, ticketAmount);

        bookTicketPage.moveToMyTicketTab();

        myTicketPage.pressBtnCancel();

        Thread.sleep(3);

        System.out.print("Cancel a ticket");


    }

}
