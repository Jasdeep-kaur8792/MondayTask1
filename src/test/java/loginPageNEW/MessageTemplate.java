package loginPageNEW;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessageTemplate {
    WebDriver driver;

    WebDriverWait wait;

    By clickOnMessageTemplate = By.xpath("//p[contains(text(),' Message templates')]");
    By searchTextField=By.xpath("//input[@class='form-control text-box single-line']");
    By search = By.xpath("//button[@class='btn btn-primary btn-search']");
    By BlogComment = By.xpath("//td[contains(text(),'Blog.BlogComment')]");

    By clickOnContentManagement = By.xpath("(//li[@class='nav-item has-treeview'])[6]");


    public MessageTemplate(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void messageTemplate() throws InterruptedException {
         driver.findElement(clickOnContentManagement).click();
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),' Message templates')]"))));
         driver.findElement(clickOnMessageTemplate).click();
         driver.findElement(searchTextField).sendKeys("Blog.BlogComment");
         driver.findElement(search).click();
         Thread.sleep(3000);
         String actual = driver.findElement(BlogComment).getText();
         Assert.isTrue(actual.equals("Blog.BlogComment"), "Expected result does not match with actual result");
    }
}
