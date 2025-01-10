package FirstCry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Add_To_Cart {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver.exe";

	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void Navigate() {
		
		driver.manage().window().maximize();
		driver.get("https://firstcrystore.in/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Test(priority=1)
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
	@Test(priority=2)
	void Accessories() {
		WebElement ACS=driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
		Actions a=new Actions(driver);
		a.moveToElement(ACS).perform();
		WebElement BP=driver.findElement(By.xpath("//li[normalize-space()='Breast Pump']"));
		BP.click();
		
		driver.navigate().refresh();
	}
	
	
	@Test(priority=3,enabled=false)
	void AddToCart() {  
		WebElement ATC=driver.findElement(By.xpath("(//button[@class=\"btn  cart-btn\"])[1]"));
		ATC.click();
		WebElement ATC1=driver.findElement(By.xpath("//a[@href='#/productcart']"));
		ATC1.click();
		WebElement INC=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		INC.click();
		INC.click();
		INC.click();
		}
	@Test(priority=4)
	void ATC1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ATC2=driver.findElement(By.xpath("//body/div[@id='root']/div/div[@class='product']/div/div[@class='Active Product-list-card-container']/div[2]/div[1]/div[1]"));
		//driver.switchTo().frame(ATC2);
		Actions a=new Actions(driver);
		a.moveToElement(ATC2).perform();
		//Thread.sleep(2000);
		WebElement ATC3=driver.findElement(By.xpath("//body/div[@id='root']/div/div[@class='product']/div/div[@class='Active Product-list-card-container']/div[1]/div[1]/div[1]/div[1]/a[1]"));
		ATC3.click();
		
	}
}
