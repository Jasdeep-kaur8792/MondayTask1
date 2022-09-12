package loginPageNEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report {
    WebDriver driver;
    By clickReport = By.xpath("(//*[@class='nav-link active'])[1]");

    public Report(WebDriver driver) {
        this.driver = driver;
    }
    public void clickReport()  {
        driver.manage().window().maximize();
        driver.findElement(clickReport).click();
    }

}
