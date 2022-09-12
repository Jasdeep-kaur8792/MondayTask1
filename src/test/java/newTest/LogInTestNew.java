package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

public class LogInTestNew extends Baseclass {
    @Test

    public void start() throws InterruptedException
    {
        pageFactoryNew.getLoginPage().newLogIn();
    }


}
