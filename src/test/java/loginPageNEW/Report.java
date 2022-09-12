package loginPageNEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report {
    WebDriver driver;
    By clickReport = By.xpath("(//*[@class='nav-link active'])[1]");
    By clickLowStock = By.xpath("(//a[@class='nav-link active'])[2]");

    public Report(WebDriver driver) {
        this.driver = driver;
    }
    public void clickReport() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(clickReport).click();
        driver.findElement(clickLowStock).click();
    }

}
