package PageObjects;


import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TicketPricePage extends BasePage {


    private By lnkCheckPrice = By.xpath("//li[text()='Đà Nẵng to Sài Gòn']/following::a[text() = 'Check Price']");
    private By _lblPriceHS = By.xpath("//td[text()= '310000']");
    private By _lblPriceSS = By.xpath("//td[text()= '335000']");
    private By _lblPriceSSC = By.xpath("//td[text()= '360000']");
    private By _lblPriceHB = By.xpath("//td[text()= '410000']");
    private By _lblPriceSB = By.xpath("//td[text()= '460000']");
    private By _lblPriceSBC = By.xpath("//td[text()= '510000']");


    public WebElement getLnkCheckPrice() {
        return Constant.DRIVER.findElement(lnkCheckPrice);
    }

    public WebElement getLblPriceHS() { return Constant.DRIVER.findElement(_lblPriceHS); }
    public WebElement getLblPriceSS() { return Constant.DRIVER.findElement(_lblPriceSS); }
    public WebElement getLblPriceSSC() { return Constant.DRIVER.findElement(_lblPriceSSC); }
    public WebElement getLblPriceHB() { return Constant.DRIVER.findElement(_lblPriceHB); }
    public WebElement getLblPriceSB() { return Constant.DRIVER.findElement(_lblPriceSB); }
    public WebElement getLblPriceSBC() { return Constant.DRIVER.findElement(_lblPriceSBC); }


    public void checkPrice() {
        getLnkCheckPrice().click();
    }

    public String setLblPriceHS() {
        return this.getLblPriceHS().getText();
    }
    public String setLblPriceSS() {
        return this.getLblPriceSS().getText();
    }
    public String setLblPriceSSC() {
        return this.getLblPriceSSC().getText();
    }
    public String setLblPriceHB() {
        return this.getLblPriceHB().getText();
    }
    public String setLblPriceSB() {
        return this.getLblPriceSB().getText();
    }
    public String setLblPriceSBC() {
        return this.getLblPriceSBC().getText();
    }
}
