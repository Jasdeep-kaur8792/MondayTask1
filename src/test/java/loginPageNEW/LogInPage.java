package loginPageNEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    WebDriver driver;
    By submit = By.xpath("//button");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newLogIn()  {
        driver.manage().window().maximize();
        driver.findElement(submit).click();
    }
}
