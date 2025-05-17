package seleniumTest.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         // This line is commented out as it's not needed with implicit wait

        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.quit();
    }
}
