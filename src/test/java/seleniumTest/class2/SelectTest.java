package seleniumTest.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000); // Wait for 3 seconds to see the selection
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        // Implicit wait is set to 30 seconds
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));


        Select sel = new Select(driver.findElement(By.name("country")));
        // Select by visible text
        sel.selectByVisibleText("AMERICAN SAMOA");
        Thread.sleep(3000); // Wait for 3 seconds to see the selection

        // Select by index
        sel.selectByIndex(7); // Uncomment to select by index
        Thread.sleep(3000); // Wait for 3 seconds to see the selection
        // Select by value
        sel.selectByValue("ARMENIA"); // Uncomment to select by value

        Thread.sleep(3000); // Wait for 3 seconds to see the selection

        // Print the selected option
        List<WebElement> elements = sel.getOptions();
        for (WebElement el : elements) {
            System.out.println("Selected option: " + el.getText());

        }

        driver.quit();
    }
}
