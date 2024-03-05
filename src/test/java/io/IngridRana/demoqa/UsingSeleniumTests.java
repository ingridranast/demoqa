package io.IngridRana.demoqa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSeleniumTests {
    @Test
    public void useSelenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.quit();
    }
}
