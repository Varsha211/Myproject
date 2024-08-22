import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageTest {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the web page containing the search box and button
            driver.get("http://example.com");

            // Locate the search textbox by its ID (modify as needed)
            WebElement searchTextbox = driver.findElement(By.id("searchTextboxId"));
            // Locate the search button by its ID (modify as needed)
            WebElement searchButton = driver.findElement(By.id("searchButtonId"));

            // Verify that the search textbox is displayed
            if (searchTextbox.isDisplayed()) {
                System.out.println("Search textbox is present and displayed.");
            } else {
                System.out.println("Search textbox is NOT present.");
            }

            // Verify that the search button is displayed
            if (searchButton.isDisplayed()) {
                System.out.println("Search button is present and displayed.");
            } else {
                System.out.println("Search button is NOT present.");
            }

            // Optionally, you can also test if you can interact with the elements
            searchTextbox.sendKeys("Test search query");
            searchButton.click();

            // Add additional verification steps as needed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}