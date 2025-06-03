package seleniumTest.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionApiTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(300);
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        driver.findElement(By.id("Xtk1k")).click();
//        Thread.sleep(3000);

        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();

        Thread.sleep(3000);
        act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        Thread.sleep(3000);

        driver.quit();

    }
}
