package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimetablePage extends BasePage {

    private By txtTrainTimeTableHeader = By.cssSelector("div#content h1");
    private By _btnCheckPrice = By.xpath("//td[text()='Đà Nẵng']/following-sibling::td[text()='Sài Gòn']/..//a[contains(@href, 'Price')]");


    public WebElement getTxtTrainTimeTableHeader() {
        return Constant.DRIVER.findElement(txtTrainTimeTableHeader);
    }
    public WebElement getBtnCheckPrice() { return Constant.DRIVER.findElement(_btnCheckPrice); }



    public String getTrainTimeTableHeaderText() {
        return getTxtTrainTimeTableHeader().getText();
    }
    public void checkPrice() {
        this.getBtnCheckPrice().click();
    }
}
