import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AbstracHomePage {
   public WebDriver driver;

    @Test
    void testTitilo() {
        driver.navigate().to("https://blog.testproject.io/");
        System.out.println("To Title: " + driver.getTitle());

    }

    @AfterTest
    void tearDown() {
        if (driver != null){
            driver.quit();
        }

    }
}
