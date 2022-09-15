package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReportTest extends Baseclass {
    @Test

    public void reportClick() throws InterruptedException, IOException {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getReport().clickReport();
        pageFactoryNew.getLoginPage().newLogOut();
    }

}
