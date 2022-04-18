package Testcases;

import Common.Constant;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends TestBase {

    HomePage homePage = new HomePage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    TicketPricePage ticketPricePage = new TicketPricePage();
    TimetablePage timetablePage = new TimetablePage();

    @Test(dataProvider = "dataLogin")
    public void TC01(Object[] dataCsv) {

        homePage.moveToRegisterTab();

        String email = GenerateData.generateRandomEmail(dataCsv[0].toString());
        String password = dataCsv[1].toString();
        String confirmPassword = dataCsv[2].toString();
        String pid = dataCsv[3].toString();

        registerPage.register(email, password, confirmPassword, pid);
        homePage.gotoLoginPage();

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", loginPage.getBtnLogin());

        loginPage.login(email, password);

        homePage.moveToTimetableTab();

        JavascriptExecutor js1 = (JavascriptExecutor) Constant.DRIVER;
        js1.executeScript("arguments[0].scrollIntoView()", timetablePage.getBtnCheckPrice());

        timetablePage.checkPrice();


        String actualMsg1 = ticketPricePage.setLblPriceHS();
        String expectedMsg1 = "310000";

        Assert.assertEquals(actualMsg1, expectedMsg1);

        String actualMsg2 = ticketPricePage.setLblPriceSS();
        String expectedMsg2 = "335000";

        Assert.assertEquals(actualMsg2, expectedMsg2);

        String actualMsg3 = ticketPricePage.setLblPriceSSC();
        String expectedMsg3 = "360000";

        Assert.assertEquals(actualMsg3, expectedMsg3);

        String actualMsg4 = ticketPricePage.setLblPriceHB();
        String expectedMsg4 = "410000";

        Assert.assertEquals(actualMsg4, expectedMsg4);

        String actualMsg5 = ticketPricePage.setLblPriceSB();
        String expectedMsg5 = "460000";

        Assert.assertEquals(actualMsg5, expectedMsg5);

        String actualMsg6 = ticketPricePage.setLblPriceSBC();
        String expectedMsg6 = "510000";

        Assert.assertEquals(actualMsg6, expectedMsg6);


        System.out.print("Check price of Da Nang to Sai Gon trip ");
    }
}
