package testCases;
	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class TC03_ChromeBrowserAlert {
    public static void main(String[] args) {
        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Use a HashMap to store the preference for notifications
        Map<String, Object> prefs = new HashMap<String, Object>();
        // Set the default notification setting to "2" which means "Block"
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Add the preference to the ChromeOptions
        options.setExperimentalOption("prefs", prefs);

        // Initialize the ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the URL
        driver.get("https://techmahindra460-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home");
        
        // The rest of your test script...
        // driver.quit();
    }
}