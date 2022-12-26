package webDriverAutomation.module2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		//Chrome driver 
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.google.com/";		
		
		//Launch URL
		driver.get(URL);
		
		//Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Print the title
		System.out.println("The title of the page is "+driver.getTitle());
		
		//close the browser
		driver.quit();

	}

}
