package seleniumTest.clas3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000); // Wait for 3 seconds to allow the browser to launch
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        // Implicit wait is set to 30 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Main page is: " + driver.findElement(By.cssSelector(".text-center")).getText());

        // Switch to the first frame using its id
        driver.switchTo().frame("frame1");
        System.out.println("First frame is: " + driver.findElement(By.id("sampleHeading")).getText());
//        Thread.sleep(3000); // Wait for 3 seconds to observe the output in the first frame
        // Switch back to the main content
        driver.switchTo().defaultContent();

        System.out.println("Back to Main page is: " + driver.findElement(By.id("framesWrapper")).getText());

        // Switch to the second frame using its index
        driver.switchTo().frame("frame2");
        System.out.println("Second frame is: " + driver.findElement(By.id("sampleHeading")).getText());
//        Thread.sleep(3000); // Wait for 3 seconds to observe the output in the second frame
        // Switch back to the main content
        driver.switchTo().defaultContent();

        System.out.println("Second Time Back to Main page is: " + driver.findElement(By.id("framesWrapper")).getText());


        driver.quit();

    }
}
