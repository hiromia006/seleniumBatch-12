package testngClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseAnnotationClassTest {
    WebDriver driver;

    @BeforeClass
    public void setupBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();

    }
}
