package FirstCry_FirstCry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void Navigation()  {
		driver.get("https://firstcrystore.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test(priority=2)
	void account() {
		
	     
		WebElement account=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
	     account.click();
	}
	@Test(priority=3)
	void username() {
       	WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("asmit98sharma@gmail.com");
	}
	@Test(priority=4)
		void password() {
			
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Asmit@123#");
		}
	@Test(priority=5)
		void submit() throws InterruptedException {
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); 

		alert.accept();
		Thread.sleep(2000);
		
		}
	@AfterTest
	void Close() {
		driver.close();
		
	}
	
}
