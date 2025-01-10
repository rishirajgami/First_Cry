package FirstCry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver.exe";

	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void Navigate() {
		
		driver.manage().window().maximize();
		driver.get("https://firstcrystore.in/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1,enabled=false)
	void account() {
		WebElement Account=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		Account.click();
		WebElement CreateAccount=driver.findElement(By.xpath("//a[normalize-space()='Create Account']"));
		CreateAccount.click();
		WebElement FN=driver.findElement(By.xpath("//input[@name='firstname']"));
		FN.sendKeys("Test007");
		WebElement LN=driver.findElement(By.xpath("//input[@name='lastname']"));
		LN.sendKeys("Tst");	
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("Tst@gmail.com");
		WebElement PSW=driver.findElement(By.xpath("//input[@name='password']"));
		PSW.sendKeys("Tst@123");
		WebElement CPSW=driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		CPSW.sendKeys("Tst@123");
		WebElement SIGNIN=driver.findElement(By.xpath("//button[@class=\"submit-btn\"]"));
		SIGNIN.click();//unable to click
		}
	@Test(priority=2)
	void login() throws InterruptedException {
		WebElement Account=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		Account.click();
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("Tst@gmail.com");
		WebElement PSW=driver.findElement(By.xpath("//input[@name='password']"));
		PSW.sendKeys("Tst@123");
		WebElement SIGNIN=driver.findElement(By.xpath("//button[@type='submit']"));
		SIGNIN.click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
		
	}
	
	
}
