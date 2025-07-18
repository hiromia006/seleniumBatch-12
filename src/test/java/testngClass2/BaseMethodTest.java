package testngClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseMethodTest {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();

    }
}
