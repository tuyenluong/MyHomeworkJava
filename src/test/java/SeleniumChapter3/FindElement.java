package SeleniumChapter3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindElement {
    private WebDriver driver;

    public static void main(String[] args) {
        FindElement test = new FindElement();
        test.setup();
    }

    public void setup() {
        WebDriverManager.chromedriver().driverVersion("88.0.4324.96").setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        //driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
        //driver.quit();
    }

}
