package FirstCry;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkout {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver.exe";

	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void Navigate() {
		
		driver.manage().window().maximize();
		driver.get("https://firstcrystore.in/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Test(priority=1)
void checkout() {
	
	WebElement COUT=driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
	COUT.click();


}
	@Test(priority=1)
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
		Add2.sendKeys("NewYork");
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		Add2.sendKeys("USA");
		WebElement ZIP=driver.findElement(By.xpath("//input[@placeholder='123']"));
		Add2.sendKeys("23855");
		WebElement MONUM=driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
		MONUM.sendKeys("213654789");
		}
	
	@Test(priority=2)
	void payment() throws InterruptedException {
		WebElement COD=driver.findElement(By.xpath("//input[@id='directcheck']"));
		COD.click();
		WebElement PO=driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary font-weight-bold py-3 ripple-surface']"));
		PO.click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
}
