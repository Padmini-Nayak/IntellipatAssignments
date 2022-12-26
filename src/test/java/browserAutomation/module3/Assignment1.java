package browserAutomation.module3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args)  {

		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		// Chrome driver
		WebDriver driver = new ChromeDriver();

		String URL = "https://netbanking.hdfcbank.com/netbanking/";

		// Launch URL
		driver.get(URL);
		// maximize the window
		driver.manage().window().maximize();
		// Title of the page
		System.out.println("The  title of the page is  " + driver.getTitle());
		

		driver.switchTo().frame("login_page");
		// Click on Know More link text
		driver.findElement(By.linkText("Know More...")).click();

		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for (Iterator iterator = windows.iterator(); iterator.hasNext();) {
			String childWindow = (String) iterator.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("The  title child window " + driver.getTitle());
			}

		}

		driver.switchTo().window(parentWindow);
		System.out.println("The  title parent window " + driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// close the browser
		driver.quit();

	}

}
