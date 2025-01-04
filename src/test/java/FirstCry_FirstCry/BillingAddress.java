package FirstCry_FirstCry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BillingAddress {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void Navigation()  {
		driver.get("https://firstcrystore.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	
	
	
	void Firstname() {
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='John']"));
		fname.sendKeys("Saurabh");
		}
	
	void Lastname() {
		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Doe']"));
		lname.sendKeys("Bhatia");
		}
	
	void Email() {
		WebElement emai=driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
		emai.sendKeys("sau@12gmail.com");
	}
	void Contact() {
		WebElement phn=driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
		phn.sendKeys("5467987654");
		}
	void Add1() {
		WebElement add1= driver.findElement(By.xpath("//input[@name='addressLine1']"));
		add1.sendKeys("bhvejhvbehjrbjehvb");
		}
	
	void Add2() {
		WebElement add2=driver.findElement(By.xpath("//input[@name='addressLine2']"));
		add2.sendKeys("vbejhdcvbhed");
	}
	void City() {
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("kanpur");
	}
	void State() {
		WebElement state= driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("UttarPradesh");
		}
	
	void ZipCode() {
		WebElement zip=driver.findElement(By.xpath("//input[@placeholder='123']"));
		zip.sendKeys("67890");
	}
	
	void SubmitDetail() throws InterruptedException {
		WebElement adddetails= driver.findElement(By.xpath("//button[@class='edit-submit-btn']"));
		adddetails.click();
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
