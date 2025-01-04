package first_cry.first_cry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class purchase {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://firstcrystore.in/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

}
	@Test(priority=2)
	void account() {
		WebElement img1 = driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		img1.click();
	}
	@Test(priority=3)
	
	void email() {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("npandey3670@gmail.com");
	}
@Test(priority=4)
	
	void password() {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Qwe345rty678@1");
		
		
	}
@Test(priority=5)

void submit() throws InterruptedException {
	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	Thread.sleep(2000);
	Alert SS = driver.switchTo().alert();
	SS.accept();
	Thread.sleep(2000);
	
}

	
	@Test(priority=6)
	void accessories() {
		WebElement img1 = driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
		img1.click();
	}
	
	
	@Test(priority=7)
	void ac1() throws InterruptedException {
		WebElement img1 = driver.findElement(By.xpath("//li[normalize-space()='Babyhug Car Seat']"));
		img1.click();
		Thread.sleep(2000);
	}
	@Test(priority=8)
	void ac21() throws InterruptedException{
		WebElement img1 = driver.findElement(By.xpath("//div[@class='text']"));
		img1.click();
		Thread.sleep(2000);
	}

//	@Test(priority=9)
//	void ac31() throws InterruptedException{
//		WebElement img1 = driver.findElement(By.xpath("(//button[@class=\"btn  cart-btn\"])[1]"));
//		img1.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//	}
//	@Test(priority=10)
//	void ac32() throws InterruptedException{
//		WebElement img1 = driver.findElement(By.xpath("(//button[@class=\"btn  cart-btn\"])[3]"));
//		img1.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//	
//}
//}
	
	
	
	@Test(priority=9)
void ac31(){
		WebElement img1 = driver.findElement(By.xpath("//body/div[@id='root']/div/div[contains(@class,'product')]/div/div[contains(@class,'Active Product-list-card-container')]/div[1]/div[1]/div[1]"));
		img1.click();
		
	}
	
	
	
		@Test(priority=10)
	void ac32(){
	WebElement img1 = driver.findElement(By.xpath("//body/div[@id='root']/div/div[contains(@class,'product')]/div/div[contains(@class,'Active Product-list-card-container')]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		img1.click();
		
	}
		
		@Test(priority=11)
		void ac33() throws InterruptedException{
			WebElement img1 = driver.findElement(By.xpath("//a[@href='#/productcart']"));
			img1.click();
			Thread.sleep(2000);
			
			WebElement img2 = driver.findElement(By.xpath("//i[@class='fa fa-times']"));
			img2.click();
			Thread.sleep(2000);
	
		
		
}
		
		@Test(priority=12)
		void ac34(){
			WebElement img1 = driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
			img1.click();
		
}
		@Test(priority=13)
		void ac35(){
			WebElement img1 = driver.findElement(By.xpath("//input[@placeholder='John']"));
			img1.sendKeys("Neha");
			
			WebElement img2 = driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
			img2.sendKeys("npandey3670@gmail.com");
			
			WebElement img3 = driver.findElement(By.xpath("//input[@name='addressLine1']"));
			img3.sendKeys("krishna vihar kusumkhera");
			
			WebElement img4 = driver.findElement(By.xpath("//input[@name='city']"));
			img4.sendKeys("New York");
			
			WebElement img5 = driver.findElement(By.xpath("//input[@placeholder='123']"));
			img5.sendKeys("983292");
			
			WebElement img6 = driver.findElement(By.xpath("//input[@placeholder='Doe']"));
			img6.sendKeys("NTGP");
			WebElement img7 = driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
			img7.sendKeys("32892389238293");
			WebElement img8 = driver.findElement(By.xpath("//input[@name='addressLine2']"));
			img8.sendKeys("kk");
			
			WebElement img9 = driver.findElement(By.xpath("//input[@name='state']"));
			img9.sendKeys("UK");
			
			WebElement img10 = driver.findElement(By.xpath("//input[@id='directcheck']"));
			img10.click();
			
			
		}	
		@AfterTest
		void close() {
			driver.quit();
		}
		}

//
//	@Test(priority=13)
//	void ac2() {
//		WebElement img2 = driver.findElement(By.xpath("//a[(@href='#/productdetails')]"));
//		Actions a= new Actions(driver);
//		a.moveToElement(img2).perform();
//		
//	img2.click();
//	}}
	
	
	
	



