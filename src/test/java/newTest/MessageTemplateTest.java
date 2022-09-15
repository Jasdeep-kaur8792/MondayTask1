package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

import java.io.IOException;

public class MessageTemplateTest extends Baseclass {
    @Test

    public void verifyMessageTemplate() throws InterruptedException, IOException {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getContentManagement().contentManagement();
        pageFactoryNew.getMessageTemplate().messageTemplate();
        pageFactoryNew.getLoginPage().newLogOut();
    }
}
