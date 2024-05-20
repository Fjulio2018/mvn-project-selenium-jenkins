package org.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FireFoxTesting extends AbstracHomePage {

    @BeforeAll
    static void setupClass() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();

    }

    @BeforeTest
    void setUp() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
}
