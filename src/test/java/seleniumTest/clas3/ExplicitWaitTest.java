package seleniumTest.clas3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        // Explicit wait is set to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        // Trigger a JavaScript alert 10:20:30 --> 10:20:32
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("alertButton")));
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        // Switch to the alert and accept it
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        // Trigger a confirmation alert 10:20:38 --> 10:20:40
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        // Switch to the confirmation alert and accept it
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        // Trigger a prompt alert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.alertIsPresent());
        // Switch to the prompt alert, send text, and accept it
        Alert alt = driver.switchTo().alert();
        alt.sendKeys("Hello, this is a prompt alert!");
        System.out.println("Prompt alert text sent." + alt.getText());
        alt.accept();
        Thread.sleep(3000);

        driver.quit();

    }
}
