package org.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ChromeTesting extends AbstracHomePage {

    @BeforeAll
    static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();

    }


    @BeforeTest
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
}
