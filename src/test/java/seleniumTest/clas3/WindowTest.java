package seleniumTest.clas3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000); // Wait for 3 seconds to allow the browser to launch
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        // Implicit wait is set to 30 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("Main page is: " + driver.findElement(By.id("browserWindows")).getText());

        System.out.println("=============================");
        String mainWindowHandle = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demoqa.com/sample");
        System.out.println("Title of the new Window is: " + driver.getTitle());
        System.out.println("New Window URL is: " + driver.getCurrentUrl());
        Thread.sleep(3000); // Wait for 3 seconds to observe the new tab
        //close the new tab
        driver.close();
        Thread.sleep(3000); // Wait for 3 seconds to observe the new tab

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Back to main window title: " + driver.getTitle());
        System.out.println("Back to main window URL: " + driver.getCurrentUrl());
        driver.quit();

    }
}
