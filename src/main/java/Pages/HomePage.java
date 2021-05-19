package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLick("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLick("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLick(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
