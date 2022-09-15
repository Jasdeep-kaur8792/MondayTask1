package loginPageNEW;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContentManagement {
    WebDriver driver;
    WebDriverWait wait;

    By clickOnContentManagement = By.xpath("(//li[@class='nav-item has-treeview'])[6]");
    By clickOnTopic = By.xpath("(//i[@class='nav-icon far fa-dot-circle'])[24]");
    By clickOnAddButton=By.xpath("//a[@class='btn btn-primary']");
    By enterInTitleTextField = By.xpath("(//input[contains(text(),'')])[7]");
    By clickOnSaveButton= By.xpath("(//button[@name='save'])");


    public ContentManagement(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void contentManagement() throws InterruptedException {
        driver.findElement(clickOnContentManagement).click();
        driver.findElement(clickOnTopic).click();
        driver.findElement(clickOnAddButton).click();
        driver.findElement(enterInTitleTextField).sendKeys("Blog.BlogComment");
        driver.findElement(clickOnSaveButton).click();

    }

}
