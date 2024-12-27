package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Toys {
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
	void toys() {
		WebElement t=driver.findElement(By.xpath("//div[@class=\"top-age hover-product-list y-gap\"]"));
		t.click();
}
	@Test (priority=6)
	void baby_housetoy() {
		WebElement bh=driver.findElement(By.xpath("//li[normalize-space()='Baby House Toy']"));
		bh.click();
	}
	
	@Test (priority=7)
	void baby_mooplaytime() {
		WebElement bmp=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/button[1]"));
		bmp.click();
	}
	
	@Test (priority=8)
	void add_tocart() throws InterruptedException {
		WebElement ac=driver.findElement(By.xpath("//a[@href='#/productcart']"));
		ac.click();
		Thread.sleep(2000);
		
}

	@Test (priority=9)
	void proceed_tocheckout() {
		WebElement pc=driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
		pc.click();
		
}
	
	  @Test (priority=10)
	    void first_name() {
			WebElement fn=driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		    fn.sendKeys("Palak");
		    
}
	    
	    @Test (priority=11)
		void last_name() {
			WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Doe']"));
		    ln.sendKeys("Shukla");

}
		
		@Test (priority=12)
		void email_id() {
			WebElement ei=driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
		    ei.sendKeys("palakshukla@gmail.com");
}
		
		@Test (priority=13)
		void mobile() {
			WebElement m=driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
		    m.sendKeys("8303043230");
}
		
		@Test (priority=14)
		void address_line1() {
			WebElement al=driver.findElement(By.xpath("//input[@name='addressLine1']"));
		    al.sendKeys("Panki Kanpur");
		    
}
		
		@Test (priority=15)
		void address_line2() {
			WebElement a=driver.findElement(By.xpath("//input[@name='addressLine2']']"));
		    a.sendKeys("f block");
		    
}
		
		@AfterTest
		void Close() {
			driver.quit();
}
}