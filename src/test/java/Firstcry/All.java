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

public class All {

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
	
	@Test(priority=3)
	void Accessories() {
		WebElement ACS=driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
		Actions a=new Actions(driver);
		a.moveToElement(ACS).perform();
		WebElement BP=driver.findElement(By.xpath("//li[normalize-space()='Breast Pump']"));
		BP.click();
		
		driver.navigate().refresh();
	}
	
	
	@Test(priority=4)
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
	
	@Test(priority=5)
	void checkout() {
		
		WebElement COUT=driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
		COUT.click();


	}
		@Test(priority=6)
		void BillingAddress() {
			
			WebElement FN=driver.findElement(By.xpath("//input[@placeholder='John']"));
			FN.sendKeys("Amit");
			WebElement LN=driver.findElement(By.xpath("//input[@placeholder='Doe']"));
			LN.sendKeys("Jain");
			WebElement Email=driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
			Email.sendKeys("Jain@gmail.com");
			WebElement Add1=driver.findElement(By.xpath("//input[@name='addressLine1']"));
			Add1.sendKeys("Test123");
			WebElement Add2=driver.findElement(By.xpath("//input[@name='addressLine2']"));
			Add2.sendKeys("Test123GUJ");
			WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
			City.sendKeys("NewYork");
			WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
			State.sendKeys("USA");
			WebElement ZIP=driver.findElement(By.xpath("//input[@placeholder='123']"));
			ZIP.sendKeys("23855");
			WebElement MONUM=driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
			MONUM.sendKeys("213654789");
			}
		
		@Test(priority=7)
		void payment() throws InterruptedException {
			WebElement COD=driver.findElement(By.xpath("//input[@id='directcheck']"));
			
			//Actions a=new Actions(driver);
			//a.moveToElement(COD).perform();
			COD.click();
			
			Thread.sleep(2000);
			WebElement PO=driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary font-weight-bold py-3\"]"));
			
			PO.click();									
			//Thread.sleep(3000);
			Alert a=driver.switchTo().alert();
			a.accept();
			
		}



}
