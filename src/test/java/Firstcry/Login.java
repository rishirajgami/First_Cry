package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void n() throws InterruptedException {
	driver.get("https://firstcrystore.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Test (priority=1)
	void account() {
		WebElement ac=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		ac.click();
	}
	
	@Test (priority=2)
	void email() {
		WebElement e=driver.findElement(By.xpath("//input[@name='email']"));
		e.sendKeys("palakshukla3230@gmail.com");
}
    @Test (priority=3)
	void pass() {
		WebElement ps=driver.findElement(By.xpath("//input[@name='password']"));
		ps.sendKeys("Akash@123");
}
    @Test (priority=4)
    void sign() throws InterruptedException {
		WebElement s=driver.findElement(By.xpath("//button[@type='submit']"));
		s.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
    }
    
    
    @Test (priority=5)
    void zero_one() {
		WebElement z=driver.findElement(By.xpath("////img[@src=\"/static/media/0-1years.e53ee7c03b35428a4f4b.webp\"]"));
		z.click();
}
}