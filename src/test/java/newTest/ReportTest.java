package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

public class ReportTest extends Baseclass {
    @Test

    public void reportclick() throws InterruptedException
    {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getReport().clickReport();
        pageFactoryNew.getLoginPage().newLogOut();
    }

}
