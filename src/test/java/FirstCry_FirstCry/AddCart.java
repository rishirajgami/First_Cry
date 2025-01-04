package FirstCry_FirstCry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddCart {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	
	
	void Navigation()  {
		driver.get("https://firstcrystore.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test(priority=-2)
	void account() {
		
	     
		WebElement account=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
	     account.click();
	}
	
	@Test(priority=-1)
	void username() {
       	WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("asmit98sharma@gmail.com");
	}
	@Test(priority=0)
		void password() {
			
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Asmit@123#");
		}
	@Test(priority=1)
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

	
	@Test(priority=2)
	void goToCart() {
		WebElement cart=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
		cart.click();
	}
	@Test(priority=3)
	void goToCategory() {
		WebElement item=driver.findElement(By.xpath("//div[@class='header']//div[4]"));
		 Actions actions= new Actions(driver);
		 actions.moveToElement(item).perform();
		 
		 WebElement subitem= driver.findElement(By.xpath("//div[@class='header']//div[4]//div[@style=\"visibility: hidden;\"]//li"));
		 subitem.click();
		
	}
	@Test(priority=4)
	void GoAddToCart() {
		WebElement addcart= driver.findElement(By.xpath("//button[@class=\"btn cart-btn\"]"));
		addcart.click();
	}
	@Test(priority=5)
	void Productdetails() {
		WebElement productdetails=driver.findElement(By.xpath("//h3[contains(text(),'Luv Lap C50 Wooden Baby Cot with Mosquito Net - Ch')]"));
		
		if(productdetails.getText().equals("Luv Lap C50 Wooden Baby Cot with Mosquito Net - Ch"));
		{
			System.out.println("success");
		}
	}
		@Test(priority=6)
		void AddToCart() {
			WebElement addbutton= driver.findElement(By.xpath("//a[@href='#/productcart']"));
			addbutton.click();
			
		}
		@Test(priority=7)
		void Checkout() {
			WebElement checkout= driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary font-weight-bold my-3 py-3 ripple-surface']"));
			checkout.click();
		}
		
		@AfterTest
		void Close() {
			driver.close();
			
		}
		
		
	

}
