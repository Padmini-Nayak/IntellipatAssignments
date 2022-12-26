package elementxpath.module4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		// Chrome driver
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.facebook.com/";

		// Launch URL
		driver.get(URL);
		// maximize the window
		driver.manage().window().maximize();
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("testName");
		driver.findElement(By.name("lastname")).sendKeys("testLastName");
		driver.findElement(By.name("reg_email__")).sendKeys("dhaatri1921@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Hard123456pwd!");
		
		Select dropDownday = new Select(driver.findElement(By.name("birthday_day")));
		dropDownday.selectByValue("21");
		
		Select dropDownMonth = new Select(driver.findElement(By.name("birthday_month")));
		dropDownMonth.selectByValue("11");
		
		//Purposely giving unacceptable year so that it does not submit and create the account
		Select dropDownYear = new Select(driver.findElement(By.name("birthday_year")));
		dropDownYear.selectByValue("2021");
		
		driver.findElement(By.xpath("//*[text()=\"Female\"]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
