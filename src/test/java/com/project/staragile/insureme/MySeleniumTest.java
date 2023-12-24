import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumTest {
    public static void main(String[] args) {
        // Set system property to point to chromedriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Your Selenium test code
        // Example: driver.get("https://www.example.com");

        // Close the browser window
        driver.quit();
    }
}
