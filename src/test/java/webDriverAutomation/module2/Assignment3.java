package webDriverAutomation.module2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// Firefox driver
		System.setProperty("windows.firefox.driver", "C://WebDrivers//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String URL = "https://www.google.com/";

		// Launch URL
		driver.get(URL);

		// Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Print the title
		System.out.println("The title of the page is " + driver.getTitle());

		// close the browser
		driver.quit();

	}

}
