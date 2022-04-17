package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    private By lnkTimetableTab = By.xpath("//a[@href='TrainTimeListPage.cshtml']");
    private By lnkTicketPriceTab = By.xpath("//a[@href='/Page/TrainPriceListPage.cshtml']");
    private By lnkBookingTicketTab = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private By lnkContactTab = By.xpath("//a[@href='/Page/Contact.cshtml']");
    private By lnkChangePasswordTab = By.xpath("//a[@href='/Account/ChangePassword.cshtml']");
    private By lnkRegisterTab = By.xpath("//a[@href='/Account/Register.cshtml']");
    private By lnkQATab = By.xpath("//a[@href='/Page/FAQ.cshtml']");
    private By lnkMyTicketTab = By.xpath("//a[@href='/Page/ManageTicket.cshtml']");

    private final By tabLogin = By.xpath("//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//a[@href='/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By lblErrorMessage = By.xpath("//p[@class='message error LoginForm']");
    private final By lblWrongPassword = By.xpath("//label[@class='validation-error']");

    public WebElement getLnkTimeTableTab() {
        return Constant.DRIVER.findElement(lnkTimetableTab);
    }
    public WebElement getLnkTicketPriceTab() {
        return Constant.DRIVER.findElement(lnkTicketPriceTab);
    }
    public WebElement getLnkBookingTicketTab() { return Constant.DRIVER.findElement(lnkBookingTicketTab); }
    public WebElement getLnkContactTab() {
        return Constant.DRIVER.findElement(lnkContactTab);
    }
    public WebElement getLnkChangePasswordTab() {
        return Constant.DRIVER.findElement(lnkChangePasswordTab);
    }
    public WebElement getLnkRegisterTab() { return Constant.DRIVER.findElement(lnkRegisterTab); }
    public WebElement getLnkQATab() { return Constant.DRIVER.findElement(lnkQATab); }
    public WebElement getLnkMyTicketTab() { return Constant.DRIVER.findElement(lnkMyTicketTab); }

    public WebElement getTabLogin() { return Constant.DRIVER.findElement(tabLogin); }
    public WebElement getTabLogout() { return Constant.DRIVER.findElement(tabLogout); }
    public WebElement getLblWelcomeMessage() { return Constant.DRIVER.findElement(lblWelcomeMessage); }
    public WebElement getLblErrorMessage() { return Constant.DRIVER.findElement(lblErrorMessage); }
    public WebElement getLblWrongPassword() { return Constant.DRIVER.findElement(lblWrongPassword); }


    public void moveToTicketPriceTab() {
        getLnkTicketPriceTab().click();
    }
    public void moveToTimetableTab() {
        getLnkTimeTableTab().click();
    }
    public void moveToBookTicketTab() { getLnkBookingTicketTab().click(); }
    public void moveToContactTab() {
        getLnkContactTab().click();
    }
    public void moveToChangePasswordTab() {
        getLnkChangePasswordTab().click();
    }
    public void moveToRegisterTab() {
        getLnkRegisterTab().click();
    }
    public void moveToQATab() {
        getLnkQATab().click();
    }
    public void moveToMyTicketTab() {
        getLnkMyTicketTab().click();
    }

    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }

    public String getErrorMessage() { return this.getLblErrorMessage().getText(); }

    public String getWrongPassword() {
        return this.getLblWrongPassword().getText();
    }

    public LoginPage gotoLoginPage() {
        this.getTabLogin().click();
        return new LoginPage();
    }

    public LoginPage logoutPage() {
        this.getTabLogout().click();
        return new LoginPage();
    }

}
