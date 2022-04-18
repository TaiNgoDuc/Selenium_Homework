package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends BasePage {

    private final By _btnCancel = By.xpath("//input[@type='button']");

    public WebElement getBtnCancel() { return Constant.DRIVER.findElement(_btnCancel); }

    public MyTicketPage pressBtnCancel() {
        this.getBtnCancel().click();
        Constant.DRIVER.switchTo().alert().accept();

        return new MyTicketPage();
    }

}
