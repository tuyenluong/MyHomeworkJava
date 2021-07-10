package SeleniumChapter4comma3;

import Pages.EmailSentPage;
import Pages.ForgetPasswordPage;
import SeleniumChapter4BaseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTest {
    @Test
    public void testRetrievePassword(){
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPassword();
        EmailSentPage emailSentPage = forgetPasswordPage.retrievePassword("tuyen@gmail.com");
        assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!","Message is incorrect");
    }

}
