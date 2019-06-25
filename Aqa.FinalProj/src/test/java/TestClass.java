import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Scanner;

public class TestClass {
    private WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void before(String browser) {
        driver = WebDriverFactory.createDriver(browser);

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

    @Test
    private void

}