package SeleniumChapter4;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import SeleniumChapter4BaseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!")
                ,"Alert text in incorrect");
    }
}
