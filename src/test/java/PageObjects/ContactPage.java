package PageObjects;

import Common.Constant;

public class ContactPage extends BasePage {

    public ContactPage open() {
        Constant.DRIVER.navigate().to(Constant.CONTACT_PAGE_URL);
        return this;
    }
}
