package testngClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassAnnotationTest extends BaseClassTest {
    @Test(priority = 0)
    public void testDoubleClick4() {
        // Navigate to the practice page for buttons
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");

        new Actions(driver)
                .doubleClick(driver.findElement(By.cssSelector(".btn.btn-success")))
                .perform();
        String txt = driver.findElement(By.id("doublec")).getText().trim();
        Assert.assertEquals(txt, "You have Double clicked");
    }


    @Test(priority = 1)
    public void checkPageTittle5() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        String title = driver.getTitle().trim();
        Assert.assertEquals(title, "Selenium Practice - Buttons");

    }

    @Test(priority = 2)
    public void validatePageUrl6() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        String url = driver.getCurrentUrl().trim();
        Assert.assertEquals(url, "https://www.tutorialspoint.com/selenium/practice/buttons.php");

    }
}
