import io.github.bonigarcia.wdm.WebDriverManager;
import org.TestNG.AbstracHomePage;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FireFoxTesting extends AbstracHomePage {



    @BeforeTest
    void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
}
