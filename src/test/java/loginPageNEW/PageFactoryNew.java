package loginPageNEW;

import org.openqa.selenium.WebDriver;

public class PageFactoryNew {
    WebDriver driver;
    private LogInPage loginPageNew;
    public PageFactoryNew(WebDriver driver)
    {
        this.driver = driver;

    }
    public LogInPage getLoginPage()
    {
        if (loginPageNew == null) {
            loginPageNew = new LogInPage(driver);
        }
        return loginPageNew;
    }
}
