package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogInTestNew extends Baseclass {
    @Test

    public void start() throws InterruptedException, IOException {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getReport().clickReport();
        pageFactoryNew.getLoginPage().newLogOut();
    }


}
