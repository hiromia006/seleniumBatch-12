package seleniumTest.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(3000);
        // Using Actions class to move to the first name field and enter text
        Actions act = new Actions(driver);

        WebElement firstNameField = driver.findElement(By.id("firstname"));
        act.moveToElement(firstNameField).perform();
        firstNameField.sendKeys("John");
        Thread.sleep(1000);

        WebElement lastNameField = driver.findElement(By.id("lastname"));
        act.moveToElement(lastNameField).perform();
        lastNameField.sendKeys("Doe");
        Thread.sleep(1000);


        WebElement usernameField = driver.findElement(By.id("username"));
        act.moveToElement(usernameField).perform();
        usernameField.sendKeys("doe123");
        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.id("password"));
        act.moveToElement(passwordField).perform();
        passwordField.sendKeys("password123");
        Thread.sleep(1000);

        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        act.moveToElement(registerButton).click().perform();
        Thread.sleep(3000);

//        driver.findElement(By.id("firstname")).sendKeys("John");
//        driver.findElement(By.id("lastname")).sendKeys("Doe");
//        driver.findElement(By.id("username")).sendKeys("doe123");
//        driver.findElement(By.id("password")).sendKeys("password123");
//
//        driver.findElement(By.cssSelector("input[value='Register']")).click();

        driver.quit();
    }
}
