package browserAutomation.module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		// Chrome driver
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.google.com/";

		// Launch URL
		driver.get(URL);

		// maximize the window
		driver.manage().window().maximize();

		// Title of the page
		System.out.println("The  URL of the page is = " + driver.getCurrentUrl());
		Thread.sleep(2000);
		
		// Navigate to the URL
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println("The  URL of the page is after navigating to it =  " + driver.getCurrentUrl());
		Thread.sleep(2000);
		
		// Navigate back to the URL
		driver.navigate().back();
		System.out.println("The  URL of the page is after navigating back  =  " + driver.getCurrentUrl());
		Thread.sleep(2000);
		
		// Navigate one step forward to the URL
		driver.navigate().forward();
		System.out.println("The  URL of the page is after navigating forward  =  " + driver.getCurrentUrl());
		Thread.sleep(2000);
		
		// Refresh the page
		driver.navigate().refresh();
		System.out.println("The  URL of the page is after  refreshing  =  " + driver.getCurrentUrl());

		driver.close();

		driver.quit();
	}

}
