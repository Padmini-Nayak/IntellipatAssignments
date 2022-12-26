
package webDriverAutomation.module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		//Setting the environment variables
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		System.setProperty("windows.firefox.driver", "C://WebDrivers//geckodriver.exe");
		System.setProperty("windows.ie.driver", "C://WebDrivers//IEDriverServer.exe");

		//Initializing the drivers
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver ffDriver = new FirefoxDriver();
		WebDriver ieDriver=new InternetExplorerDriver();
		
		// URL to test
		String URL = "https://www.google.com/";
		
		//Launch URL on Chrome
		chromeDriver.get(URL);
		Thread.sleep(2000);
		chromeDriver.quit();
		
		//Launch URL on firefox
		ffDriver.get(URL);
		Thread.sleep(2000);
		//ffDriver.quit();
		
		//Launch URL on Internet Explorer
		ieDriver.get(URL);
		Thread.sleep(2000);
		ieDriver.quit();


	}

}
