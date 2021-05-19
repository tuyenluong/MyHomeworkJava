package SeleniumChapter2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

    private WebDriver driver;

    public static void main(String[] args) {
        GetTitle test = new GetTitle();
        test.setup();
    }

    public void setup() {
        WebDriverManager.chromedriver().driverVersion("88.0.4324.96").setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
        //driver.quit();
    }
}