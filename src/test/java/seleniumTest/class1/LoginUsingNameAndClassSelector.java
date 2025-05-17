package seleniumTest.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginUsingNameAndClassSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        // Implicit wait is set to 30 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String txt = driver.findElement(By.className("login_logo")).getText();
        System.out.println("The text of the logo is: " + txt);


        // Using name selector to find the username and password fields
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // Using name selector to find the login button
        driver.findElement(By.name("login-button")).click();

        Thread.sleep(4000);
        driver.quit();
    }
}
