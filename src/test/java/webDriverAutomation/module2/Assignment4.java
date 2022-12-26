package webDriverAutomation.module2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// Internet Explorer driver
		System.setProperty("windows.ie.driver", "C://WebDrivers//IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver();

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
