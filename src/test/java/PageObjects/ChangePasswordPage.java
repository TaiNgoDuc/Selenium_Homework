package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends BasePage {

    private final By _txtCurrentPassword = By.xpath("//input[@id='currentPassword']");
    private final By _txtNewPassword = By.xpath("//input[@id='newPassword']");
    private final By _txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By _btnChangePassword = By.xpath("//input[@value='Change Password']");


    public WebElement getTxtCurrentPassword() {
        return Constant.DRIVER.findElement(_txtCurrentPassword);
    }

    public WebElement getTxtNewPassword() {
        return Constant.DRIVER.findElement(_txtNewPassword);
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.DRIVER.findElement(_txtConfirmPassword);
    }

    public WebElement getBtnChangePassword() {
        return Constant.DRIVER.findElement(_btnChangePassword);
    }

    public ChangePasswordPage changePasswordPage(String currentPassword, String newPassword, String confirmPassword) {
        this.getTxtCurrentPassword().sendKeys(currentPassword);
        this.getTxtNewPassword().sendKeys(newPassword);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getBtnChangePassword().click();

        return new ChangePasswordPage();
    }
}
