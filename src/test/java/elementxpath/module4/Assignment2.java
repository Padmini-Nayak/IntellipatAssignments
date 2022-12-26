package elementxpath.module4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		// Chrome driver
		WebDriver driver = new ChromeDriver();

		String URL = "https://profile.oracle.com/myprofile/account/create-account.jspx";

		// Launch URL
		driver.get(URL);
		// maximize the window
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
		//Create the new account
//		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("dviti1921@gmail.com");
//		
//		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Hard123456pwd!");
//		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Hard123456pwd!");
//		Thread.sleep(2000);
//		Select country = new Select(driver.findElement(By.id("sView1:r1:0:country::content")));
//		country.selectByValue("IN");
//		
//		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Dviti");
//		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Nayak");
////		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Softwar Engineer");
////		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("75684903875");
////		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("Oracle");
////		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Address1");
////		driver.findElement(By.id("sView1:r1:0:address2::content")).sendKeys("Address2");
////		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Bengaluru");
//		
//		Select state = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
//		state.selectByValue("16");
//		
//		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("578392");
//		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement createButton  = driver.findElement(By.xpath("//a/span[contains(text(),'Create Account')]"));
		js.executeScript("arguments[0].click()", createButton);
	//	driver.findElement(By.xpath("//a/span[contains(text(),'Create Account')]"));
		//Thread.sleep(2000);
		//driver.close();
		
	}

}