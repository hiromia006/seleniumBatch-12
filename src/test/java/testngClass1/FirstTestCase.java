package testngClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestCase {

    @Test(priority = 0, enabled = false)
    public void testDoubleClick() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        new Actions(driver)
                .doubleClick(driver.findElement(By.cssSelector(".btn.btn-success")))
                .perform();

        String txt = driver.findElement(By.id("doublec")).getText().trim();
        Assert.assertEquals(txt, "You have Double clicked");

        driver.quit();
    }


    @Test(priority = 1, enabled = false)
    public void checkPageTittle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle().trim();

        Assert.assertEquals(title, "Selenium Practice - Buttons");

        driver.quit();
    }

    @Test(priority = 2)
    public void validatePageUrl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String url = driver.getCurrentUrl().trim();

        Assert.assertEquals(url, "https://www.tutorialspoint.com/selenium/practice/buttons.php");

        driver.quit();
    }
}
