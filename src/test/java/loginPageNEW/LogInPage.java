package loginPageNEW;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogInPage {
    WebDriver driver;

    By emailInput =By.xpath("//input[@name='Email']");
    By passwordInput = By.xpath("//input[@class='password']");
    By submit = By.xpath("//button");
    By logOut = By.xpath("//a[contains(text(),'Logout')]");


    public LogInPage(WebDriver driver) {

        this.driver = driver;
    }

    public void newLogIn() throws IOException
    {
        String path = System.getProperty("user.dir")+"//src//test//java//TestData//TestData.xls";
        FileInputStream prop1 = null;
        try
        {
            prop1 = new FileInputStream(path);
        }
        catch(FileNotFoundException e)
        {e.printStackTrace();
        }

        HSSFWorkbook wb = new HSSFWorkbook(prop1);
        HSSFSheet sheet = wb.getSheet("Sheet1");
        String email = sheet.getRow(1).getCell(0).getStringCellValue();
        String  password = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(emailInput).clear();
        driver.findElement(passwordInput).clear();
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(submit).click();
    }
    public void newLogOut()
    {
        driver.findElement(logOut).click();
    }
}
