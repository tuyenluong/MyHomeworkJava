package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By inputEmail = By.id("email");

    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeEmail(String yourEmail){
        driver.findElement(inputEmail).sendKeys(yourEmail);
    }

    public EmailSentPage clickRetrievePassword(){
        driver.findElement(By.linkText("Retrieve password")).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email) {
        typeEmail(email);
        return clickRetrievePassword();
    }
}
