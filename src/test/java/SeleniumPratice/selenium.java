package SeleniumPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class selenium {
    private static WebDriverManager chromeDriverManager = new ChromeDriverManager();
    private static ChromeDriver driver;

    @BeforeAll
    static void beforTest() {
        chromeDriverManager.setup();
        driver = new ChromeDriver();
    }
    @AfterAll
    static void afterTest() {
        driver.close();
    }
    @Test
    public void checkTheTitle() {
        driver.get("https://www.talentnet.vn/");
        String home = "Homepage | Talentnet Vietnam";
        assertEquals(home, driver.getTitle());
    }
}