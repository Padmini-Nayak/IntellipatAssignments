package browserAutomation.module3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// Chrome Browser
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://netbanking.hdfcbank.com/netbanking/";
		// Launch the URL
		driver.get(URL);

		// Maximize the window
		driver.manage().window().maximize();

		System.out.println("The title of the page is " + driver.getTitle());

		// Click on Know More link
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("Know More...")).click();

		// Switching to the window
		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();
		for (Iterator iterator = windows.iterator(); iterator.hasNext();) {
			String childWindow = (String) iterator.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("The  title child window " + driver.getTitle());

			}

		}
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("The  title parent window " + driver.getTitle());
		driver.close();
		driver.quit();

	}

}
