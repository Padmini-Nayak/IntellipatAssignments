package browserAutomation.module3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("windows.firefox.driver", "C://WebDrivers//geckodriver.exe");

		// Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

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
				Thread.sleep(2000);
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
